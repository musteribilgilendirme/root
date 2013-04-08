package com.tazegevrek.mubsis.service.activiti.confirmation;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value="confirmationService")
public class ConfirmationServiceImpl implements ConfirmationService {

	private static String SERVICE_NAME = "SERVICE_NAME";
	private String VALIDATION_PROCESS_DEF_ID = "validation-process";
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private ApplicationContext applicationContext;

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void confirmTask(Map<String, Object> vars){
		String beanName = (String)vars.get(SERVICE_NAME);
		AsycConfirmation asyConfirmation = applicationContext.getBean(beanName, AsycConfirmation.class);
		Object dto = asyConfirmation.map2dto(vars);	
		asyConfirmation.confirm(dto);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void timeoutTask(Map<String, Object> vars){
		String beanName = (String)vars.get(SERVICE_NAME);
		AsycConfirmation asyConfirmation = applicationContext.getBean(beanName, AsycConfirmation.class);
		Object dto = asyConfirmation.map2dto(vars);	
		asyConfirmation.timeout(dto);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public String startAsycConfirmation(AsycConfirmation asyConfirmation, Object dto){
		Map<String, Object> vars = asyConfirmation.dto2map(dto);
		String bussinessKey = UUID.randomUUID().toString();
		vars.put(SERVICE_NAME, asyConfirmation.getBeanName());
		runtimeService.startProcessInstanceByKey(VALIDATION_PROCESS_DEF_ID ,bussinessKey, vars);
		return bussinessKey;
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public void confirmAsycConfirmation(String bussinessKey) {
		ProcessInstance procInst = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(bussinessKey).singleResult();
		
		boolean isConfirmationProcess = procInst.getProcessDefinitionId().contains(VALIDATION_PROCESS_DEF_ID);
		if(!isConfirmationProcess){
			throw new InvalidValidationProcess();
		}
		
		System.out.println(procInst.getProcessDefinitionId());
		List<Execution> executionList = runtimeService.createExecutionQuery().processInstanceId(procInst.getId()).signalEventSubscriptionName("alertSignal").list();
		runtimeService.signalEventReceived("alertSignal", executionList.get(0).getId());
	}
	
}
