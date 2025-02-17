/*===========================================================================+
  |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
  |                         All rights reserved.                              |
  +===========================================================================+
  |  HISTORY -                                                                |
  |   05-Nov-2019  arpirai  Created ( This CO deals with the Skill Rating Bar
  |                         page of the Update Profile Flow)
  +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpUpdateAMImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.TransactionUnitHelper;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.jbo.ApplicationModule;
import oracle.jbo.server.ApplicationModuleImpl;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpRatingBarUpdateCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpRatingBarUpdateCO.java 120.0.12020000.1 2020/01/08 08:20:13 spunam noship $";
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


    FwkTbxNewEmpUpdateAMImpl am =
      (FwkTbxNewEmpUpdateAMImpl) pageContext.getApplicationModule(webBean);


    String newSkillVoName = new String("FwkTbxNewSkillsVO1");
    String newEmpSkillVoName = new String("FwkTbxNewEmpSkillsVO1");

    String empId =
      String.valueOf(pageContext.getTransactionValue("empId"));

    Serializable[] param1 =
    { newSkillVoName, empId };

    Serializable[] param2 =
    { newEmpSkillVoName, empId };

    am.invokeMethod("initQuery", param1);
    am.invokeMethod("initQuery", param2);

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
