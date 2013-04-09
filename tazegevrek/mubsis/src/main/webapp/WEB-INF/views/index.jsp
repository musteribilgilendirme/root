<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>
<!DOCTYPE html>
<html lang="en">

<mubsis:genericpage>

	<jsp:attribute name="selectedMenu">HOME</jsp:attribute>

	<jsp:attribute name="top">
			<h1>
				<s:message code="label.main.page" />
			</h1>
		</jsp:attribute>

	<jsp:attribute name="breadcrumb">
			<a href="#" title="<s:message code="label.go.to.home" />"
			class="current">
				<i class="icon-home"></i>
				<s:message code="label.main.page" />
			</a>
		</jsp:attribute>

	<jsp:body>
		
	</jsp:body>



</mubsis:genericpage>

</html>
