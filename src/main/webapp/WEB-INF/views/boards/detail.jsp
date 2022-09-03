<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<br /> <br />
	<div >
		<h3>${detailDto.title}</h3>
	</div>
	<hr />
	<div>
		<p>${detailDto.content}</p>
	</div>
</div>

<%@ include file="../layout/footer.jsp"%>

