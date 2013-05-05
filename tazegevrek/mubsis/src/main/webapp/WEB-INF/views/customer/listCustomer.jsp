<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>
<!DOCTYPE html>
<html lang="en">

<s:url var="customerHomeUrl" value='/secure/customer/list' />
<s:url var="homeUrl" value='/secure/home' />
<s:message var="lblMainPage" code="label.main.page" />
<s:message var="lblCustomerList" code="label.customer.list" />
<s:message var="lblCustomer" code="label.customer" />
<s:message var="lblGoToHome" code="label.go.to.home" />
<s:message var="lblHomePage" code="label.main.page" />

<s:message var="lblCustomerManager" code="label.customer.manager" />
<s:message var="lblSearchCustomer" code="label.search.customer" />
<s:message var="lblAddCustomer" code="label.add.customer" />

<mubsis:genericpage>
	<jsp:attribute name="selectedMenu">CUSTOMER</jsp:attribute>

	<jsp:attribute name="top">
			<h1>
				${lblCustomerManager} 
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
	
		<div class="container-fluid">	 
				
		
		<div class="row-fluid">
			    <div class="span12">
			        <div class="widget-box">
			            <div class="accordion" id="collapse-group">
			
			                <div class="accordion-group widget-box">
			                    <div class="accordion-heading">
			                        <div class="widget-title">
			                            <a data-parent="#collapse-group"
											href="#collapseGOne" data-toggle="collapse">
			                                <span class="icon"><i
												class="icon-magnet"></i></span>
													<h5>${lblSearchCustomer}</h5>
			                            </a>
			                        </div>
			                    </div>
			                    <div class="collapse accordion-body"
									id="collapseGOne">
			
			
			                       <jsp:include page="searchCustomer.jsp" />
			
			
			                    </div>
			
			                </div>
			
			                <div class="accordion-group widget-box">
			                    <div class="accordion-heading">
			                        <div class="widget-title">
			                            <a data-parent="#collapse-group"
											href="#collapseGTwo" data-toggle="collapse">
			                                

											<span class="icon"><i class="icon-magnet"></i></span>
											<h5>${lblAddCustomer}</h5>			                              
			                                
			                            </a>
			                        </div>
			                    </div>
			                    <div class="collapse in accordion-body"
									id="collapseGTwo">
			                        
			                          <jsp:include page="addCustomer.jsp"></jsp:include>
			                          
			                    </div>
			                </div>
			
			            </div>
			        </div>
			    </div>
			</div>
					
				
				
		</div>
	</jsp:body>



</mubsis:genericpage>

</html>
