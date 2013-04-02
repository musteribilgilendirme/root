package com.tazegevrek.mubsis.service.activiti;


public interface ConfirmationService {

	String startAsycConfirmation(AsycConfirmation asyConfirmation, Object dto);

	void confirmAsycConfirmation(String bussinessKey);

}
