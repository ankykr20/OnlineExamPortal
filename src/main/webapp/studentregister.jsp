<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Register</title>
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-sm-6"></div>
			<div class="col-sm-6">
				<h4>Register YourSelf.:</h4>
				<form action="StRegServlet" method="POST">
					<div class="form-group">
						<label for="First Name">Enter Name.:</label> <input type="text"
							class="form-control" id="sname" placeholder="Enter  Name"
							name="suname">
					</div>
					<div class="form-group">
						<label for="Phone No.">Phone No.:</label> <input type="number"
							class="form-control" id="phno" placeholder="Enter Number."
							name="phno">
					</div>
					<div class="form-group">
						<label for="username">User Name.:</label> <input type="text"
							class="form-control" id="uname" placeholder="Enter UserName."
							name="uname">
					</div>
					<div class="form-group">
						<label for="Email">Enter Mail.:</label> <input type="email"
							class="form-control" id="semail" placeholder="Enter Email."
							name="semail">
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control" id="pwd" placeholder="Enter password."
							name="spwd">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
					<button type="reset" class="btn btn-danger">reset</button>
				</form>
				<a href="studentlogin.jsp">Already registered. Login Here</a>
			</div>
		</div>
	</div>
</body>
</html>