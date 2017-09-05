/*
 * Created on Aug 21, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package strutsbook;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

/**
 * @author rhightower
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class FakePageContext extends PageContext {
	HttpServletRequest request;
	Hashtable map = new Hashtable();
	
	public FakePageContext(HttpServletRequest request){
	   this.request = request;	
	   
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getAttribute(java.lang.String)
	 */
	public Object getAttribute(String key) {
		return map.get(key);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#setAttribute(java.lang.String, java.lang.Object)
	 */
	public void setAttribute(String key, Object value) {
		map.put(key, value);

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#removeAttribute(java.lang.String)
	 */
	public void removeAttribute(String key) {
		map.remove(key);

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getOut()
	 */
	public JspWriter getOut() {
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getSession()
	 */
	public HttpSession getSession() {
		
		return request.getSession(true);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getPage()
	 */
	public Object getPage() {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getRequest()
	 */
	public ServletRequest getRequest() {
		
		return this.request;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getResponse()
	 */
	public ServletResponse getResponse() {
		// no op
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getException()
	 */
	public Exception getException() {
		// no op
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getServletContext()
	 */
	public ServletContext getServletContext() {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#forward(java.lang.String)
	 */
	public void forward(String arg0) throws ServletException, IOException {
		//no op

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#include(java.lang.String)
	 */
	public void include(String arg0) throws ServletException, IOException {
		//no op

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#initialize(javax.servlet.Servlet, javax.servlet.ServletRequest, javax.servlet.ServletResponse, java.lang.String, boolean, int, boolean)
	 */
	public void initialize(
		Servlet arg0,
		ServletRequest arg1,
		ServletResponse arg2,
		String arg3,
		boolean arg4,
		int arg5,
		boolean arg6)
		throws IOException, IllegalStateException, IllegalArgumentException {
		//no op

	}

	/* (non-Javadoc)
		 * @see javax.servlet.jsp.PageContext#setAttribute(java.lang.String, java.lang.Object, int)
		 */
		public void setAttribute(String key, Object value, int scope) {
			if (scope ==PageContext.PAGE_SCOPE){
				map.put(key, value);
			}else if (scope == PageContext.REQUEST_SCOPE){
				request.setAttribute(key,value);
			}else if (scope==PageContext.SESSION_SCOPE){
				request.getSession().setAttribute(key,value);
			}else if (scope==PageContext.APPLICATION_SCOPE){
				//TODO fix
			}
		}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getAttribute(java.lang.String, int)
	 */
	public Object getAttribute(String key, int scope) {
		if (scope ==PageContext.PAGE_SCOPE){
			return map.get(key);
		}else if (scope == PageContext.REQUEST_SCOPE){
			return request.getAttribute(key);
		}else if (scope==PageContext.SESSION_SCOPE){
			return request.getSession().getAttribute(key);
		}else if (scope==PageContext.APPLICATION_SCOPE){
				return null; //TODO fix
		}else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#removeAttribute(java.lang.String, int)
	 */
	public void removeAttribute(String key, int scope) {
		if (scope ==PageContext.PAGE_SCOPE){
			 map.remove(key);
		}else if (scope == PageContext.REQUEST_SCOPE){
			 request.removeAttribute(key);
		}else if (scope==PageContext.SESSION_SCOPE){
			 request.getSession().removeAttribute(key);
		}else if (scope==PageContext.APPLICATION_SCOPE){
		     //TODO fix
		}else {
			 // no op
		}

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getAttributeNamesInScope(int)
	 */
	public Enumeration getAttributeNamesInScope(int scope) {
		if (scope ==PageContext.PAGE_SCOPE){
			return map.keys();
		}else if (scope == PageContext.REQUEST_SCOPE){
			return request.getAttributeNames();
		}else if (scope==PageContext.SESSION_SCOPE){
			return request.getSession().getAttributeNames();
		}else if (scope==PageContext.APPLICATION_SCOPE){
				return null; //TODO fix
		}else {
			return null;
		}

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#getAttributesScope(java.lang.String)
	 */
	public int getAttributesScope(String arg0) {
		//  No op
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#findAttribute(java.lang.String)
	 */
	public Object findAttribute(String key) {
		Object value = map.get(key);
		if (value == null){
		   value = request.getAttribute(key);	
		}
		if (value == null){
			value = request.getSession().getAttribute(key);
		}
		if (value == null){
			//TODO look it up in app scope
		}
		return value;
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#handlePageException(java.lang.Exception)
	 */
	public void handlePageException(Exception arg0)
		throws ServletException, IOException {
		// No op

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#handlePageException(java.lang.Throwable)
	 */
	public void handlePageException(Throwable arg0)
		throws ServletException, IOException {
		// No op

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.PageContext#release()
	 */
	public void release() {
		// No op

	}

}
