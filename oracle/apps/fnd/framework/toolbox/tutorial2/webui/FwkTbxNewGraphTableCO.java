/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |  5-Nov-2019    SRSIDDAM    Initial Version                                |
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;


/**
 * Controller for ...
 */
public class FwkTbxNewGraphTableCO extends OAControllerImpl {
    public static final String RCS_ID = "$Header: FwkTbxNewGraphTableCO.java 120.0.12020000.1 2020/01/08 08:31:54 spunam noship $";
    public static final boolean RCS_ID_RECORDED =
      VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.webui");
   
    /**
     * Layout and page setup logic for a region.
     * @param pageContext the current OA page context
     * @param webBean the web bean corresponding to the region
     */
    public void processRequest(OAPageContext pageContext, OAWebBean webBean) {
        super.processRequest(pageContext, webBean);
    }

    
    /**
     * Procedure to handle form submissions for form elements in
     * a region.
     * @param pageContext the current OA page context
     * @param webBean the web bean corresponding to the region
     */
    public void processFormRequest(OAPageContext pageContext,
                                   OAWebBean webBean) {
        super.processFormRequest(pageContext, webBean);
    }   
}
