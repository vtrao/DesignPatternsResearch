<html>
  <head>
    <title>Include Example</title>
  </head>
  <body>
    <table width="100%" cellspacing="0">
      <tr>
        <td align="left">
          <jsp:include page="header.jsp" flush="true">
            <jsp:param name="user"
              value='<%= request.getParameter("user") %>' />
          </jsp:include>
        </td>
      </tr>
    </table>
  </body>
</html>
 