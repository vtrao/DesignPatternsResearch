<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="util.DebugUtil" %>


<tiles:importAttribute />



<html>
  <head>
    <logic:present name="title">
        <title><tiles:getAsString name="title" ignore="true"/></title>
    </logic:present>    
  </head>

  <body>
    <table width="500" border="0" cellspacing="0" cellpadding="0">

      <tr bgcolor="#36566E"> 
        <td height="68" width="70%"> 
          <div align="left">
   <img src="images/hp_logo_wiley.gif" width="220" height="74">
          </div>
        </td>
      </tr>

      <tr>
        <td height="68" width="2000">  
            <tiles:insert attribute="header" ignore="true">
               <tiles:put name="title" beanName="title" beanScope="tile"/>
               <tiles:put name="user" beanName="user" beanScope="session"/>
            </tiles:insert>
         </td>   
      </tr>
      
      <table>
      <tr>
        <td width="50%">
        <ul>
        <logic:iterate id="item" name="items" 
                   type="org.apache.struts.tiles.beans.MenuItem" >
           <li>

			<tiles:insert definition="linkLayoutDef">
			    <tiles:put name="item" 
			               beanName="item" beanScope="page"/>        
			</tiles:insert>
		   
           </li>
		</logic:iterate>
        </ul>
        </td>
        <td width="50%">
            <div align="center">
            <tiles:insert attribute="content"/>
            </div>
        </td>
      </tr>
      </table>
      
      <tr>
        <td>
            <tiles:insert attribute="footer" ignore="true"/>
        </td>
      </tr>
      
    </table>
    
    <font color="#FF0000" >
          <!-- DebugUtil.debug(pageContext); -->  
     </font>
  </body>
  
  
  
</html>
  b