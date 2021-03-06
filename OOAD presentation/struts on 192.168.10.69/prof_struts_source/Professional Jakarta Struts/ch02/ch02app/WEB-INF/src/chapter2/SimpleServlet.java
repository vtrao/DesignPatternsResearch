package chapter2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SimpleServlet extends HttpServlet {

  public void init(ServletConfig config)
    throws ServletException {

    // Always pass the ServletConfig object to the super class
    super.init(config);
  }

  //Process the HTTP Get request
  public void doGet(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    doPost(request, response);
  }

  //Process the HTTP Post request
  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head><title>Simple Servlet</title></head>");
    out.println("<body>");

    // Outputs the address of the calling client
    out.println("Your address is " + request.getRemoteAddr()
      + "\n");

    out.println("</body></html>");
    out.close();
  }
}

  