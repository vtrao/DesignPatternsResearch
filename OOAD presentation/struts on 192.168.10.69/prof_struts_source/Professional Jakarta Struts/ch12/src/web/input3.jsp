<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<head>
<title>Input 3</title>
</head>

<body>
<h1>Input 3</h1>
<logic:messagesPresent>
There were errors
<ul>
<font color='red' >
<html:messages id="error">
  <li><%= error %></li>
</html:messages>
</font>
</ul>
</logic:messagesPresent>

<html:form action="inputSubmit3">

 <bean:message key="inputForm.userName"/>
 <html:text property='userName'/> <br />
 
 <html:submit value="ok"/>
</html:form>

</body>
</html> 