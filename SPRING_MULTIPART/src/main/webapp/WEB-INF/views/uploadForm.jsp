<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%> 

<!DOCTYPE html >
<html>
<head>
<meta "charset=utf-8">
<title>파일업로드 하기</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>

// 파일 업로드 name 값을 다르게 하는 변수 cnt를 선언합니다.
var cnt = 1;

// 파일 추가를 클릭하면 동적으로 파일 업로드를 추가합니다.
// name 속성의 값을 'file'+cnt를 설정함으로써 값을 다르게 해줍니다.
function fn_addFile(){
	$("#d_file").append("<br>"+"<input  type='file' name='file"+cnt+"' />");
	cnt++;
}
</script>
</head>
<body>
<h1>파일 업로드 하기</h1>
<!-- enctype="multipart/form-data"의 의미는 파일 업로드 시 모든 문자를 인코딩 하지 않음을 명시 이 방식은 form요소가 파일이나 이미지를 서버로 전송할 때 주로 사용한다
     enctype은 반드시 multipart/form-data로 설정해야 합니다. -->
<form method="post" action="${contextPath}/upload" enctype="multipart/form-data">
	<!-- action form이 전송되는 서버 url 또는 html링크  enctypte 폼 데이터가 서버로 제출될 때 해당 데이터가 인코딩 되는 방법을 명시-->
	<label>아이디:</label>
	<!-- 텍스트 박스에 아이디(id)값을 입력 받아서 전송합니다. -->
    <input type="text" name="id"><br><br>
	<label>이름:</label>
	<!-- 텍스트 박스에 이름(name)값을 입력 받아서 전송합니다. -->
    <input type="text" name="name"><br><br>
    <!-- onClick="fn_addFile()"의 의미는 파일 추가를 클릭하면
                동적으로 파일 업로드를 추가합니다. -->
	<input type="button"  value="파일추가" onClick="fn_addFile()"/><br><br>
	
	<!-- 자바스크립트를 이용해 div 태그 안에 파일 업로드를 추가합니다. -->
	<div id="d_file">
  </div><br><br>
  
	<input type="submit"  value="업로드"/>
</form>
</body>
</html>