/*
 * Created on Jul 28, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package strutsbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.ValidatorUtil;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.validator.Resources;
import org.apache.taglibs.standard.lang.support.ExpressionEvaluatorManager;

/**
 * @author rhightower
 *
 */
public class CustomValidatorRules {

	public static boolean validateEL(
		Object bean,
		ValidatorAction va,
		Field field,
		ActionErrors errors,
		HttpServletRequest request) {
		
		PageContext pageContext =	new FakePageContext(request);
		String test = field.getVarValue("test");
		pageContext.setAttribute("form",bean);
		pageContext.setAttribute("field",field);
		String value = ValidatorUtil.getValueAsString(bean, field.getProperty());
		pageContext.setAttribute("value",value);
		System.out.println(value);
		System.out.println(field.getProperty());
		Boolean result = Boolean.FALSE;
		try{
		
		 result = (Boolean) ExpressionEvaluatorManager
						 .evaluate("validateEL", 
                                   test, 
                                   Boolean.class, 
                           		   pageContext);

		}catch (JspException je){
			// TODO fix
			je.printStackTrace();
		}
        boolean r = result.booleanValue();
        if (r == false){
			errors.add(
				field.getKey(),
				Resources.getActionError(request, va, field));
        	
        }
        
        return r;
        
	}
	public static boolean validatePhone(
		Object bean,
		ValidatorAction va,
		Field field,
		ActionErrors errors,
		HttpServletRequest request) {

		String phone =
			ValidatorUtil.getValueAsString(bean, field.getProperty());

		System.out.println("Phone is " + phone);

		char[] chars = phone.toCharArray();
		int numberCount = 0;

		for (int index = 0; index < chars.length; index++) {
			char c = chars[index];
			if (Character.isDigit(c)) {
				System.out.println("Number Count is " + numberCount);
				numberCount++;
			} else if (Character.isWhitespace(c)) {
				//White space okay
			} else if (c == '(' || c == ')' || c == '-') {
				// ()- okay too 
			} else {
				return false;
			}
		}

		if (numberCount != 10) {

			errors.add(
				field.getKey(),
				Resources.getActionError(request, va, field));
			return false;
		} else {
			return true;
		}
	}

	public static boolean validatePhoneExt(
		Object bean,
		ValidatorAction va,
		Field field,
		ActionErrors errors,
		HttpServletRequest request) {

		String sAllowLocal = field.getVarValue("allowLocal");
		boolean allowLocal = sAllowLocal != null && sAllowLocal.equals("true");

		String phone =
			ValidatorUtil.getValueAsString(bean, field.getProperty());

		char[] chars = phone.toCharArray();
		int numberCount = 0;

		for (int index = 0; index < chars.length; index++) {
			char c = chars[index];
			if (Character.isDigit(c)) {
				numberCount++;
			} else if (Character.isWhitespace(c)) {
				//White space okay
			} else if (c == '(' || c == ')' || c == '-') {
				// ()- okay too 
			} else {
				return false;
			}
		}

		if (allowLocal == false && numberCount == 10) {
			return true;
		} else if (
			allowLocal == true && (numberCount == 10 || numberCount == 7)) {
			return true;
		} else {
			errors.add(
				field.getKey(),
				Resources.getActionError(request, va, field));

			return false;
		}

	}

}
 