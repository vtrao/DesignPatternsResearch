package ch08;

import org.apache.struts.action.ActionMapping;

public class WileyActionMapping extends ActionMapping {

  protected boolean logResults = false;

  public WileyActionMapping() {

    super();
  }

  public void setLogResults(boolean logResults) {

    this.logResults  = logResults;
  }

  public boolean getLogResults() {

    return logResults;
  }
}
 