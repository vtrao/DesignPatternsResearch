<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<head>
<title>Step 2</title>
</head>

<body>
<h1>Step 2</h1>
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

<html:form action="inputSubmitStep2">

 <bean:message key="inputForm.website"/>
 <html:text property='website'/> <br />

 <bean:message key="inputForm.birthDate"/>
 <html:text property='birthDate'/> <br />

 <bean:message key="inputForm.email"/>
 <html:text property='email'/> <br />

 <bean:message key="inputForm.phone"/>
 <html:text property='phone'/> <br />
 
 <html:hidden property='method'/>
 <html:hidden property='page'/>
 

 <html:submit value="ok"/>
</html:form>

</body>
</html>  Fs