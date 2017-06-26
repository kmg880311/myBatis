<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.*" %>
<%@ page import="board.repository.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//1-1. 요청 분석 - > servlet:controller
	int boardNo = 1; 
		
	if(request.getParameter("boardNo") != null){
		boardNo = Integer.parseInt(request.getParameter("boardNo"));
	}
	//1-2. 모델을 호출 - >  ActionController
	Board board = new BoardDao().selectBoard(boardNo); // board모델(DATA) 완성
	
	//2.  모델을 출력(View)
%>
	<%=board.toString() %>
</body>
</html>