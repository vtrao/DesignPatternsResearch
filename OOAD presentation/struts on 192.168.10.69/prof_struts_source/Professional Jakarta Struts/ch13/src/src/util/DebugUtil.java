/*
 * Created on Jul 2, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.JspException;

import org.apache.struts.taglib.tiles.ComponentConstants;
import org.apache.struts.tiles.ComponentContext;

import java.io.IOException;

/**
 * @author rhightower
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class DebugUtil {
	
    
    public static void listScope(PageContext context, int scope) throws JspException, IOException{
		JspWriter out = context.getOut();
		switch (scope){
			case PageContext.PAGE_SCOPE : 
			    out.println("--- Page Attributes --- <br />");
			    break;
			case PageContext.REQUEST_SCOPE : 
				out.println("--- Request Attributes --- <br />");
				break;
			case PageContext.SESSION_SCOPE : 
				out.println("--- SESSION Attributes --- <br />");
				break;
			case PageContext.APPLICATION_SCOPE : 
				out.println("--- APPLICATION Attributes --- <br />");
				break;
		}
		
		Enumeration enums = context.getAttributeNamesInScope(scope);
		while(enums.hasMoreElements()){
			String name = (String)enums.nextElement();
			Object value = context.getAttribute(name, scope);
			printNameValueType(name, value, out);
		}
		
		
		out.println("--------------------------- <br />");
	
    }
    
    private static void printNameValueType(String name, Object value, JspWriter out) throws IOException{

        if (value !=null){
        
		out.println(name + " = " +  value
		+ " type (" +  value.getClass().getName()+ ") " +  
		 "<br /><br />");
		 
        }else{
			out.println(name + " = " +  value +  
			 "<br /><br />");
		 

        }
    	
    }

    public static void listParameters(PageContext context)throws JspException, IOException{
		JspWriter out = context.getOut();
		Map map = context.getRequest().getParameterMap();
		Iterator iter = map.entrySet().iterator();
		
		out.println("--- Request Parameters --- <br />");
		while (iter.hasNext()){
			Map.Entry next = (Map.Entry) iter.next();
			if (next.getValue() instanceof String){
			    out.println(next.getKey() + " = " + next.getValue() + "<br /><br />");
			}
			else if (next.getValue() instanceof String[]){
				StringBuffer buf = new StringBuffer(100);
				String[] values = (String[])next.getValue();
				buf.append("{");
				for (int index = 0; index < values.length; index++){
				  buf.append(values[index]);
				  buf.append(",");	
				}
				buf.append("}");
				out.println(next.getKey() + " = " + buf.toString() + "<br /><br />");
			}
			
		}
		out.println("-------------------------- <br />");
    }
    
	public static void listTileScope(PageContext context) throws JspException, IOException {
		JspWriter out = context.getOut();
		ComponentContext compContext = (ComponentContext)context.getAttribute( ComponentConstants.COMPONENT_CONTEXT, PageContext.REQUEST_SCOPE);
	    out.println("--- TILE Attributes --- <br />");
		
			
	    if (compContext!=null){ 
	    
			Iterator iter = compContext.getAttributeNames();
			while(iter.hasNext()){
				String name = (String)iter.next();
				Object value = compContext.getAttribute(name);
				printNameValueType(name, value, out);
			}
	    }else{
			out.println("--- TILE Attributes NOT FOUND --- <br />");
	    }
			
			
		out.println("--------------------------- <br />");

	}

	public static void debug(PageContext context) throws JspException, IOException{
	    JspWriter out = context.getOut();
		out.println("<br /> -------------------------- <br />");
		out.println("---------D---------------- <br />");
		out.println("----------E--------------- <br />");
		out.println("-----------B-------------- <br />");
		out.println("------------U------------- <br />");
		out.println("-------------G------------ <br />");
		out.println("-------------------------- <br />");
		
		listTileScope(context);
		
	    listScope(context, PageContext.PAGE_SCOPE);
	    listScope(context, PageContext.REQUEST_SCOPE);
	    listScope(context, PageContext.SESSION_SCOPE);
	    listScope(context, PageContext.APPLICATION_SCOPE);
	    
	    
	    listParameters(context);
	    
	}

}
  5~