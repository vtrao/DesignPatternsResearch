<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<jsp:include page="siteLayoutDefinition.jsp"/>

<tiles:insert beanName="siteLayoutDef" beanScope="application">
    <tiles:put name="content" type="string">
           <bean:message key="app.price"/>
           <%= request.getAttribute("PRICE") %>
    </tiles:put>
</tiles:insert>

 