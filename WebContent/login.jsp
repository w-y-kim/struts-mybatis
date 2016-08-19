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
<!-- OGNL 사용  -->
<s:property value="%{loginId}"/><!-- 스트럿츠 태그 안에 EL식처럼 StackValue의 값을 쓰려면 OGNL 써야함. 객체로 인식함 -->
<s:property value="%{#session.loginId}"/> <!-- 세션에 있는 것을 불러오려면 #{session.키값}으로 불러와야함, valueStack과는 별개, 호출법도 다름 -->
<s:property value="%{#session.loginName}"/>
<!--  -->

<s:property value="name"/>


<s:form action="loginResult.action">
	<s:textfield key="아이디" label="id" name="user.userId"/><!--객체로들어감,소문자 -->${fieldErrors.id}
	<s:textfield key="비밀번호" label="pw" name="user.userPw"/><!-- value를 지정하지 않으면 name 속성 값을 따라감 -->${fieldErrors.pw}
	<s:textfield key="이름" label="name" name="user.userName" value=%{}/>
	<s:submit key="Login"/>
</s:form>

</body>
</html>