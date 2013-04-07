package com.tazegevrek.mubsis.service.activiti;

import java.util.Map;


public interface ConfirmationService {

	String startAsycConfirmation(AsycConfirmation asyConfirmation, Object dto);

	void confirmAsycConfirmation(String bussinessKey);

	void timeoutTask(Map<String, Object> vars);

	void confirmTask(Map<String, Object> vars);

}
