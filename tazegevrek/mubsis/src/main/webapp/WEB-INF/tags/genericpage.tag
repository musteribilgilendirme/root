<%@ tag language="java" description="GenericPage" pageEncoding="UTF-8"%>
<%@ attribute name="top" fragment="true"%>
<%@ attribute name="breadcrumb" fragment="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<html>

<header>

	<title><s:message code="label.project.title" /></title>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet"
		href="<c:url value="/resources/css/bootstrap.min.css" />" />
	<link rel="stylesheet"
		href="<c:url value="/resources/css/bootstrap-responsive.min.css" />" />
	<link rel="stylesheet"
		href="<c:url value="/resources/css/fullcalendar.css" />" />
	<link rel="stylesheet"
		href="<c:url value="/resources/css/unicorn.main.css" />" />
	<link rel="stylesheet"
		href="<c:url value="/resources/css/unicorn.grey.css" />"
		class="skin-color" />

</header>

<body>
	<div id="header">
		<h1>
			<a href="./home"> <s:message code="label.project.title" />
			</a>
		</h1>
	</div>

	<div id="search">
		<input type="text" placeholder="<s:message code="label.search.here"/>" />
		<button type="submit" class="tip-right"
			title="<s:message code="label.search"/>">
			<i class="icon-search icon-white"></i>
		</button>
	</div>

	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav btn-group">
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-user"></i> <span class="text"><s:message
							code="label.profile" /></span></a></li>
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-user"></i> <span class="text"><s:message
							code="label.messages" /></span> <span class="label label-important">5</span></a></li>
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-cog"></i> <span class="text"><s:message
							code="label.settings" /></span></a></li>
			<li class="btn btn-inverse"><a title="" href="<c:url value="/logout" />"><i
					class="icon icon-share-alt"></i> <span class="text"><s:message
							code="label.logout" /></span></a></li>
		</ul>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
		<s:message code="label.main.page" /></a>
		<ul>
			<li class="active"><a href="index.html"><i
					class="icon icon-home"></i> <span><s:message
							code="label.main.page" /></span></a></li>
			<li><a href="customer"><i class="icon icon-user"></i> <span><s:message
							code="label.customers" /></span></a></li>
			<li><a href="demand"><i class="icon icon-time"></i> <span><s:message
							code="label.demand" /></span></a></li>
			<li><a href="calenar"><i class="icon icon-calendar"></i> <span><s:message
							code="label.calendar" /></span></a></li>
			<li><a href="transaction"><i class="icon icon-list"></i> <span><s:message
							code="label.transactions" /></span></a></li>
		</ul>

	</div>

	<div id="content">
	
		<div id="content-header">
			<jsp:invoke fragment="top" />
		</div>
		
		<div id="breadcrumb">
			<jsp:invoke fragment="breadcrumb" />
		</div>
		
		<jsp:doBody />
		
		<div class="container-fluid">	 
			<div class="row-fluid">
				<div id="footer" class="span12">
					2013 &copy; <a href="#"><s:message code="label.batch.message" /></a>
				</div>
			</div>
		</div>
		
	</div>
	
	



	<script src="<c:url value="/resources/js/excanvas.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.ui.custom.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.flot.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.flot.resize.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.peity.min.js" />"></script>
	<script src="<c:url value="/resources/js/fullcalendar.min.js" />"></script>
	<script src="<c:url value="/resources/js/unicorn.js" />"></script>
	<script src="<c:url value="/resources/js/unicorn.dashboard.js" />"></script>




</body>
</html>