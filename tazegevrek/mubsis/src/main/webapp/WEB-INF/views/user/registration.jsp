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
        
	
	<mubsis:loginpage>
	
	
		<jsp:body>
			
		  <div id="loginbox" style="width: 800px">   
		            <form id="loginform"  name="f" class="form-horizontal"  method="post" action="<c:url value='/user/dologin' />">
						<c:if test="${empty error}">
							<p>
								<s:message code="label.enter.username.and.password" />
							</p>
						</c:if>
						
						<c:if test="${not empty error}"> 
					        <p class="text-error">
								${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
							</p>     		
					   </c:if>     
						 
							
		                <div class="control-group">
		                	<label class="control-label">Eposta:</label>
		                    <div class="controls"> 
		                           <input name="j_username" type="text" style="width: 500px"/>
		                    </div>
		                </div>
		                
		                <div class="control-group">
		                	<label class="control-label">Sifre:</label>
		                    <div class="controls"> 
		                           <input name="j_username" type="text" style="width: 500px"/>
		                    </div>
		                </div>
		                
		                <div class="control-group">
		                	<label class="control-label">Sifre (Tekrar):</label>
		                    <div class="controls"> 
		                           <input name="j_username" type="text" style="width: 500px"/>
		                    </div>
		                </div>

		                
		                
		
		                <div class="form-actions">
							<span class="pull-left">
								<a href="<c:url value="/user/recover" />" style="font-size:14px" class="flip-link" id="to-recover"><s:message code="label.recover.password" /></a>
								|
								<a href="<c:url value="/user/registration" />" style="font-size:14px" class="flip-link" id="to-signup"><s:message code="label.sign.in" /></a>
							</span> 
		                    <span class="pull-right"><span style="margin-left: 20px"><input type="submit" class="btn btn-inverse" value="<s:message code="label.giris" />" /></span></span>
		                </div>	
		
		                
		            </form>
		        
		        <script type='text/javascript'>
		
					
					$("#to-recover").click(function() {
						$('#loginbox').css({"height":"250px"});   
					});
								
				</script> 
			</div>
		
			
		</jsp:body>
	
	</mubsis:loginpage>
	
</html>
