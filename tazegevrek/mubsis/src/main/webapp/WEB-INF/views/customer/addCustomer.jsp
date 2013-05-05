<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>




<s:message var="lblName" code="label.name" />
<s:message var="lblSurname" code="label.surname" />
<s:message var="lblHomeNumber" code="label.home.number" />
<s:message var="lblGsmNo" code="label.gsm.no" />
<s:message var="lblEmail" code="label.email.adress" />
<s:message var="lblAdress" code="label.adress" />

<s:message var="lblAdd" code="label.add" />
<s:message var="lblClear" code="label.clear" />
<s:message var="lblUpdate" code="label.update" />



<div class="widget-content">

	<form action="#" method="get" class="form-horizontal">

		<div class="row-fluid">

			<div class="control-group">
				<label class="control-label">${lblName}</label>

				<div class="controls">
					<input type="text" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label">${lblSurname}</label>

				<div class="controls">
					<input type="text" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label">${lblHomeNumber}</label>

				<div class="controls">
					<input type="text" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label">${lblGsmNo}</label>

				<div class="controls">
					<input type="text" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label">${lblEmail}</label>

				<div class="controls">
					<input type="text" />
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">${lblAdress}</label>

				<div class="controls">
					<input type="text" />
				</div>
			</div>

		</div>

		<div class="form-actions">
			<span class="pull-right"> 
				<input id="clear" class="btn btn-warning" type="reset" value="${lblClear}" /> 
				<input id="clear" class="btn btn-primary" type="submit" value="${lblAdd}" />
			</span>
		</div>

	</form>

</div>