<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME TO MYCART</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<link rel="icon" href="/MyCart/images/shopping-cart-xxl.png">
<script src="/MyCart/js/jquery.min.js"></script>
<script src="/MyCart/js/bootstrap.min.js"></script>
<style type="text/css">
input.logo {
	width: 500px;
	height: 40px;
}

td.img {
	padding-left: 20px;
	padding-right: 0px;
}

.search {
	width: 100px;
	height: 40px;
}

.link {
	background-color: ##2E2EFE;
	text-align: center;
	height: 30px;
	text-align: center;
}

.caret.caret-up {
	border-top-width: 0;
	border-bottom: 4px solid #fff;
}

#menu1 {
	background-color: #ccc;
	color: black;
	font-family: "Times New Roman", Times, serif;
	font-size: large;
}
</style>
</head>
<body>
	<table>
		<form role="form" action="searchString" method="post">
			<tr style="border: 1px solid red;">

				<td class="img" , height=50 , width=250,
					style="border: 1px solid red;"><a
					href="homeAction?email1=<%=session.getAttribute("email")%>"> <img
						alt="img" src="/MyCart/images/logo.png" , height=50 , width=250>
				</a></td>
				<td class="img" ,height=50 , width=500,style="border:1pxsolidred;" >
					<input type="text" name="search" class="logo">
				</td>
				<td><input type="submit" Value="Search" class="search" /></td>
				<td height=50 , width=250, style="border: 1px solid red;">
					<div class="row">
						<div class="col-sm-4 form-group">
							<h3>Welcome</h3>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-4 form-group center-block">
							<h4>
								<%
									out.print(session.getAttribute("email"));
								%>
							</h4>
						</div>
					</div>
				</td>
				<td><a href="login"><img alt=""
						src="/MyCart/images/login-button.png" height="50" width="150"></a>
					<a href="logoutAction"><img alt=""
						src="/MyCart/images/logout.png" height="50" width="150"></a></td>
				<td><a href="signup"><img alt=""
						src="/MyCart/images/sign-up.png" height="60" width="150"></a> <a
					href="showCartAction"><img alt="" src="/MyCart/images/cart.jpg"
						height="50" width="150"></a></td>

			</tr>
		</form>

	</table>
	<table style="width: 100%">
		<tr>
			<td width=300 class="link">
				<div class="dropdown">
					<button class="btn dropdown-toggle" id="menu1"
						type="button" data-toggle="dropdown">
						MEN <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">


						<li role="presentation"><a role="menuitem" href="getAllItems">FOOTWEAR</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">CLOTHING</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">ACCESSORIES</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">GROOMING</a></li>
					</ul>
			</td>
			<td width=300 class="link">
				<div class="dropdown">
					<button class="btn dropdown-toggle" id="menu1"
						type="button" data-toggle="dropdown">
						WOMEN <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
						<li role="presentation"><a role="menuitem" href="getAllItems">FOOTWEAR</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">CLOTHING</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">ACCESSORIES</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">COSMETICS</a></li>
					</ul>
			</td>
			<td width=300 class="link">

				<div class="dropdown">
					<button class="btn dropdown-toggle" id="menu1"
						type="button" data-toggle="dropdown">
						ELECTRONICS <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
						<li role="presentation"><a role="menuitem" href="getAllItems">MOBILES</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">LAPTOPS
								& DESKTOPS</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">CAMERA</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">ACCESSORIES</a></li>
					</ul>
			</td>
			<td width=300 class="link">
				<div class="dropdown">
					<button class="btn dropdown-toggle" id="menu1"
						type="button" data-toggle="dropdown">
						BOOKS & MEDIA<span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
						<li role="presentation"><a role="menuitem" href="getAllItems">BOOKS
								& eBOOKS</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">MOVIES</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">GAMING</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">STATIONARY</a></li>
					</ul>
			</td>
			<td width=300 class="link">
				<div class="dropdown">
					<button class="btn dropdown-toggle" id="menu1"
						type="button" data-toggle="dropdown">
						HOME & FURNITURE <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
						<li role="presentation"><a role="menuitem" href="getAllItems">FURNITURE</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">HOME
								APPLIANCES</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">KITCHEN</a></li>
						<li role="presentation" class="divider"></li>
						<li role="presentation"><a role="menuitem" href="getAllItems">HOME
								DECOR</a></li>
					</ul>
			</td>

		</tr>
	</table>

	<script>
		$(document).ready(function() {
			$(".dropdown").on("show.bs.dropdown", function(event) {

			});
		});
	</script>
</body>
</html>