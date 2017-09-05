<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ page import="util.DebugUtil" %>

<html>
  <head>
    <title><tiles:getAsString name="title" ignore="true"/></title>
  </head>

  <body>
    <table width="500" border="0" cellspacing="0" cellpadding="0">

      <tr bgcolor="#36566E"> 
        <td height="68" width="70%"> 
          <div align="left">
   <img src="images/hp_logo_wiley.gif" >
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
      <tr>
        <td>
            <div align="center">
            <tiles:insert attribute="content"/>
            </div>
        </td>
      </tr>
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
