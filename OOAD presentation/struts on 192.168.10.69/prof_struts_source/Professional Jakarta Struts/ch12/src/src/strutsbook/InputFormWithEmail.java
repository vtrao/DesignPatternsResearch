/*
 * Created on Jul 24, 2003
 */
package strutsbook;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;


/**
 * @author rhightower
 *
 */
public class InputFormWithEmail extends InputFormWithBirthDate {
	
    private String email; 
    
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		return super.validate(mapping, request);
	}


	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param string
	 */
	public void setEmail(String string) {
		email = string;
	}

}
  OT  L