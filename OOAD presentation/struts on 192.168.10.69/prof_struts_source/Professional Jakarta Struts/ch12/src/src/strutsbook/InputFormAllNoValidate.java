/*
 * Created on Jul 24, 2003
 */
package strutsbook;

import org.apache.struts.validator.ValidatorForm;

/**
 * @author rhightower
 *
 */
public class InputFormAllNoValidate extends ValidatorForm {
	
	private String userName;
	private String birthDate;
	private String email;
	private String creditCard;
	private String firstName;
	private String lastName;
	private String middleName;
	private String website;
	private String password="";
	private String passwordCheck="";
	private String phone;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String string) {
		userName = string;
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
	public String getCreditCard() {
		return creditCard;
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
	public void setCreditCard(String string) {
		creditCard = string;
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

}
 