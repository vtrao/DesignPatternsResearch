<!-- Set the scripting language to java -->
<%@ page language="java" %>

<HTML>
<HEAD>
<TITLE>Bean Example</TITLE>
</HEAD>

<BODY>

<!-- Instantiate the Counter bean with an id of "counter" -->
<jsp:useBean id="counter" scope="session" class="chapter2.Counter" />

<%

  // write the current value of the property count
  out.println("Count from scriptlet code : "
    + counter.getCount() + "<BR>");

%>

<!-- Get the the bean's count property, -->
<!-- using the jsp:getProperty action. -->
Count from jsp:getProperty :
  <jsp:getProperty name="counter" property="count" /><BR>

</BODY>
</HTML>
 