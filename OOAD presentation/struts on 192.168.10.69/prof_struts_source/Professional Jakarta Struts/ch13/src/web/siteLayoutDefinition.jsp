<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<logic:notPresent name="siteLayoutDef" scope="application">
  <tiles:definition id="siteLayoutDef"
                    page="/siteLayout.jsp"
                    scope="application">
    <tiles:put name="title" type="string"
                     value="Wrox Stock Quote System" /> 
    <tiles:put name="header" value="/header.jsp" />
    <tiles:put name="footer" value="/footer.jsp" />
    <tiles:put name="content" type="string">
       Content goes here
    </tiles:put>
  </tiles:definition>
</logic:notPresent>
  col