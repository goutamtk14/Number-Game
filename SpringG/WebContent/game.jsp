<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GAME!</title>
</head>
<body style="background-image:url(https://wonderfulengineering.com/wp-content/uploads/2014/09/white-wallpapers-40.jpg)">
<div class="row">
 <div class="col-sm-4"></div>
 <div class="col-sm-4">
	<form action="numbers" method="POST">
		<pre>
		
		
		
		
		
		
		
		
		
		
		<input type="submit" value="${nums[0]}" name="${nums[0]}" class="col-lg-2 btn btn-primary"><input type="submit" value="${nums[1]}" name="${nums[1]}" class="col-lg-2 btn btn-primary"><input type="submit" value="${nums[2]}" name="${nums[2]}" class="col-lg-2 btn btn-primary">
		<input type="submit" value="${nums[3]}" name="${nums[3]}" class="col-lg-2 btn btn-primary"><input type="submit" value="${nums[4]}" name="${nums[4]}" class="col-lg-2 btn btn-primary"><input type="submit" value="${nums[5]}" name="${nums[5]}" class="col-lg-2 btn btn-primary">
		<input type="submit" value="${nums[6]}" name="${nums[6]}" class="col-lg-2 btn btn-primary"><input type="submit" value="${nums[7]}" name="${nums[7]}" class="col-lg-2 btn btn-primary"><input type="submit" value="${nums[8]}" name="${nums[8]}" class="col-lg-2 btn btn-primary">
        </pre>
	</form>
	</div>
</div>
	<h3 class="text-center">Enter a value to swap from ${adjacent}</h3>
 <div class="col-sm-4"></div>	
</body>
</html>