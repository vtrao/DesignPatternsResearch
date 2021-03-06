package chapter2;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ParameterServlet extends HttpServlet {

  // Process the HTTP GET request
  public void doGet(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    doPost(request, response);
  }

  // Process the HTTP POST request
  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head><title>Parameter Servlet</title></head>");
    out.println("<body>");

    // Get an enumeration of the parameter names
    Enumeration parameters = request.getParameterNames();

    String param = null;

    // Iterate over the paramter names, getting the parameters values
    while ( parameters.hasMoreElements() ) {

      param = (String)parameters.nextElement();
      out.println(param + " : " +
        request.getParameter(param) +
        "<BR>");
    }

    out.println("</body></html>");
    out.close();
  }
}
  