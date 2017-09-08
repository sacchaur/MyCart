<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Cart</title>
<link rel="icon" href="/MyCart/images/shopping-cart-xxl.png">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>s">

</head>
<body>
	<article> <header> <jsp:includepage="header.jsp"></jsp:include></header>

	</article>


	<table style="width:100%">

		<tr>
			<td height=440px , width=250><jsp:includepage="leftContainer.jsp"></jsp:include></td>
			<td height=440px , width=864>

				<table border=1px , height="440" , width="863">
					<tr height="150" , width="863">
						<td rowspan="2" , height="150" , width="300" >
							 <a href="showImage?imgPath=${product.imagePath }"><img src="${product.imagePath }", alt="img not found" , height="350" , width="300" /></a>
						</td>
						<td height="150" , width="564">
						
							<h2><u><b>${product.productName }</b></u></h2>
							<h3><u>Price : </u></h3><label><span class="label label-success">${product.price }</span></label>
						</td>
					</tr>
					<tr height="200" , width="863">
						<td colspan="2">
						<h3><a href="addCartAction?productId=${product.productId }">
						<button type="button" class="btn btn-default" aria-label="Left Align">
                    		Add to cart
                    	</button>
						</a></h3>
						<label>Delivery will happen within 7 days from date of order.</label>
						
						</td>
					</tr>
					<tr height="90" , width="863">
						<td colspan="2">
							<h3><u>Description : </u></h3>
							<p>${product.description }</p>	
						</td>
					</tr>
				</table>



			</td>
			<td height=440px , width=250><jsp:includepage="rightContainer.jsp"></jsp:include></td>

		</tr>

	</table>
	<div align="center">
		<footer > <jsp:include
			page="footer.jsp"></jsp:include> </footer>
	</div>
</body>
</html>