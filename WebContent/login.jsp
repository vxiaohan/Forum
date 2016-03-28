<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Login</title>
</head>
<body>
<div style=" margin:30px 50px 20px 50px; text-align:center">
   <div style="font-size:14px; font-weight:bold">
      用户登录
   </div>
   <div>
    <s:form action="checkLogin" namespace="/login">
     <s:textfield name="username" style="font-size:12px;width: 120px;" label="登录名称"/>
     <s:password  name="password" style="font-size:12px;width: 120px;" label="登录密码"/>
     <s:submit value="登录"/>
    </s:form>
   </div>
</div>
</body>
</html>