/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY  
 |  05-Nov-2019   mbondada    created
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import com.sun.java.util.collections.Hashtable;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAImageBean;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.apps.fnd.framework.webui.beans.layout.OAMasonryTileBean;
import oracle.apps.fnd.framework.webui.beans.layout.OAStackLayoutBean;

import oracle.cabo.style.CSSStyle;

import oracle.jbo.Row;


/**
 * Controller for ...
 */
public class MasonryLayoutCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: MasonryLayoutCO.java 120.0.12020000.3 2020/03/24 08:22:49 spunam noship $";
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
    Hashtable props = new Hashtable();
    props.put("text-align", "center");
    props.put("overflow", "hidden");
    props.put("padding-left", "20px");
    props.put("horizontal-align", "center");
    CSSStyle style = new CSSStyle(props);
    OAImageBean trendAndAnalyticsImage =
      (OAImageBean) webBean.findIndexedChildRecursive("trendAndAnalyticsImage");
    trendAndAnalyticsImage.setInlineStyle(style);
    OAImageBean updateProfileImage =
      (OAImageBean) webBean.findIndexedChildRecursive("updateProfileImage");
    updateProfileImage.setInlineStyle(style);
    OAImageBean assetManagementImage =
      (OAImageBean) webBean.findIndexedChildRecursive("assetManagementImage");
    assetManagementImage.setInlineStyle(style);
    OAImageBean trainingUpdateImage =
      (OAImageBean) webBean.findIndexedChildRecursive("trainingUpdateImage");
    trainingUpdateImage.setInlineStyle(style);

    OAMasonryTileBean trendAndAnalyticsMT =
      (OAMasonryTileBean) webBean.findIndexedChildRecursive("trendAndAnalyticsMT");
    OAMasonryTileBean updateProfileMT =
      (OAMasonryTileBean) webBean.findIndexedChildRecursive("updateProfileMT");
    OAMasonryTileBean assetManagementMT =
      (OAMasonryTileBean) webBean.findIndexedChildRecursive("assetManagementMT");
    OAMasonryTileBean trainingUpdateMT =
      (OAMasonryTileBean) webBean.findIndexedChildRecursive("trainingUpdateMT");

    String empName = (String) pageContext.getUserName().toString();
    FwkTbxNewEmployeeAMImpl am =
      (FwkTbxNewEmployeeAMImpl) pageContext.getApplicationModule(webBean);
    OAViewObjectImpl empVo = am.getFwkTbxNewEmployeeVO1();
    empVo.setWhereClause("upper(guid)='" + empName.toUpperCase() + "'");
    empVo.executeQuery();
    try
    {
      Row row = (Row) empVo.getRowAtRangeIndex(0);
      if(row==null) {
          updateProfileMT.setRendered(false);
          assetManagementMT.setRendered(false);
          trainingUpdateMT.setRendered(false);
      }
    }
    catch (Exception e)
    {
      updateProfileMT.setRendered(false);
      assetManagementMT.setRendered(false);
      trainingUpdateMT.setRendered(false);
    }

    //        }
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
