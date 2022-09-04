<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<br /> <br />
	<div >
		<h3>${detailDto.title}</h3>
	</div>
	<hr />
		<p style="text-align: right;">등록일 : ${detailDto.createdAt}　　글쓴이 : ${detailDto.username }</p>
	<hr />
	<div>
		<p>${detailDto.content}</p>
	</div>
	<hr/>
	<form method="get" action="/writeUpdate">
	<button type="submit"  class="btn btn-primary">글 수정</button>
	</form>
	<br/>
	<form method="post" action="/delete">
	<button type="submit"  class="btn btn-primary">글 삭제</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>

