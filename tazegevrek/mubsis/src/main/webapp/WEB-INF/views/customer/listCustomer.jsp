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
	
	<div class="container-fluid">	 
		<div class="row-fluid">
			<div class="span12 center" style="text-align: center;">	
			
				<ul class="quick-actions-horizontal">
					<li>
						<a href="#">
							<i class="icon-customers"></i>
							<span>Musteri Sorgula</span>
						</a>
					</li>
					
					<li>
						<a href="#">
							<i class="icon-useradd"></i>
							<span>Musteri Ekle</span>
						</a>
					</li>

					<li>
						<a href="#">
							<i class="icon-usercard"></i>
							<span>Bilgilendirilecek Müsteriler</span>
						</a>
					</li>
					
				</ul>	
					
			</div>				
		</div>
		
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-star"></i>
								</span>
								<h5>jQuery UI Components</h5>
							</div>
							<div class="widget-content">
								<div class="row-fluid">
									<div class="span6 clearfix">										
										<h3>Sliders</h3>
										<h4>Horizontal Slider</h4>
										<div id="h-slider"></div>
										<h4>Vertical Slider</h4>
										<div class="row-fluid">
											<div class="span6">
											<p style="padding:4px;" class="ui-state-default ui-corner-all ui-helper-clearfix">
								                <span style="float:left; margin:-2px 5px 0 0;" class="ui-icon ui-icon-volume-on"></span>
								                Master volume
								            </p>
								            <p>
								                <label for="amount">Volume:</label>
								                <input type="text" id="amount">
								            </p>
								        	</div>
								        	<div class="span6">
								        		<div id="v-slider"></div>
								        	</div>
								        </div>
								        <h3>Autocomplete</h3>
								        <input type="text" placeholder="Enter tag" id="tags" />
								        <h3>Menu</h3>
										<ul id="menu">
											<li><a href="#"><span class="ui-icon ui-icon-disk"></span>Save</a></li>
											<li><a href="#"><span class="ui-icon ui-icon-zoomin"></span>Zoom In</a></li>
											<li><a href="#"><span class="ui-icon ui-icon-zoomout"></span>Zoom Out</a></li>
											<li class="ui-state-disabled"><a href="#"><span class="ui-icon ui-icon-print"></span>Print...</a></li>
											<li>
												<a href="#">Playback</a>
												<ul>
													<li><a href="#"><span class="ui-icon ui-icon-seek-start"></span>Prev</a></li>
													<li><a href="#"><span class="ui-icon ui-icon-stop"></span>Stop</a></li>
													<li><a href="#"><span class="ui-icon ui-icon-play"></span>Play</a></li>
													<li><a href="#"><span class="ui-icon ui-icon-seek-end"></span>Next</a></li>
												</ul>
											</li>
										</ul>
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
