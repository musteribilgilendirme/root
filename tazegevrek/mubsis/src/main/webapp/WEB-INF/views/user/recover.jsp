<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>
<!DOCTYPE html>
<html lang="en">

	   <s:url var = "recoveryUrl" value='/user/recover/sendemail' />
	   <s:message var="epostaMsg" code="label.email.adress" />
        
       <mubsis:loginpage>  

     <div id="loginbox"> 
            <form:form  commandName="userRecoveryDTO" action="${recoveryUrl}" cssClass="form-vertical" >
				<p><b><s:message code="label.notify.username.password" /></b></p>

                <div class="control-group">
                    <div class="controls">
                       
                       <c:if test="${empty recover}">
                       		<p><label><s:message code="label.enter.email.adress.to.recover" /></label></p>
                       </c:if>
                       
                       <c:if test="${not empty recover}">
                       		<p><label style="color:green"><s:message code="label.successfuly.login.information.send.to.user" /></label></p>
                       		
                      		<script type='text/javascript'>
						        $(document).ready(function() {
									$('#loginbox').css({"height":"160px"});  
								});
							</script> 
                       </c:if>
                       
                    </div>
                </div>
 				<c:if test="${empty recover}">
					<div class="control-group">
	                    <div class="controls">
	                        <div class="input-prepend">
	                            <span class="add-on"><i class="icon-envelope"></i></span>
	                            	<form:input  path="email" placeholder="${epostaMsg}"  />
	                        </div> 
	                        <form:errors path="email" element="div" cssClass="text-error" />
	                    </div>
	                </div>
                </c:if>

                
                <div class="form-actions">
                    <span class="pull-left"><a href="<c:url value="/user/login" />" class="flip-link" id="to-login"><s:message code="label.back.to.login" /></a></span>
                    <c:if test="${empty recover}">
                    	<span class="pull-right"><input type="submit" class="btn btn-inverse" value="<s:message code="label.send" />" /></span>
                    </c:if>
                    
                </div>
   
           </form:form>
        
        
      </div> 
        
      	   

		
	</mubsis:loginpage>
        

</html>
