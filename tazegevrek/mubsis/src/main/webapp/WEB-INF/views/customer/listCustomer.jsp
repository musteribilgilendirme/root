<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>
<!DOCTYPE html>
<html lang="en">

	<s:url var = "customerHomeUrl" value='/secure/customer/list' />
	<s:url var = "homeUrl" value='/secure/home' />
	<s:message var="lblMainPage" code="label.main.page" />
	<s:message var="lblCustomerList" code="label.customer.list" />
	<s:message var="lblCustomer" code="label.customer" />
	<s:message var="lblGoToHome" code="label.go.to.home" />
	<s:message var="lblHomePage" code="label.main.page" />


<mubsis:genericpage>
	<jsp:attribute name="selectedMenu">CUSTOMER</jsp:attribute>

	<jsp:attribute name="top">
			<h1>
				${lblCustomerList} 
			</h1>
	</jsp:attribute>

	<jsp:attribute name="breadcrumb">
			<a href="${homeUrl}" title="${lblGoToHome}">
				<i class="icon-home"></i>
				${lblHomePage}
			</a>
			
			<a href="${customerHomeUrl}" title="${lblCustomer}" class="current">
				<i class="icon icon-user"></i>
				${lblCustomer}
			</a>
			
		</jsp:attribute>

	<jsp:body>
		
	</jsp:body>



</mubsis:genericpage>

</html>
