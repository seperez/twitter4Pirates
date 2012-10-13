<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
</head>
<body>
  <div class="body">
  
  
  	<ul>
	  	<g:each in="${tweets}" var="tweet">
	  	
	  		<li>
	  			${tweet.texto} <em>${tweet.user.name}</em>
	  		</li>
	  	</g:each>
  	</ul>
  
  </div>
</body>
</html>