<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<meta charset="UTF-8">
<title>developer test</title>
</head>
<body>
	<form action="${contextPath}/test9.do" name="member" method="post">
		<input type="submit" value="회원 정보 조회" />
    </form>    
</body>
</html>
