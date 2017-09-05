<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<tiles:insert page="/siteLayout.jsp" flush="true">
    <tiles:put name="title" type="string"
                     value="Get Wrox Stock Quote" /> 
    <tiles:put name="header" value="/header.jsp" />
    <tiles:put name="footer" value="/footer.jsp" />
    <tiles:put name="content" value="/indexContent.jsp"/>
</tiles:insert>


ÿ