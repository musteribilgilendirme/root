<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title> <s:message code="label.project.title" /></title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/resources/css/unicorn.login.css" />" />
    	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.min.css" />" />    
    	<link rel="stylesheet" href="<c:url value="/resources/css/uniform.css" />" />
    	<link rel="stylesheet" href="<c:url value="/resources/css/select2.css" />" />
             
			<script src="<c:url value="/resources/js/jquery.min.js" />"></script>  
        	<script src="<c:url value="/resources/js/unicorn.login.js" />"></script> 
        
            <script src="/mubsis/resources/js/jquery.min.js"></script>
            <script src="/mubsis/resources/js/jquery.ui.custom.js"></script>
            <script src="/mubsis/resources/js/bootstrap.min.js"></script>
            <script src="/mubsis/resources/js/bootstrap-colorpicker.js"></script>
            <script src="/mubsis/resources/js/bootstrap-datepicker.js"></script>
            <script src="/mubsis/resources/js/jquery.uniform.js"></script>
            <script src="/mubsis/resources/js/select2.min.js"></script>
            <script src="/mubsis/resources/js/unicorn.js"></script>
            <script src="/mubsis/resources/js/unicorn.form_common.js"></script>
        

                       
    </head>
    <body>
        <div id="logo">
            <img src=" <c:url value="/resources/img/logo.png" />" alt="" />
        </div>
        
        <div id="loginbox" >            
            <form id="loginform"  name="f" class="form-vertical" method="post" action="<c:url value='dologin' />">
				<p >
					<s:message code="label.enter.username.and.password" />
				</p>
				 
				
					<c:if test="${not empty error}">
						<p style="color:red">
							${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
							
								            
					        <script type='text/javascript'>
						        $(document).ready(function() {
									$('#loginbox').css({"height":"300px"});  
								});
							</script> 
						</p>
					</c:if>
				
			
                <div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-user"></i></span><input name="j_username" type="text" placeholder="<s:message code="label.username" />" />
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls"> 
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span><input name='j_password' type="password" placeholder="<s:message code="label.password" />" />
                        </div>
                    </div>
                </div>
                
                <div class="control-group">
                    <div class="controls"> 
                        <div class="input-prepend">
                            <label><input type="checkbox" name="radios" /><s:message code="label.remember.me" /></label>
                        </div>
                    </div>
                </div>
                
                
                

                <div class="form-actions">
					<span class="pull-left">
						<a href="#" style="font-size:14px" class="flip-link" id="to-recover"><s:message code="label.recover.password" /></a>
						|
						<a href="#" style="font-size:14px" class="flip-link" id="to-signup"><s:message code="label.sign.in" /></a>
					</span>
                    <span class="pull-right"><span style="margin-left: 20px"><input type="submit" class="btn btn-inverse" value="<s:message code="label.giris" />" /></span></span>
                </div>

                
            </form>
            
            <form id="recoverform" action="#" class="form-vertical" >
				<p><b><s:message code="label.notify.username.password" /></b><b>

                <div class="control-group">
                    <div class="controls">
                       <p> <label><s:message code="label.enter.email.adress.to.recover" /></label></p>
                    </div>
                </div>

				<div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-envelope"></i></span><input type="text" placeholder="<s:message code="label.email.adress" />" />
                        </div>
                    </div>
                </div>
                

                
                <div class="form-actions">
                    <span class="pull-left"><a href="<c:url value="/login" />" class="flip-link" id="to-login"><s:message code="label.back.to.login" /></a></span>
                    <span class="pull-right"><input type="submit" class="btn btn-inverse" value="<s:message code="label.send" />" /></span>
                </div> 
   
            </form>
        </div>
        
        
        
        
      	   
            
        <script type='text/javascript'>

			
			$("#to-recover").click(function() {
				$('#loginbox').css({"height":"250px"});   
			});
						
		</script> 
        
    </body>
</html>
