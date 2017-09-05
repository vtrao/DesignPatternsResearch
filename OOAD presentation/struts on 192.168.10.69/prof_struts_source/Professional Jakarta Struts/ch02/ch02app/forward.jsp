<<html>
  <head>
    <title>JSP Forward Example</title>
  </head>
  <body>
    <%
      
      if ( (request.getParameter("role")).equals("manager") ) {

        %>
          <jsp:forward page="management.jsp" />
        <% 
      }
      else {
        %>
          <jsp:forward page="welcome.jsp">
          <jsp:param name="user"
            value='<%=request.getParameter("user") %>' />
          </jsp:forward>
        <%
      }
    %>
  </body>
</html>
 