/*===========================================================================+
 | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 | All rights reserved. |
 +===========================================================================+
 | HISTORY |
 | 09-Sep-19 richanan Created. |
 |===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpAssetInfoGraphCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpAssetInfoGraphCO.java 120.0.12020000.2 2020/01/13 16:40:22 spunam noship $";
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

    String vo1Name = new String("FwkTbxNewEmpTrendGraph3VO1");

    Serializable[] param1 =
    { vo1Name };
   
    am.invokeMethod("initGraphQuery", param1);
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
