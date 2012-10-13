<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
</head>
<body>
  <div class="body">
  
  
  	<h1>Login al sistema</h1>
  
  	<g:if test="${flash.message}">
	  	<div style="background-color: red;">
	  		${flash.message}
	  	</div>
  	</g:if>
  
  	<g:form action="authenticate">
  		
  		<g:textField name="username" placeholder="usuario"/>
  		<g:passwordField name="password" placeholder="password"/>
  		
  		<g:submitButton name="Ingresar"/>
  	
  	</g:form>
  
  </div>
</body>
</html>