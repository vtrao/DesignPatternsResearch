<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<tiles:insert definition="siteLayoutDef">
    <tiles:put name="content" type="string">
           <bean:message key="app.price"/>
           <%= request.getAttribute("PRICE") %>
    </tiles:put>
</tiles:insert>

 