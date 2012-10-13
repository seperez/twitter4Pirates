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
	  			${tweet.texto} 
	  			<em>
		  			<g:link action="showByUser" controller="tweet" 
		  			params="[userId: tweet.user.id]">
		  			${tweet.user.name}</g:link>
	  			</em> -> 
	  			<g:link action="responder" controller="tweet" 
	  			params="[tweetOriginalId: tweet.id]">
	  			Responder</g:link>
	  			<g:link action="show" params="[tweetId: tweet.id]">
	  				Ver conversacion
	  			</g:link>
	  		</li>
	  	</g:each>
  	</ul>
  
  </div>
</body>
</html>