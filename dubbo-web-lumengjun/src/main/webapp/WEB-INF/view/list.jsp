<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1/jquery.js" ></script>
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script>
<script type="text/javascript" src="/resource/js/jqueryvalidate/jquery.validate.js"></script>
<script type="text/javascript" src="/resource/js/jqueryvalidate/localization/messages_zh.js"></script>
</head>
<body>
        <table class="table">
        		<tr>
        			<td colspan="10">
        			<form action="list">
        				开始时间<input type="date" name="dt1" value="${dt1 }">----
        				最后时间<input type="date" name="dt2" value="${dt2 }">&emsp;
        				<select name="dtj">
        					
        					<option <c:if test="${dtj=='created' }">selected</c:if> value="created">发表时间</option>
        					<option <c:if test="${dtj=='user_id' }">selected</c:if> value="user_id">user_id</option>
        					<option <c:if test="${dtj=='hits' }">selected</c:if> value="hits">点击数量</option>
        				</select>
        				<input type="submit" value="查询"> 
        				</form>
        			</td>
        		</tr>
        		<tr>
        			<td>ID</td>
        			<td>标题</td>
        			<td>发表时间</td>
        			<td>user_id</td>
        			<td>点击数量</td>
        		</tr>
        		<c:forEach items="${list}" var="art">
        			<tr>
        				<td>${art.id }</td>
        				<td>${art.title }</td>
        				<td>${art.created }</td>
        				<td>${art.user_id }</td>
        				<td>${art.hits }</td>
        			</tr>
        		</c:forEach>
        </table>
</body>
</html>