/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OADescriptiveFlexBean;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.table.OAAdvancedTableBean;

/**
 * Controller for ...
 */
public class InvoiceCO extends OAControllerImpl
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
    OADescriptiveFlexBean flex=(OADescriptiveFlexBean)webBean.findChildRecursive("desc");
    if (flex!=null){
    flex.setRenderAsPopup(true);
    }
    
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    
    super.processFormRequest(pageContext, webBean);
    
    
    if (pageContext.getParameter("find")!=null){
    String invoice_num=pageContext.getParameter("invoice_number");
    Serializable[] params={invoice_num};
    Class[] types={String.class};
    pageContext.getApplicationModule(webBean).invokeMethod("init",params,types);
    OAAdvancedTableBean rest =(OAAdvancedTableBean)webBean.findChildRecursive("table");
    rest.queryData(pageContext,false);
    
    }
    
    if (pageContext.getParameter("save")!=null){
    pageContext.getApplicationModule(webBean).invokeMethod("apply");
    }
    
    if (pageContext.getParameter("add")!=null){
    pageContext.getApplicationModule(webBean).invokeMethod("add");
    }
    
  }

}
