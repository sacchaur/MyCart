<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="icon" href="/MyCart/images/shopping-cart-xxl.png">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	
	<link rel="stylesheet" type="text/css" href="/MyCart/css/login.css">

</head>
<body>
	 <div class="container">
  <div class="jumbotron ">
	<article> <header> <jsp:includepage="header.jsp"></jsp:include></header>

	</article>


	<table style="width: 100%">

		<tr>
			<td height=440px , width=250><jsp:includepage="leftContainer.jsp"></jsp:include></td>
			<td height=440px , width=864>
				<div class="text-center" style="padding: 50px 0">
					<div class="logo">login</div>
					<!-- Main Form -->
					<div class="login-form-1" >
						<form id="login-form" class="text-left" action="loginAction" method="post">
							<div class="login-form-main-message"></div>
							<div class="main-login-form">
								<div class="login-group">
									<div class="form-group">
										<label for="lg_username" class="sr-only">Username</label> <input
											type="text" class="form-control" id="lg_username"
											name="email" placeholder="username">
									</div>
									<div class="form-group">
										<label for="lg_password" class="sr-only">Password</label> <input
											type="password" class="form-control" id="lg_password"
											name="passwd" placeholder="password">
									</div>
									<div class="form-group login-group-checkbox">
										
									</div>
								</div>
								<button type="submit" class="login-button" name="register" value="Login" >
									<img alt="Image not found" height="20px" width="20px"
											src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSUj5MsJ3O1UadMmTPzpdQAWaBiEMGS_DAiMVoaxDa0uFg-ezOeOQ">
								</button>
							</div>
							<div class="etc-login-form">
								<p>
									forgot your password? <a href="#">click here</a>
								</p>
								<p>
									new user? <a href="signup">create new account</a>
								</p>
							</div>
						</form>
					</div>
					<!-- end:Main Form -->
				</div>
			</td>
			<td height=440px , width=250><jsp:includepage="rightContainer.jsp"></jsp:include></td>

		</tr>

	</table>
	<div align="center">
		<footer style="border:1px solid black;"> <jsp:include
			page="footer.jsp"></jsp:include> </footer>
	</div>
	</div> <!--jumbotron  -->
	</div> <!-- container -->
</body>
</html>