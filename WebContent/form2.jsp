<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Register2" method="post">
		<table>
			<col width="20%">
			<col width="30%">
			<col width="50%">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="user.id" ></td>
				<td>${msg}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="user.pw" ></td>
				<td>${msg}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="user.name" ></td>
				<td>${msg}</td>
			</tr>
			<tr>
				<td><input type="submit" value="보내기"></td>
				<td><input type="reset" value="취소"></td>
			</tr>

		</table>
	</form>
</body>
</html>