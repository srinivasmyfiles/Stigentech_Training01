<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="container align-items-center">
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
		<div class="col-4 col-sm-8 col-md-6 ">

			<div class="card">

				<div class="card-header bg-success">Product Form</div>
				<div class="card-body">

					<form action="saveProductV2" method="post" autocomplete="off"
						class="justify-content-center">

						<div class="form-group">
							<lable>Product Id</lable>
							<input type="number" name="id" class="form-control" required="required" placeholder="like 123" />
						</div>

						<div class="form-group">
							<lable>Product Name</lable>
							<input name="name" class="form-control" required="required" placeholder="like Laptop" />
						</div>


						<div class="form-group">
							<lable>Product Price</lable>
							<input type="number" name="price" class="form-control" required="required" placeholder="like 55000" />
						</div>

						<div class="form-group">
							<lable>Product Description</lable>
							<textarea name="description" class="form-control" required="required" placeholder="like Dell Intel"></textarea>
						</div>

						<div class="form-group">
							<span>${msg}</span>
						</div>

						<div class="text-center">
							<button class="btn btn-primary">Save</button>
							<button class="btn btn-danger">Cancel</button>
						</div>



					</form>

				</div>

			</div>
		</div>
	</div>



</body>
</html>