/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY
 | 05-Nov-2019  SRSIDDAM    Initial Version
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

/**
 * Controller for ...
 */
public class FwkTbxSkillsCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxSkillsCO.java 120.0.12020000.2 2020/03/24 08:24:05 spunam noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID, "%oracle.apps.fnd.framework.toolbox.tutorial2.webui%");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);
    final String currentClassName = "FwkTbxSkillsCO";
    if (pageContext.isLoggingEnabled(1))
      pageContext.writeDiagnostics(this, currentClassName + " : Entered",
                                   1);
    FwkTbxNewEmployeeAMImpl am =
      (FwkTbxNewEmployeeAMImpl) pageContext.getApplicationModule(webBean);
    String voName = new String("FwkTbxNewSkillsVO1");
    String empId = String.valueOf(pageContext.getSessionValue("empId"));
    if (pageContext.isLoggingEnabled(1))
      pageContext.writeDiagnostics(this,
                                   currentClassName + " : parameter empId is:" +
                                   empId, 1);
    Serializable[] param =
    { voName, empId };
    am.invokeMethod("initQuery", param);
    String voName1=new String("FwkTbxNewEmpSkillsDetVO1");
    Serializable[] param1={voName1,empId};
    am.invokeMethod("initQuery",param1);

      
    if (pageContext.isLoggingEnabled(1))
      pageContext.writeDiagnostics(this, currentClassName + " : Ended", 1);
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext,
                                 OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
  }

}
