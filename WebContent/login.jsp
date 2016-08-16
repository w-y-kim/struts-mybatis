<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:property value="name"/>
<s:property value="msg"/>
<s:form action="loginResult.action">
	<s:textfield label="id" name="user.userId"/><!--객체로들어감,소문자 -->
	<s:textfield label="pw" name="user.userPw"/>
	<s:textfield label="name" name="user.userName"/>
	<s:submit key="Login"/>
</s:form>

</body>
</html>

