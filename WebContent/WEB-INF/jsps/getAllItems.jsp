<%@page import="java.util.List"%>
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
  	

<style type="text/css">
</style>

</head>
<body>
<div class="container">
  <div class="jumbotron ">
	<article> <header> <jsp:includepage="header.jsp"></jsp:include></header>

	</article>


	<table style="width:100%">

		<tr>
			<td height=440px , width=250><jsp:includepage="leftContainer.jsp"></jsp:include></td>
			<td height=440px , width=864>
			
				<table border=1px, height=220px , width=864px>
				<%-- <%@ page import="com.mycart.dao.*"%>
			<%@ page import="com.mycart.pojo.Product"%>
			<%@ page import="java.util.List" %>
				<%
				List<Product> a = new DaoImpl().getAllProductByName("");
				
				%> --%>
					<jstl:forEach var="product" items="${product }">

						
						<tr height=70px , width=170>
							<td height=70px , width=170><a href="getItemAction?productId=${product.productId }"><img alt="img"RR
								src="${product.imagePath }" , width="170px" height="220px"></a>
							</td>
							<td height=70px , width=400>
								<h1>
								 	<a href="getItemAction?productId=${product.productId }"><u>${product.productName }</u></a>
								</h1>
								<h3>
									<span class="label label-primary">Price : </span>
								</h3> 
								<label><span class="label label-success">${product.price }</span></label><br>

							</td>
							<td height=70px , width=293>
								<h4>
									<span class="label label-pill label-info">Description : </span>
								</h4>
								<p>${product.description }</p> 
								<h3>
								<a href="addCartAction?productId=${product.productId }"
											onclick="myFunction()">
                    					<button type="button" class="btn btn-default" aria-label="Left Align">
                    					  Add to cart
                    					</button>
                    					</a>
									</h3>
							</td>
						</tr>
					</jstl:forEach>

				</table>

			</td>
			<td height=440px , width=250><label>${size }  No. of product added into cart......!</label></td>
		</tr>

	</table>
	<div align="center">
		<footer > <jsp:include
			page="footer.jsp"></jsp:include> </footer>
	</div>
	<script>
		function myFunction() {
    		alert(" Product is added to cart...!");
		}
	</script>
	</div>
	</div>
</body>
</html>