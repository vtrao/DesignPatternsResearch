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

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * @author rhightower
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class InputWorkflowAction extends DispatchAction {

	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ActionForward step1(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		InputWorkflowForm inputForm = (InputWorkflowForm) form;
		inputForm.setPage(1);
		System.out.println("Step1 " + inputForm.getUserName());
		inputForm.setMethod("step2");
		return mapping.findForward("success");

	}

	public ActionForward step2(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		InputWorkflowForm inputForm = (InputWorkflowForm) form;
		System.out.println("Step2: " + inputForm.getUserName());
		System.out.println("Form " + mapping.getAttribute());

		Enumeration enum = request.getSession().getAttributeNames();
		
		while (enum.hasMoreElements()){
			System.out.println("name: " + enum.nextElement());
		}
		
		
		request.getSession().removeAttribute(mapping.getAttribute());
		inputForm.setPage(2);
		inputForm.reset(mapping, request);
		return mapping.findForward("success");
	}

}
  