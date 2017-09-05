<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<head>
<title>Input Step 1</title>
</head>

<body>
<h1>Step 1</h1>
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


<html:form action="inputSubmitStep1">

 <bean:message key="inputForm.userName"/>
 <html:text property='userName'/> <br />
 
 <bean:message key="inputForm.password"/>
 <html:password property='password'/> <br />

 <bean:message key="inputForm.passwordCheck"/>
 <html:password property='passwordCheck'/> <br />

 <bean:message key="inputForm.firstName"/>
 <html:text property='firstName'/> <br />
 
 <bean:message key="inputForm.middleName"/>
 <html:text property='middleName'/> <br />

 <bean:message key="inputForm.lastName"/>
 <html:text property='lastName'/> <br />

 <html:hidden property='method'/>
 <html:hidden property='page'/>

 <html:submit value="ok"/>
</html:form>

</body>
</html> 