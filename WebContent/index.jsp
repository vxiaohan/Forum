<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
<h3><s:text name="用户登陆"></s:text></h3>
<s:form action="login" method="post">
   <s:textfield name="username" label="用户名"></s:textfield>
   <s:password name="password" label="密码"></s:password>
   <s:submit label="登陆"></s:submit>
</s:form>
<s:a href="register.jsp"><s:text name="Register"/></s:a>
</body>
</html>