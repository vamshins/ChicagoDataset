<%@ page language="java" import="org.chicagopolice.model.*, java.util.List, java.util.Iterator"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chicago Police</title>
<link href="../src/perfect-scrollbar.css" rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="../src/perfect-scrollbar.js"></script>
<style>
#iframe {
	width: 100%;
	min-height: 450px;
	border: 0;

</style>
<script type="text/javascript">
			function loadintoIframe(info) {
				if (typeof info.id !== 'undefined' && typeof info.src !== 'undefined') {
					document.getElementById(info.id).src = info.src;
					
				}
			}			
			window.onload = function(){
				document.forms['f'].elements['b'].onclick = function(){
					loadintoIframe({id:"myiframe",src:document.forms['f'].elements['u'].value});
				}
			}
		</script>
</head>
<body>
	<h1>Chicago Police</h1>
	<br>

	<form action="BlockController" method="post">
		Enter the location you want to search: <input type="text" name="block"><br>
		<br> <br> <input type="submit" value="Submit">
	</form>

	<!-- <iframe src="BlockResults.jsp" id="myiframe" frameborder="0" width="600" height="350"></iframe> -->

</body>
</html>