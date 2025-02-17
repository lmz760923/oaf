/*===========================================================================+
   |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
   |                         All rights reserved.                              |
   +===========================================================================+
   |  HISTORY -                                                                |
   |   05-Nov-2019  arpirai  Created ( This CO deals with the Skill Shuttle    |
   |                         page of the Update Profile Flow)                  |
   +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.TransactionUnitHelper;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.form.OADefaultShuttleBean;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpUpdSkillCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpUpdSkillCO.java 120.0.12020000.1 2020/01/08 08:30:35 spunam noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.webui");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);

    if (!TransactionUnitHelper.isTransactionUnitInProgress(pageContext,
                                                           "empUpdateTxn",
                                                           true))
    {

      // User can't return to the page after committing changes, a navigation error in such case
      OADialogPage dialogPage = new OADialogPage(NAVIGATION_ERROR);
      pageContext.redirectToDialogPage(dialogPage);
    }

    String empId =
      String.valueOf(pageContext.getTransactionValue("empId"));
    Serializable[] params =
    { empId };

    OAApplicationModule am = pageContext.getApplicationModule(webBean);
    am.invokeMethod("initSkills", params);
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
    String message = "";
    OADefaultShuttleBean shuttle =
      (OADefaultShuttleBean) webBean.findChildRecursive("ShuttleRegion1");
    String[] items =
      shuttle.getTrailingListOptionValues(pageContext, shuttle);
    if (items != null)
    {
      for (int i = 0; i < items.length - 1; i++)
      {
        message = items[i] + " , " + message;
      }

      message = message + items[items.length - 1];
    }

    pageContext.putTransactionValue("Trailing_List", message);
  }

}
