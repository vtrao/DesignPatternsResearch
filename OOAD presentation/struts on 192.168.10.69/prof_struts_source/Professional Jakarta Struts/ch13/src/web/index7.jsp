<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%@ page import="org.apache.struts.tiles.beans.SimpleMenuItem" %>
<tiles:insert definition="siteLayoutDef5"
              controllerClass="tilesapp.SimpleController">
    <tiles:put name="content" value="indexContent5.jsp" />        
</tiles:insert>


 