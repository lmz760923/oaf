/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

/**
 * Controller for ...
 */
public class bg_testCO extends OAControllerImpl
{
  public static final String RCS_ID="$Header$";
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
    
    pageContext.getApplicationModule(webBean).invokeMethod("init_bg_test");
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
      Integer requestid=null;
    super.processFormRequest(pageContext, webBean);
    if (pageContext.getParameter("find")!=null){
    pageContext.getApplicationModule(webBean).invokeMethod("find_bg_test");
    }
    if (pageContext.getParameter("save")!=null) {
    pageContext.getApplicationModule(webBean).invokeMethod("commit_bg_test");
    }
    
      if (pageContext.getParameter("add")!=null) {
      pageContext.getApplicationModule(webBean).invokeMethod("add_bg_test");
      }
      
      if (pageContext.getParameter("request")!=null){
      requestid=(Integer)pageContext.getApplicationModule(webBean).invokeMethod("request");
      OAException conf=new OAException(requestid.toString(),OAException.CONFIRMATION);
      pageContext.putDialogMessage(conf);
      }
      
      
      
  }

}
