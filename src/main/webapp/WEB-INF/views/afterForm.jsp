<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>You're details are:</p>
<p>${person.getFirstName()} <br />
${person.getSurname()}<br />
${person.getAge()}<br />
${person.getEmail()}</p>

<a href = "<%= request.getContextPath()%>/nextPage">This is a link to the next page</a>

</body>
</html>