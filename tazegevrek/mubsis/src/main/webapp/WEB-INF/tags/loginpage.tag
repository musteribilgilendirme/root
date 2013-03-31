<%@ tag language="java" description="GenericPage" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<html>

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
    
        <div id="logo">
            <img src=" <c:url value="/resources/img/logo.png" />" alt="" />
        </div>
        
        
    
        
        
        

        	<jsp:doBody />
        
   

        


</html>