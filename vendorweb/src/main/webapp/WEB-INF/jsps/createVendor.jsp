<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>
	<form action="saveVendor" method="POST">
	<pre>
		Id : <input type="text" name="id">
		Code : <input type="text" name="code">
		Name : <input type="text" name="name">		
		Type: <select name="type">
				<option ${vendor.type == 'Regular' ? 'selected' : ''}>Regular</option>
				<option ${vendor.type == 'Contract' ? 'selected' : ''}>Contract</option>
	 		 </select>		
		E-Mail : <input type="text" name="email">
		Phone : <input type="text" name="phone">
		Address : <input type="text" name="address">
		<input type="submit" value="save"/>
	</pre>	
	</form>
	${msg}
	
	<a href="displayVendors">View All</a>
</body>
</html>