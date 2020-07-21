<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"  %>
<!DOCTYPE html>
<html>
<head>
<meta htttp-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/sample/all/ page</h1>
	
	<sec:authorize access="isAnonymous()"> <!-- 익명의 사용자의 경우(로그인x)-->
	
		<a href="/customLogin">로그인</a>
		
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()"> <!-- 인증된 사용자면 true -->
		
		<a href="/customLogout">로그아웃</a>
		
	</sec:authorize>
	
</body>
</html>