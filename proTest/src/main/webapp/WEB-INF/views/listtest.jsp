<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%= request.getContextPath() %>"></c:set> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.cls1{
		font-size: 40px;
		text-align: center;
		list-style: none;
		text-decoration: none;
	}
	
	.cls2{
		text-decoration: none;
		color: black;
		font-weight: bold;
	}
</style>
<title>회원 정보 출력창</title>
</head>
<body>
	<h2 align="center">회원정보</h2>
	<table align="center" width="100%" border="1px">
		<tr align="center" bgcolor="#dcdcdc">
			<td width="7%">아이디</td>
			<td width="7%">비밀번호</td>
			<td width="6%">이름</td>
			<td width="11%">이메일</td>
			<td width="11%">가입일</td>
		</tr>
	<c:choose>
		<c:when test="${membersList==null}">
			<tr>
				<td colspan="5"><p align="center"><b><span style="font-size: 9pt;">등록된 회원이 없습니다.</span></b></p></td>		
			</tr>
		</c:when>
		<c:when test="${membersList != null}">
			<c:forEach var="member" items="${membersList}">
				<tr align="center">
					<td>${member.id}</td>	
					<td>${member.pwd}</td>	
					<td>${member.name}</td>	
					<td>${member.email}</td>	
					<td>${member.joinDate}</td>
				</tr>
			</c:forEach>
		</c:when>
	</c:choose>
	</table>
</body>
</html>