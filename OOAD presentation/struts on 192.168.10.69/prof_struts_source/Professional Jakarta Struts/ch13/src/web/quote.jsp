<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<tiles:insert page="/siteLayout.jsp" flush="true">
    <tiles:put name="title" type="string"
                     value="Wrox Stock Quote" /> 
    <tiles:put name="header" value="/header.jsp" />
    <tiles:put name="footer" value="/footer.jsp" />
    <tiles:put name="content" type="string">
           <bean:message key="app.price"/>
           <%= request.getAttribute("PRICE") %>
    </tiles:put>
</tiles:insert>

ÿ