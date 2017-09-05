<%@ page errorPage="errorpage.jsp" %>

<html>
  <head>
    <title>UseRequest</title>
  </head>
  <body>
    <%
      out.println("<b>Welcome: " +
        request.getParameter("user") + "</b>");
    %>
  </body>
</html>
ÿ