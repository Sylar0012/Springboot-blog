<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>게시글제목</th>
				<th>작성자이름</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="MainListDto" items="${mainList}">
				<tr>
					<th>${MainListDto.id}</th>
					<th><a href="boards/${MainListDto.id}">${MainListDto.title}</a></th>
					<th>${MainListDto.username}</th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
 
<%@ include file="../layout/footer.jsp"%>

