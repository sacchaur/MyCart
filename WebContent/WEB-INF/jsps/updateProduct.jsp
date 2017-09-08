<%@page import="com.mycart.pojo.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update products</title>
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
			<td width=864>
				<table >
					<tr width=864>
						<form action="getProductAction" method=post>
							<div class="col-lg-12 well" >
								<div class="row">
									<div class="col-sm-6 form-group" >
											<label>Enter Product Id to Update :</label> 
											<input
												type="text" name="productId" class="form-control">
									</div>
									<div class="col-sm-6 form-group" >
										<input type="submit" Value="Get Product"
											name="updateProductAction" class="btn btn-info pull-left">
									</div>
								</div>
							</div>
						</form>
					</tr>
					<tr width=864>
						<form action="updateProductAction" method=post>
						<div class="col-lg-12 well">
							<h3 class="well" style="color: #00e8e8;">Product details :</h3>
							<div class="col-lg-12 well">
								<div class="row">
									<div class="col-sm-12">
										<div class="row">
											<div class="col-sm-6 form-group">
												<label>Product Name</label> <input type="text"
													name="productNm" value="${product.productName }"
													class="form-control" name="productNm">
											</div>
											<div class="col-sm-6 form-group">
												<label>Price</label> <input type="number" name="price"
													value="${product.price }" class="form-control">
											</div>
										</div>

										<div class="form-group">
											<label>Product Description</label> <input type="text"
												name="description" value="${product.description }"
												class="form-control">
										</div>
										<div class="row">
											<div class="col-sm-4 form-group">
												<label>Discount</label> <input type="number"
													value="${product.discount }" name="discount"
													class="form-control">
											</div>
											<div class="col-sm-4 form-group">
												<label>Image Name</label> <input type="text" name="image"
													value="${product.imagePath }" class="form-control">
											</div>
											<div class="col-sm-4 form-group">
												<label>Total Count</label> <input type="number" name="count"
													value="${product.totalCount }" class="form-control">
											</div>
										</div>
										<input type="submit" Value="Updat Product"
											name="updateProductAction" class="btn btn-info pull-right">

									</div>
								</div>
							</div>
							</div>
						</form>
					</tr>

				</table>
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