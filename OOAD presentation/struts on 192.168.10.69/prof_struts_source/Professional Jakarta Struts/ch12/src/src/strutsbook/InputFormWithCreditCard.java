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
public class InputFormWithCreditCard extends InputFormWithEmail {
	
    private String creditCard; 
    
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		return super.validate(mapping, request);
	}

	/**
	 * @return
	 */
	public String getCreditCard() {
		return creditCard;
	}

	/**
	 * @param string
	 */
	public void setCreditCard(String string) {
		creditCard = string;
	}

}
  OT 