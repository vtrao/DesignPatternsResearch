/*
 * Created on Jul 24, 2003
 */
package strutsbook;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * @author rhightower
 *
 */
public class InputForm extends ValidatorForm {
	
	public String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String string) {
		userName = string;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		return super.validate(mapping, request);
	}

}
  n-��