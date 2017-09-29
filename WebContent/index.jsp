<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的日志</title>
<style>
	div{
		width:900px;
		margin:0 auto;
	}
	table{
		width: inherit;/*继承div的宽度*/
	}
</style>
</head>
<body>
	<div>
		<table>
			<tr>
				<td colspan="2">
					<h4>我的日志</h4>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<a href="${pageContext.request.contextPath}/add.jsp"><strong>写日志</strong></a>
				</td>
			</tr>
			<c:forEach items="${requestScope.list}" var="item">
				<tr>
					<td>${item.diary_title}</td>
					<td>${item.diary_date}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>