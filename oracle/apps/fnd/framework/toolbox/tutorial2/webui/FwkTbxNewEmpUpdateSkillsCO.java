/*===========================================================================+
    |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
    |                         All rights reserved.                              |
    +===========================================================================+
    |  HISTORY -                                                                |
    |   05-Nov-2019  arpirai  Created ( This CO deals with the Skill shuttle    |
    |                         page of the Update Profile Flow)                  |
    +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.TransactionUnitHelper;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.jbo.ApplicationModule;
import oracle.jbo.server.ApplicationModuleImpl;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpUpdateSkillsCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpUpdateSkillsCO.java 120.0.12020000.1 2020/01/08 08:24:46 spunam noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID,
                                   "oracle.apps.fnd.framework.toolbox.tutorial2.webui");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);

    FwkTbxNewEmployeeAMImpl am =
      (FwkTbxNewEmployeeAMImpl) pageContext.getApplicationModule(webBean);
    String voName = new String("FwkTbxNewSkillsVO1");
    String empId = String.valueOf(pageContext.getParameter("empId"));
    Serializable[] param =
    { voName, empId };
    am.invokeMethod("initQuery", param);

    String voNames = new String("FwkTbxNewEmpSkillsVO1");
    Serializable[] params =
    { voNames, empId };
    am.invokeMethod("initQuery", params);

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

    if ("update".equals(pageContext.getParameter(EVENT_PARAM)))
    {

      OAApplicationModuleImpl am =
        (OAApplicationModuleImpl) pageContext.getApplicationModule(webBean);
      String voName = new String("FwkTbxNewEmpSkillsVO1");


      String empId = String.valueOf(pageContext.getParameter("empId"));

      Serializable[] param =
      { voName, empId };


      am.invokeMethod("updateEmployee", param);

    }


  }

}
