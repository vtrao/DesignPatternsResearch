package tilesapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;




public class SimpleSimulateLoginAction extends Action {

  public ActionForward execute(ActionMapping mapping,
    ActionForm form,
    HttpServletRequest request,
    HttpServletResponse response)
    throws IOException, ServletException {
    	
    System.out.println("############## Simulate a User Loggin IN");

    // Default target to success
    String target = new String("success");
    UserDomainObject user = new UserDomainObject();
    user.setFirstName("Rick");
    user.setLastName("Hightower");
    user.setPassword("foobarRules");
    user.setUserName("RickHigh");
    user.setAge(41);
    user.setPhoneNumber("520-555-1212");
    user.setEmail("rick_m_hightower@hotmail.com");
    request.getSession().setAttribute("user", user);
    System.out.println(user);
    return (mapping.findForward(target));
  }
}
  ���	