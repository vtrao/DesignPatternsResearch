<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:form action="Lookup5"> 
  <table width="45%" border="0">
    <tr>
      <td><bean:message key="app.symbol" />:</td>
      <td><html:text property="symbol" /></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><html:submit /></td>
    </tr>
  </table>
</html:form>

 