<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.title" text="Member Info"/></title>
</head>
<body>
<a href="${pageContext.request.contextPath}/text/locale.do?locale=ko">한국어</a>
<a href="${pageContext.request.contextPath}/text/locale.do?locale=ko">ENGLISH</a>
<h1><spring:message code="site.title" text="Member Info"/></h1>
<p><spring:message code="site.name" text="no name"/>:<spring:message code="name" text="no name"/></p>
<p><spring:message code="site.job" text="no job"/>:<spring:message code="job" text="no job"/></p>

<input type="button" value="<spring:message code='btn.send'/>"/>
<input type="button" value="<spring:message code='btn.cancel'/>"/>
<input type="button" value="<spring:message code='btn.finish'/>"/>
</body>
</html>