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
        
    <s:url var = "registerFormUrl" value='/user/registration/register' />
    <s:message var = "sampleGsmNo" code="label.sample.gsm.no"></s:message>
     <s:message var = "veLbl" code="label.ve"></s:message>
        
	
	<mubsis:loginpage>
	
	
		<jsp:body>
			
		  <div id="loginbox" style="width: 525px;height: 425px">    
		   
					
		
		     
		            <form:form commandName="newUserDTO" action="${registerFormUrl}" cssClass="form-horizontal"  >
							
							<div class="widget-title">
								<h3><s:message code="label.register.new.user" /></h3> 
							</div>   
							
		                <div class="control-group">
		                	<label class="control-label" > <s:message code="label.email.adress"/></label>
		                    <div class="controls" style="text-align:left"> 
		                          <form:input  path="email" /> <form:errors  path="email" cssClass="text-error" htmlEscape="true" /> 
		                    </div>
		                </div>
		                
		                <div class="control-group">
		                	<label class="control-label"> <s:message code="label.password"/> </label>
		                    <div class="controls" style="text-align:left">   
		                          <form:password  path="password" /> <form:errors path="password" cssClass="text-error" htmlEscape="true" />
		                    </div>
		                </div>
		                
		            	<div class="control-group">
		                	<label class="control-label"> <s:message code="label.re.password"/> </label>
		                    <div class="controls" style="text-align:left"> 
		                          <form:password  path="repassword" /> <form:errors path="repassword" cssClass="text-error" htmlEscape="false" />
		                    </div>
		                </div>
		                
		                <div class="control-group">
		                	<label class="control-label"> <s:message code="label.gms.no"/> </label>
		                    <div class="controls" style="text-align:left"> 
		                          <form:input  path="gsmNo" placeholder="${sampleGsmNo}"/> <form:errors path="gsmNo" cssClass="text-error" />
		                    </div>
		                </div>
		                
		          		<div class="control-group">
		                	<label class="control-label"> <s:message code="label.name"/> </label>
		                    <div class="controls" style="text-align:left"> 
		                          <form:input  path="name" /> <form:errors path="name" cssClass="text-error" />
		                    </div>
		                </div>
		                
		                <div class="control-group">
		                	<label class="control-label"> <s:message code="label.surname"/> </label>
		                    <div class="controls" style="text-align:left"> 
		                          <form:input  path="surname" /> <form:errors path="surname" cssClass="text-error" />
		                    </div>
		                </div> 
		                
		                <div class="form-actions">
							<span class="pull-left"><a href="<c:url value="/user/login" />" class="flip-link" id="to-login"><s:message code="label.login" /></a></span>
							<span class="pull-right"><input type="submit" class="btn btn-inverse" value="<s:message code="label.send" />" /></span>
		                </div>	
		
		                
		            </form:form>
		        
		        <script type='text/javascript'>
		
					
					$("#to-recover").click(function() {
						
					});
					
					<c:if test="${not empty error}"> 
						$(document).ready(function() {
						    $('br').replaceWith(' ${veLbl} ');
						    $('#loginbox').css({"width":"800px"});    
						});   		
			   		</c:if>  
					
								
				</script> 
			</div>
		
			
		</jsp:body>
	
	</mubsis:loginpage>
	
</html>
