<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body class="container">

	<jsp:include page="banner.jsp" />
	<jsp:include page="menu.jsp"/>

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
			<div class="jumbotron">
				<h1 class="display-4">Advanced Java Spring Boot Application</h1>
				<p class="lead">This is sample application on advanced spring boot web mvc application for stigentech  trainees.</p>
				<hr class="my-4">
		<p class="lead">This is sample application created by srinivas k</p>
			<p class="lead">Contact Email :k.srinivas215@gmail.com, Phone no:7013328581</p>
	      <p class="lead"> <a class="nav-link" href="https://github.com/srinivasmyfiles/Stigentech_Training01">Github link for your batch</a> </p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Sample Button</a>
			</div>
		</div>

	</div>




</body>
</html>