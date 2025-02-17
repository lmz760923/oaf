/*===========================================================================+
  | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA             |
  | All rights reserved.                                                       |
  +============================================================================+
  | HISTORY                                                                    |
  | 9/12/19 ychauhan created                                                   |
  |===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.jbo.Row;

/**
 * Controller for ...
 */
public class EmployeeSearchCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: EmployeeSearchCO.java 120.0.12020000.1 2020/01/08 07:49:11 spunam noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID, "%packagename%");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);
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

    OAApplicationModule am = pageContext.getApplicationModule(webBean);

    OAViewObject vo =
      (OAViewObject) am.findViewObject("FwkTbxNewEmployeeSearchVO1");

    if ("sendEmail".equals(pageContext.getParameter(EVENT_PARAM)))
    {
      Row[] rows = vo.getFilteredRows("SelectFlag", "Y");
      if (rows == null || rows.length == 0)
      {
        return;
      }
      Integer empCount = rows.length;
      MessageToken[] tokens =
      { new MessageToken("RECIPIENT_COUNT", empCount.toString()) };
      OAException message;
      message =
          new OAException("FND", "FND_TBX_EMAIL_SENT_CNF", tokens, OAException.CONFIRMATION,
                          null);
      pageContext.putDialogMessage(message);
    }
  }
}
