<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<form role="form" action="login" method="post">
					<div class="form-group row">
					 <td>${msg }</td>
						<label for="inputName" class="col-sm-2col-form-label">用户名:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputName"
								placeholder="用户名" name="name">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPass" class="col-sm-2col-form-label">密码:</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPass"
								placeholder="pass">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-10">
							<button type="submit" class="btn btn-primary">
								登录</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/jquery/jquery-3.3.1.slim.min.js"></script>
	<script src="static/popper/popper.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
	</body>
	</html>