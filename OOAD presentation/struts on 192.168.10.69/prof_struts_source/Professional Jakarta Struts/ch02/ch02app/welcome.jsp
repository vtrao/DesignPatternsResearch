<html>
<!-- Set the scripting language to java -->
<%@ page language="java" %>

<HTML>
<HEAD>
<TITLE>Welcome Home</TITLE>
</HEAD>

<BODY>
<table>
  <tr>
    <td>
      Welcome User: <%= request.getParameter("user") %>
    </td>
  </tr>
</table> 