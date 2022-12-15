<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adminpage</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<link href="css/mystyle1.css" rel="stylesheet" type="text/css">
<link href="css/footer1.css" rel="stylesheet" type="text/css">
</head>
<body>


<%
	if(session.getAttribute("user") == null){
		response.sendRedirect("../login.jsp");
	}
%>
<jsp:include page="adminheader.jsp" />


 <main role="main" class="container">
   <div class="jumbotron">
    hello from ${user}
	<h1> body admin page is here</h1>
   </div>
 </main>


<jsp:include page="adminfooter.jsp" />
</body>
</html>