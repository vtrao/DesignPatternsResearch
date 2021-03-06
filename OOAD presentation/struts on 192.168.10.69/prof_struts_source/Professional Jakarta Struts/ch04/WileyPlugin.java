package ch04;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;

import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import org.apache.struts.action.ActionServlet;

public class WileyPlugin implements PlugIn {

  public static final String PROPERTIES = "PROPERTIES";

  public WileyPlugin() {

  }

  public void init(ActionServlet servlet,
    ModuleConfig applicationConfig)
    throws javax.servlet.ServletException {

    System.err.println("---->The Plugin is starting<----");
    Properties properties = new Properties();

    try {

      File file =
        new File("./web/WEB-INF/props.txt");

      FileInputStream fis =
        new FileInputStream(file);

      properties.load(fis);

      ServletContext context = servlet.getServletContext();
      context.setAttribute(PROPERTIES, properties);

      Properties rProperties = (Properties)context.getAttribute(PROPERTIES);
      System.err.println("---->Prop: LDAP " + rProperties.getProperty("LDAP"));
    }
    catch (FileNotFoundException fnfe) {

      System.err.println(fnfe.getMessage());
      throw new ServletException(fnfe.getMessage());
    }
    catch (IOException ioe) {

      throw new ServletException(ioe.getMessage());
    }
  }

  public void destroy() {

    // We don't have anything to clean up, so
    // just log the fact that the Plugin is shutting down
    System.err.println("---->The Plugin is stopping<----");
  }
}
  TR