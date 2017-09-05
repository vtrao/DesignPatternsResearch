<HTML>
<HEAD>
<TITLE>
Context
</TITLE>
</HEAD>
<BODY>
<%
  // Try to get the USERNAME attribute from the ServletContext
  String userName = (String)application.getAttribute("USERNAME");

  // If there was no attribute USERNAME, then create
  // one and add it to the ServletContext
  if ( userName == null ) {

    // Don't try to add it just, say that you can't find it
    out.println("<b>Could not find a reference to the attribute USERNAME");
  }
  else {

    out.println("<b>The current User is : " + userName + "</b>");
  }
%>
</BODY>
</HTML>
 