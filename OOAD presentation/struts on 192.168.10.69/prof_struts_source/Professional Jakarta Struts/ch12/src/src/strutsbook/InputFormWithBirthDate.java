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
public class InputFormWithBirthDate extends InputForm {
	
	public String birthDate;


	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		return super.validate(mapping, request);
	}

	/**
	 * @return
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param string
	 */
	public void setBirthDate(String string) {
		birthDate = string;
	}

}
 