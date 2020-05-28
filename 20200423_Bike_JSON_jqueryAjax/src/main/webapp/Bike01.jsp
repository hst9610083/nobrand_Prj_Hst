
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	response.setContentType("text/html; charset = utf-8");
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	response.setContentType("text/html; charset = UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서울시 따릉이 정보 첫번째</title>
</head>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript" src="./js/bike01.js"></script>


<body>


	<table>
		<thead></thead>
		<tbody></tbody>
	</table>
	<form action="./BikeFirst.do" method="post">
		<input type="submit" value="DB저장">
		<table>
			<thead></thead>
			<tbody></tbody>
		</table>
	</form>
</body>
</html>