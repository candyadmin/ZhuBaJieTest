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
<title>登录页面</title>
<link href="Content/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="Content/bootstrap.min.css">
<script type='text/javascript' src='Script/jquery-1.11.1.min.js'></script>
<style>
    h2{
		color:#666;
		float:left;
		font-family:"黑体";
	}
</style>
</head>

<body>
<div class="header">
  <div class="headerLogo"><img alt="logo" src="images/logo1.png"></div>
  <h2>欢迎登录</h2>
</div>

<div class="banner">

<div class="login-aside">
  <div id="o-box-up"></div>
  <div id="o-box-down"  style="table-layout:fixed;">
   
   <form id="vform" action="${pageContext.request.contextPath}/loginServlet" method="post">
   <div class="form-group">
	   <label for="logonId" class="form-label">平台账号登录：</label>
       <div style="width:100%; padding-right:30px;  margin:20px 0;">
	   <input type="text" id="username" name="username" class="form-control" placeholder="手机/邮箱/用户名" data-bv-trigger="keyup" required >    
       </div>
       
       <div class="ui-form-explain"></div>
  </div>
  
  <div class="form-group">
	   <label for="logonId" class="form-label">登陆密码：</label>
       <div style="width:100%; padding-right:30px; margin:20px 0;">
	   <input type="password" name="password" id="password" class="form-control" placeholder="密码" data-bv-trigger="keyup" required>    
       </div>
  </div>
  <div>
  	<a style="color:yellow;">
  		${requestScope.msg}
  	</a>
  </div>
  
  <div style=" margin-top:40px;">
	   <label for="logonId" class="form-label"></label>
	   <input type="submit" value="" tabindex="4" id="send-btn" class="btn-login"> 
  </div>
  
  </form>
  <div class="reg"><a href="register.jsp">注册新账号</a></div>
  </div>

</div>

	<div class="bd">
		<ul>
			<li style="background:url(images/loginbg.jpg) #CCE1F3 center 0 no-repeat;"></li>
			
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
