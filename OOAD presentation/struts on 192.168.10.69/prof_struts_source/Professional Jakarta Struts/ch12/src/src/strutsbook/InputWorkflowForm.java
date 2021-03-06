/*
 * Created on Jul 24, 2003
 */
package strutsbook;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * @author rhightower
 *
 */
public class InputWorkflowForm extends ValidatorForm {
	
	private String userName;
	private String birthDate;
	private String email;
	private String firstName;
	private String lastName;
	private String middleName;
	private String website;
	private String password="";
	private String passwordCheck="";
	private String phone;
	
	private String method="step1";

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String string) {
		userName = string;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = super.validate(mapping, request);
		
		if (!(password.equals(passwordCheck))){	
			errors.add(
				"password",
				new ActionError("errors.password.nomatch"));
		}
		return errors;
	}

	/**
	 * @return
	 */
	public String getBirthDate() {
		return birthDate;
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
	public void setBirthDate(String string) {
		birthDate = string;
	}


	/**
	 * @param string
	 */
	public void setEmail(String string) {
		email = string;
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @return
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param string
	 */
	public void setFirstName(String string) {
		firstName = string;
	}

	/**
	 * @param string
	 */
	public void setLastName(String string) {
		lastName = string;
	}

	/**
	 * @param string
	 */
	public void setMiddleName(String string) {
		middleName = string;
	}

	/**
	 * @param string
	 */
	public void setWebsite(String string) {
		website = string;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return
	 */
	public String getPasswordCheck() {
		return passwordCheck;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @param string
	 */
	public void setPasswordCheck(String string) {
		passwordCheck = string;
	}

	/**
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param string
	 */
	public void setPhone(String string) {
		phone = string;
	}


	/* (non-Javadoc)
	 * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		super.reset(mapping, request);
        System.out.println("RESET");
        if(this.getPage()==2){
			this.setMethod("step1");
			this.setBirthDate("");
			this.setEmail("");
			this.setFirstName("");
			this.setLastName("");
			this.setMiddleName("");
			this.setUserName("");
			this.setPassword("");
			this.setPasswordCheck("");
			this.setPhone("");
			this.setWebsite("");
        }
	}

	/**
	 * @return
	 */
	public String getMethod() {
		return method;
	}


	/**
	 * @param string
	 */
	public void setMethod(String string) {
		method = string;
	}


}
  �ors 