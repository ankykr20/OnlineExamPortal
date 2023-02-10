<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<div class="container">
		<div class="row">
			<div class="col-sm-6"></div>
			<div class="col-sm-6">
				<h4>Login As Student</h4>
				<form action="stloginservlet" method="POST">
					<div class="form-group">
						<label for="username">User Name:</label> <input type="text"
							class="form-control" id="username" placeholder="Enter UserName"
							name="uname" required>
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control" id="pwd" placeholder="Enter password"
							name="spwd" required>
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
					<button type="reset" class="btn btn-danger">reset</button>
				</form>
				<h5><a href="studentregister.jsp">New User register here</a></h5>
			</div>
		</div>
	</div>
</body>
</html>