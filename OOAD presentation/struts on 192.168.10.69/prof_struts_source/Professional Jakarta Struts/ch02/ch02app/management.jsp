<html>
<!-- Set the scripting language to java -->
<%@ page language="java" %>

<HTML>
<HEAD>
<TITLE>Management Console</TITLE>
</HEAD>

<BODY>
<table>
  <tr>
    <td>
      Welcome Manager: <%= request.getParameter("user") %>
    </td>
  </tr>
</table> 