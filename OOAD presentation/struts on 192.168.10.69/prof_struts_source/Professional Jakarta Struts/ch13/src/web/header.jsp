<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ page import="util.DebugUtil" %>
<center>
<table>
<tr>
	<td width="33%" bgcolor="#36566E">
	  &nbsp;<tiles:getAsString name="leftTitle" ignore="true"/>
	</td>
	<td>
	<td width="33%">
	    <font color="#36566E">
	        <tiles:getAsString name="title" ignore="true"/>
	    </font>
	</td>
	<td width="33%" bgcolor="#36566E">
	   &nbsp;<tiles:getAsString name="rightTitle" ignore="true"/>
	</td>
</tr>
</table>
</center>

    <font color="#0000FF" >
          <!-- DebugUtil.listTileScope(pageContext); -->  
     </font>
ÿ