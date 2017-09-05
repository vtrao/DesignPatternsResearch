<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%@ page import="org.apache.struts.tiles.beans.SimpleMenuItem" %>
<tiles:insert definition="siteLayoutDef4">
    <tiles:put name="title" type="string" 
               value="Get Wrox Stock Quote6" /> 
    <tiles:put name="content" value="indexContent5.jsp"/>
        
    <tiles:putList name="items" >
        <jsp:useBean id="item1" class="SimpleMenuItem"/>
        <jsp:setProperty name="item1" property="link"  
                         value="/index.html"/>
        <jsp:setProperty name="item1" property="value" 
                         value="Home" />
        <tiles:add beanName="item1"/>
    </tiles:putList>
</tiles:insert>


 