<%@ taglib uri="struts-html"  prefix="html" %>
<%@ taglib uri="struts-bean"  prefix="bean" %>
<%@ taglib uri="struts-logic" prefix="logic" %>

<html>

<body>

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

<html:form action="inputSubmit">

 <bean:message key="inputForm.userName"/>
 <html:text property='userName'/> <br />
 
 <html:submit value="ok"/>
</html:form>

</body>
</html> 