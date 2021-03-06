<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<head>
<title>Input User</title>
<html:javascript formName="inputForm"/>
</head>

<body>

<h1>Input User</h1>

<ul>
<font color='green' >
<html:messages id="message" message="true">
  <li><%= message %></li>
</html:messages>
</font>
</ul>

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

<html:form action="inputSubmit"
           onsubmit="return validateInputFormAll(this)">


<logic:messagesPresent property="userName">
    <font size="4" color="red">
</logic:messagesPresent>
<bean:message key="inputForm.userName"/>:
<logic:messagesPresent property="userName">
    </font>
</logic:messagesPresent>
 <html:text property='userName'/> 
 <html:messages id="message" property='userName'>
 <font color="red">
 <%=message%>
 </font>
 </html:messages>
 <br />
 
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

<%
util.DebugUtil.debug(pageContext);
%>
</body>
</html>    