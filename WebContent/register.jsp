<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
  <center>
    <h3>用户注册</h3>
    <s:form action="registerAction" method="post">
       <s:textfield name="username" label="UserName"/>
       <s:password name="password" label="PassWord"/>
       <s:textfield name="name" label="Name"/>
       <s:textfield name="nic" label="NickName"/>
       <s:textfield name="sex" label="Sex"/>
       <s:textfield name="age" label="Age"/>
       <s:textfield name="email" label="Email"/>
       <s:textfield name="phone" label="Phone"/>
       <s:textarea name="selfshow" label="brief.introduction"/>
       <s:submit value="Register"/>
    </s:form>
  </center>
</body>
</html>