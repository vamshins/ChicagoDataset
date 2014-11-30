<%@ page language="java" import="java.util.List, java.util.Iterator" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Block Results</title>

</head>
<body>
	<%
		List blockresults = (List) request
				.getAttribute("blockresults");

		// print the information about every category of the list
		Iterator<String> iterator = blockresults.iterator();
		String[] blockresultsarray = new String[blockresults.size()];
		System.out.println(blockresults.size());
		int i = 0;
		while (iterator.hasNext()) {
			blockresultsarray[i] = (String) iterator.next();
			/* out.println(blockresultsarray[i]); */
			i++;
		}
		
	%>

    
    
	<br>
	<br>
	<form action="BlockLatAndLong" method="post">
		Select the location you want to search: 
		<select label="BlockList" name="blockresultsselect">
        <c:forEach var="block" items="${blockresults}">
            <option>${block}<option/>
        </c:forEach>
    </select><br>
		<br> <br> <input type="submit" value="Submit">
	</form>
</body>
</html>