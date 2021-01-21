<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="container">

	<jsp:include page="banner.jsp" />
	<jsp:include page="menu.jsp" />
	<hr />



	<div class="row">
		<div class="col-2 col-md-2 col-sm-2 bg-light">

			<ul class="nav flex-column">
				<li class="nav-item"><a class="nav-link active" href="./">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="./loadProductForm">Add Product</a></li>
				<li class="nav-item"><a class="nav-link" href="./listAll">Display
						Products</a></li>
		
			</ul>
		</div>
		<div class="col-10 col-md-10 col-sm-10">
			<div class="card">
				<div class="card-header">Products from Abc org</div>
				<div class="card-body">

					<table class="table table-hover">
						<tbody>
							<tr bgcolor="skyblue">
								<th>Product Id</th>
								<th>Product Name</th>
								<th>Description</th>
								<th>Price</th>
							</tr>
						</tbody>


						<c:forEach items="${products}" var="product">

							<tbody>
								<tr>
									<td>${product.id}</td>
									<td>${product.name}</td>
									<td>${product.description}</td>
									<td>${product.price}</td>

								</tr>
							</tbody>

						</c:forEach>



					</table>
				</div>

			</div>

		</div>
	</div>




</body>
</html>