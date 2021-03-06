/*
 * Created on Jul 24, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package strutsbook;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author rhightower
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class InputActionAll extends Action {

	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {
			InputFormAll inputForm = (InputFormAll) form;
			System.out.println(inputForm.getUserName());
			
			String name ="";
			Enumeration enum = request.getParameterNames();
			while(enum.hasMoreElements()){
				System.out.println("request param: " + 
				    enum.nextElement());
			}
			System.out.println("Key: " + Globals.CANCEL_KEY);
			System.out.println("Value: " + 
			        request.getParameter(Globals.CANCEL_KEY));
	if (this.isCancelled(request)){
		System.out.println("this submission has been cancelled");
	} 
			return mapping.findForward("success");
	}

}
 