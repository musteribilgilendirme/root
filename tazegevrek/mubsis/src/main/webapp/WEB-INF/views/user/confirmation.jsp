<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>
<!DOCTYPE html>
<html lang="en">

<script src="<c:url value="/resources/js/unicorn.form_validation.js" />"></script>
<script src="<c:url value="/resources/js/jquery.validate.js" />"></script>

<s:url var="registerFormUrl" value='/user/registration/register' />
<s:message var="sampleGsmNo" code="label.sample.gsm.no"></s:message>
<s:message var="veLbl" code="label.ve"></s:message>


<mubsis:loginpage>


	<jsp:body>
			
			
		<c:if test="${not empty success}">	
		 
		 		 	<div id="loginbox" style="height: 160px"> 
		 		  <form:form commandName="newUserDTO" action="${registerFormUrl}"
					cssClass="form-vertical">
                  	<p>
						<label style="color: green"><s:message
								code="label.account.confirmed" /></label>
					</p>
                       		
                  	<div class="form-actions">
						<span class="pull-left"><a
							href="<c:url value="/user/login" />" class="flip-link"
							id="to-login"><s:message code="label.login" /></a></span>
		           	</div>	

		 		
		 		  </form:form>
		 	</div>
		
		</c:if>
		
		 <c:if test="${	empty success}">
		 	<div id="loginbox" style="height: 130px"> 
		 		  <form:form commandName="newUserDTO" action="${registerFormUrl}"
					cssClass="form-vertical">
                  	<p>
						<label style="color: text-error"><s:message
								code="label.invalid.request" /></label>
					</p>
                       		
                  	<div class="form-actions">
						<span class="pull-left"><a
							href="<c:url value="/user/login" />" class="flip-link"
							id="to-login"><s:message code="label.login" /></a></span>
		           	</div>	

		 		
		 		  </form:form>
		 	</div>
		 </c:if>
		
		</jsp:body>

</mubsis:loginpage>

</html>
