<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

   <tiles:useAttribute id="item"
          name="item" 
          classname="org.apache.struts.tiles.beans.MenuItem" 
                    />
   <bean:define id="link" name="item" property="link"
                type="java.lang.String"/>
   
   <logic:match name="link" location="start" value="/" >
       <html:link page="<%=link%>" >	
           <bean:write name="item" property="value"/>
   	   </html:link>
   </logic:match>
   <logic:notMatch name="link" location="start" value="/" >
       <html:link href="<%=link%>">	
           <bean:write name="item" property="value"/>
   	   </html:link>
   </logic:notMatch>
  �