<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
request.setCharacterEncoding("UTF-8") ;
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html ng-app="engineerApp">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>工程管理平台</title>
	<link rel="stylesheet" href="css/engineerstyle.css" />
	<link rel="stylesheet" href="css/login.css">
	<link rel="stylesheet" href="framework/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="framework/bootstrap/css/bootstrap-theme.min.css" />
	<script src="framework/jquery-1.11.1.min.js"></script>
	<script src="framework/bootstrap/js/bootstrap.min.js"></script>
	<script src="framework/angular/angular.min.js"></script>
	<script src="framework/angular-ui-router.js"></script>
	<script src="js/app.js"></script>
    <script src="js/controllers.js"></script>
</head>
<body>
	<div ui-view></div>
</body>
</html>