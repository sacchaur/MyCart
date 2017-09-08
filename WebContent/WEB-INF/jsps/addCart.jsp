<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Cart</title>
<link rel="icon" href="/MyCart/images/shopping-cart-xxl.png">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<article style="border:1px solid red;"> 
		<header> 
			<jsp:includepage="header.jsp"></jsp:include> 
		</header>
		
	</article>

	
	<table border=1px,style="width:100%">
		
		<tr>
			<td height=440px , width=250><jsp:includepage="leftContainer.jsp"></jsp:include> </td>
			<td height=440px , width=864>
			
			<table border=1px, height=220px , width=864px >
				
				
				<jstl:forEach var="product" items="${products}">
				
				
					<tr height=70px , width=170>
						<td height=70px , width=170 >
						
							<img alt="img" src="${product.imagePath }" , width="170px" height="220px">
						</td>
						<td height=70px , width=400>
							<h1>
								<u>${product.productName }</u>
							</h1>
							<h3>
								<u>Price : </u>
							</h3> <label>${product.price }</label><br>
							
						</td>
						<td height=70px , width=293>
							<label>Quantity</label><input type="number" name="quantity" value=1>
							<%-- <a href="addCartAction?productId=${product.productId }">
								<button type="button" class="btn btn-default" aria-label="Left Align">
                    				Add to cart
                    			</button>
							</a> --%>
							<a href="removeItemAction?productid=${product.productId }"><img alt="delete-img" src="/MyCart/images/delete.png" height="50px" width="50px"></a>
						</td>
					</tr>
				</jstl:forEach>
				
				</table>
			<h2>	<label>Total Price : </label><u>${totalPrice }</u></h2>
				<a href="checkout"><img src="/MyCart/images/checkout.jpg" alt="" height="100px" width="100px"></a>
			
			
			</td>
			<td height=440px , width=250><jsp:includepage="rightContainer.jsp"></jsp:include> </td>
			
		</tr>

	</table><div align="center">
	<footer> <jsp:include page="footer.jsp"></jsp:include> </footer>
</div>
</body>
</html>