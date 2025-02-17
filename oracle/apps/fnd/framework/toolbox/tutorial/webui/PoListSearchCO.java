/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.layout.OAQueryBean;


/**
 * Controller for ...
 */
public class PoListSearchCO
  extends OAControllerImpl
{
  public static final String RCS_ID =
    "$Header: PoListSearchCO.java 120.0.12020000.6 2020/02/22 17:04:13 atgops1 noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID,
                                   "oracle.apps.fnd.framework.toolbox.tutorial.webui");

  public static final int mFileVersion = 0;

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
    if ("createpo".equals(pageContext.getParameter("event")))
    {
      pageContext.putSessionValue("Train", "Basic");
      pageContext.redirectImmediately("OA.jsp?page=/oracle/apps/fnd/framework/toolbox/tutorial/webui/PoDescPG&poStep=0");
    }
  }

}
