<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
request.setCharacterEncoding("UTF-8") ;
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="Content/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="Content/bootstrap.min.css">

<script type='text/javascript' src='Script/jquery-1.11.1.min.js'></script>
<style>
	h2{
		color:#666;
		float:left;
		font-family:"黑体";
	}
	.form-group div{
		width:100%; padding-right:30px; margin:10px 0;
	}
	label{
	    color:#fff;
	}
</style>
</head>

<body>
<div class="header">
  <div class="headerLogo"><img alt="logo" src="images/logo1.png"></div>
  <h2>新用户注册</h2>
</div>

<div class="banner">

<div class="login-aside">
  <div id="o-box-up"></div>
  <div id="o-box-down"  style="table-layout:fixed;">
   
   <form id="vform">
   <div class="form-group">
	   <label for="logonId" class="form-label">手机号码</label>
       <div>
	   <input type="text" id="username" class="form-control" placeholder="输入手机号码" data-bv-trigger="keyup" required >    
       </div>
       
       <div class="ui-form-explain"></div>
  </div>
  
  <div class="form-group">
	   <label for="logonId" class="form-label">登录密码</label>
       <div>
	   <input type="password" id="password" class="form-control" placeholder="设置密码" data-bv-trigger="keyup" required>    
       </div>
  </div>
  <div class="form-group">
	   <label for="logonId" class="form-label">用户类型</label>
       <div>
	       <label class="radio-inline">
               <input type="radio" name="usertype" id="common" value="1" checked="checked">普通用户
           </label>
           <label class="radio-inline">
               <input type="radio" name="usertype" id="institute" value="2">设计院
           </label>
       </div>
  </div>
  
  <div style="padding-right:30px">
	   <input type="button" value="同意协议并注册" tabindex="4" id="send-btn" class="btn btn-default btn-block"> 
  </div>
  
  </form>
  <div class="reg">已有账号？<a href="login.jsp">登录</a></div>
  </div>

</div>

	<div class="bd">
		<ul>
			<li style="background:url(images/regbg.jpg) #CCE1F3 center 0 no-repeat;"></li>
			
		</ul>
	</div>

</div>
<div class="banner-shadow"></div>

<div class="footer">
   <p>Copyright &copy; 2016.Company name All rights reserved.</p>
</div>

</script>
</body>
</html>
