package com.tazegevrek.mubsis.service.activiti;

import java.util.Map;

public interface AsycConfirmation<T> {

	public void timeout(T dto);
	public void confirm(T dto);
	public Map<String,Object> dto2map(T dto);
	public T map2dto(Map<String,Object> dto);
	public String getBeanName();
	
}
