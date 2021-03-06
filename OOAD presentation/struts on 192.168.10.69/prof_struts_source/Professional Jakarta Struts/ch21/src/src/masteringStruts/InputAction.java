/*
 * Created on Jul 24, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package masteringStruts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


/**
 * @author rhightower
 * @struts.action path="/inputSubmit" name="inputForm"
 *                validate="true" input="/input.jsp" 
 *                attribute="employeeForm"
 * 
 * @struts.action-forward name="success" path="/success.jsp"
 * @struts.action-forward name="resubmit" path="/resubmit.jsp"
 *
 * @struts.action path="/input" parameter="loadAddForm">
 * @struts.action-forward name="input-success" path="/input.jsp"/>
 *
 */
public class InputAction extends Action {

	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		ActionMessages messages = new ActionMessages();
		
		
		
		ActionMessage message = new ActionMessage("inputForm.greet");
		messages.add(ActionMessages.GLOBAL_MESSAGE, message);

		String num =
			this.getResources(request).getMessage("inputForm.messageNum");
		
		int messageCount = Integer.parseInt(num);
		for(int index=0; index<messageCount; index++){
			String messageKey="inputForm.message" + index;
			message = new ActionMessage(messageKey);
			messages.add(ActionMessages.GLOBAL_MESSAGE, message);
		}
		saveMessages(request,messages);
		
		System.out.println(Globals.MESSAGE_KEY);
		if (messages == 
		     request.getAttribute(Globals.MESSAGE_KEY)){
		   System.out.println("its there can't you see it");     	
		}
		
		

		if ("loadAddForm".equals(mapping.getParameter())) {
			return loadAddUserForm(mapping, form, request, response);
		} else {
			return add(mapping, form, request, response);
		}

	}

	public ActionForward loadAddUserForm(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {
		saveToken(request);
		return mapping.findForward("success");
	}

	public ActionForward add(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		if (isCancelled(request)) {
			System.out.println("this submission has been cancelled");
			return mapping.findForward("home");
		} else if (isTokenValid(request, true)) {
			InputForm inputForm = (InputForm) form;
			System.out.println(inputForm.getUserName());
			return mapping.findForward("success");
		} else {
			System.out.println("Can't resubmit the same form twice");
			return mapping.findForward("resubmit");
		}

	}

}
  �m�5