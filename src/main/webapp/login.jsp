<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Choose Login</title>
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="jumbotron text-center">
		<h3>Login Here..</h3>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<h3>Login as Teacher.:</h3>
				<a href="#" class="btn btn-info" role="button">Login</a>
			</div>
			<div class="col-sm-6">
				<h3>Login As Student</h3>
				<a href="studentlogin.jsp" class="btn btn-info" role="button">Login</a>
			</div>

		</div>
	</div>
</body>
</html>