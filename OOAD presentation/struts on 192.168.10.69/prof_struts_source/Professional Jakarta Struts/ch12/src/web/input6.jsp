<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<head>
<title>Input 6</title>
</head>

<body>
<h1>Input 6</h1>
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

<html:form action="inputSubmit6">

 <bean:message key="inputForm.userName"/>
 <html:text property='userName'/> <br />
 
 <bean:message key="inputForm.birthDate"/>
 <html:text property='birthDate'/> <br />

 <bean:message key="inputForm.email"/>
 <html:text property='email'/> <br />

 <bean:message key="inputForm.creditCard"/>
 <html:text property='creditCard'/> <br />

 <html:submit value="ok"/>
</html:form>

</body>
</html>  