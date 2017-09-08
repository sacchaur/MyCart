<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank you</title>
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
			<td height=440px , width=864><jsp:includepage="body.jsp"></jsp:include> </td>
			<td height=440px , width=250><jsp:includepage="rightContainer.jsp"></jsp:include> </td>
			
		</tr>

	</table><div align="center">
	<footer style="border:1px solid black;"> <jsp:include page="footer.jsp"></jsp:include> </footer>
</div>
</body>
</html>