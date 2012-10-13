<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
</head>
<body>
  <div class="body">
  
  
  	<g:form action="save">
  		
  		<g:hiddenField name="tweetOriginalId" value="${tweetOriginalId?tweetOriginalId:''}"/>
  		
  		<g:textArea name="texto" placeholder="un lindo tweet">${texto?texto:''}</g:textArea>
  		
  		<g:submitButton name="Twittear!"/>
  	
  	</g:form>
  
  </div>
</body>
</html>