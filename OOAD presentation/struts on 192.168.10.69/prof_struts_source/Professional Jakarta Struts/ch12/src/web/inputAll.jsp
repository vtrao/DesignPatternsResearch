<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<head>
<title>Input All</title>
<html:javascript formName="inputFormAll"/>
</head>

<body>
<h1>Input All</h1>
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

<html:form action="inputSubmitAll"
           onsubmit="return validateInputFormAll(this)">

 <bean:message key="inputForm.userName"/>
 <html:text property='userName'/> <br />
 
 <bean:message key="inputForm.password"/>
 <html:text property='password'/> <br />

 <bean:message key="inputForm.passwordCheck"/>
 <html:text property='passwordCheck'/> <br />

 <bean:message key="inputForm.firstName"/>
 <html:text property='firstName'/> <br />
 
 <bean:message key="inputForm.middleName"/>
 <html:text property='middleName'/> <br />

 <bean:message key="inputForm.lastName"/>
 <html:text property='lastName'/> <br />

 <bean:message key="inputForm.website"/>
 <html:text property='website'/> <br />

 <bean:message key="inputForm.birthDate"/>
 <html:text property='birthDate'/> <br />

 <bean:message key="inputForm.email"/>
 <html:text property='email'/> <br />

 <bean:message key="inputForm.creditCard"/>
 <html:text property='creditCard'/> <br />

 <bean:message key="inputForm.phone"/>
 <html:text property='phone'/> <br />

 <html:submit value="ok"/>
 <html:cancel onclick="bCancel=true"/>
</html:form>

</body>
</html>