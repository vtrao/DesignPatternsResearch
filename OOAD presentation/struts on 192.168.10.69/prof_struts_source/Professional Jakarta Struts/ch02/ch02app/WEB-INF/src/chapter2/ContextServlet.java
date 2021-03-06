package chapter2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ContextServlet extends HttpServlet {

  private static final String CONTENT_TYPE = "text/html";

  public void init() throws ServletException {

  }

  public void doGet(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    doPost(request, response);
  }

  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    // Get a reference to the ServletContext
    ServletContext context = getServletContext();

    // Try to get the USERNAME attribute from the ServletContext
    String userName = (String)context.getAttribute("USERNAME");

    // If there was no attribute USERNAME, then create
    // one and add it to the ServletContext
    if ( userName == null ) {

      userName = new String("Bob Roberts");
      context.setAttribute("USERNAME", userName);
    }

    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Context Servlet</title></head>");
    out.println("<body>");

    // Output the current value of the attribute USERNAME
    out.println("<p>The current User is : " + userName + ".</p>");
    out.println("</body></html>");
  }

  public void destroy() {
  }
}
  ir