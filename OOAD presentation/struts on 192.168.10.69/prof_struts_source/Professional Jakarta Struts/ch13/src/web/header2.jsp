
<!--Header2.jsp Begin -->
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page import="util.DebugUtil" %>
<center>
<table>
<tr>


<tiles:useAttribute id="user"
                    name="user" 
                    classname="tilesapp.UserDomainObject" 
                    />

	<td width="33%" bgcolor="#36566E">
	  &nbsp;
	   <div align='left'>
	   <font size="1" color="orange">
		   
		   currently logged in as 
		   <bean:write name="user" property="userName"/>
		  
	   </font>
	   </div>
	   &nbsp;
	</td>
	
	
	<td width="33%">
	    &nbsp;
	    <font color="#36566E">
	        <tiles:getAsString name="title" ignore="true"/>
	    </font>    	
	    &nbsp;
	</td>
	
	<td width="33%" bgcolor="#36566E">
	   &nbsp;
	   <div align='left'>
	   <font size="1" color="white">
	       <blockquote>
		   <bean:write name="user" property="firstName"/> <br />
		   <bean:write name="user" property="lastName"/> <br />
		   </blockquote>
	   </font>
	   </div>
	   &nbsp;
	</td>
</tr>
</table>
</center>
<!--Header2.jsp END -->  �R 