<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<jsp:include page="siteLayoutDefinition.jsp"/>

<tiles:insert beanName="siteLayoutDef" beanScope="application">
    <tiles:put name="title" type="string" 
               value="Get Wrox Stock Quote 2" /> 
    <tiles:put name="content" value="indexContent2.jsp"/>
</tiles:insert>


ÿ