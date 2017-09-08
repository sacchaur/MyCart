<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<link rel="icon" href="/MyCart/images/shopping-cart-xxl.png">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	

</head>
<body>
	<article style="border:1px solid red;"> <header> <jsp:includepage="header.jsp"></jsp:include></header>

	</article>


	<table border=1px,style="width:100%">

		<tr>
			<td height=440px , width=250><jsp:includepage="leftContainer.jsp"></jsp:include></td>
			<td height=440px , width=864>
				<div class="page-header">
					<h1 style="color: #00e8e8;">
						Please sign up to start Shopping <small>It's free!</small>
					</h1>
				</div>
				<form role="form" action="addCustomerAction" method="post">
					<div class="col-lg-12 well">
						<div class="row">
							<div class="col-sm-6 form-group">
									<input type="text" name="txtFName" id="first_name"
										class="form-control input-sm" placeholder="First Name"
										required="required">
							</div>
							<div class="col-sm-6 form-group">
									<input type="text" name="lastFName" id="last_name"
										class="form-control input-sm" placeholder="Last Name">
							</div>
						</div>

						<div class="form-group">
							<input type="email" name="email" id="email"
								class="form-control input-sm" placeholder="Email Address"
								required="required">
						</div>

						<div class="row">
							<div class="col-sm-6 form-group">
									<input type="password" name="passwd" id="password"
										class="form-control input-sm" placeholder="Password"
										required="required">
							</div>
							<div class="col-sm-6 form-group">
									<input type="password" name="cpasswd"
										id="password_confirmation" class="form-control input-sm"
										placeholder="Confirm Password" required="required">
							</div>
						</div>
						<div class="form-group">
							<input type="number" name="contactNo" maxlength="10"
								id="phoneNumber" class="form-control input-sm"
								placeholder="Enter 10 digit Contact Number" required="required">
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
									<input type="text" name="txtarea" id="txtarea"
										class="form-control input-sm" placeholder="Enter Area"
										required="required">
							</div>
							<div class="col-sm-6 form-group">
									<input type="text" name="txtstreet" id="txtstreet"
										class="form-control input-sm" placeholder="Enter Street"
										required="required">
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
									<input type="text" name="txtcity" id="txtcity"
										class="form-control input-sm" placeholder="Enter City"
										required="required">
							</div>
							<div class="col-sm-6 form-group">
									<input type="text" name="txtstate" id="txtstate"
										class="form-control input-sm" placeholder="Enter State"
										required="required">
							</div>
						</div>
						<div class="form-group">
							<input type="number" name="txtpin" maxlength="6" id="txtPin"
								class="form-control input-sm" placeholder="Enter pin number"
								required="required">
						</div>
						<input type="submit" name="register" value="Register"
							class="btn btn-info btn-block">
					</div>
				</form>



			</td>
			<td height=440px , width=250><jsp:includepage="rightContainer.jsp"></jsp:include></td>

		</tr>

	</table>
	<div align="center">
		<footer style="border:1px solid black;"> <jsp:include
			page="footer.jsp"></jsp:include> </footer>
	</div>
</body>
</html>