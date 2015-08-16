<html>
<body>
	<h2>Hello customerManager!</h2>
	<%@page import="com.sishu.customerManager.Customer"%>

	<%
		System.out.println(" now  in customerManager index");
		new Customer().c1();
	%>
</body>
</html>
