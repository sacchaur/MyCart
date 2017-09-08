<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin : Add Product</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
						Add Product <small></small>
					</h1>
				</div> <!-- START -->
				<form action="addProductNow" method="post">
					<div class="row">
						<form role="form">
							<div class="col-sm-12">
								<div class="well well-sm">
									<strong><span class="glyphicon glyphicon-asterisk"></span>Required
										Field to add the product</strong>
								</div>
								<div class="row">
									<div class="col-sm-6 form-group">
										<label for="InputName">Product Name</label>
										<div class="input-group">
											<input type="text" class="form-control" name="productName"
												id="productName" placeholder="Enter product Name" required>
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-asterisk"></span></span>
										</div>
									</div>
									<div class="col-sm-6 form-group">
										<label for="InputNumber">Price</label>
										<div class="input-group">
											<input type="number" class="form-control" id="price"
												name="price" placeholder="Enter price" required> <span
												class="input-group-addon"><span
												class="glyphicon glyphicon-asterisk"></span></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6 form-group">
										<label for="InputNumber">Discount</label>
										<div class="input-group">
											<input type="number" class="form-control" id="discount"
												name="discount" placeholder="Enter the discount" required>
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-asterisk"></span></span>
										</div>
									</div>
									<div class="col-sm-6 form-group">
										<label for="InputName">Product description</label>
										<div class="input-group">
											<input type="text" class="form-control" name="description"
												id="description" placeholder="Enter product Name" required>
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-asterisk"></span></span>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6 form-group">
										<label for="InputName">Image name</label>
										<div class="input-group">
											<input type="text" name="imageName" id="imageName"
												class="form-control" rows="5" required>
											</textarea>
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-asterisk"></span></span>
										</div>
									</div>
									<div class="col-sm-6 form-group">
										<label for="InputNumber">Total count</label>
										<div class="input-group">
											<input type="number" name="count" id="count"
												class="form-control" rows="5" required>
											</textarea>
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-asterisk"></span></span>
										</div>
									</div>
								</div>
								<input type="submit" Value="Add Product" name="addProductNow"
									class="btn btn-info pull-right">
							</div>
						</form>
					</div>
				</form> <!-- END -->



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