/*===========================================================================+
 | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 | All rights reserved. |
 +===========================================================================+
 | HISTORY |
 | 10-Sep-19 richanan Created. |
 |===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import java.util.Map;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpUpdateAMImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.layout.OAGraphTableBean;
import oracle.apps.fnd.framework.webui.beans.layout.OAInfotileBean;
import oracle.apps.fnd.framework.webui.beans.layout.OAJetGraphBean;
import oracle.apps.fnd.framework.webui.beans.layout.OATileBean;

import oracle.cabo.ui.AttributeKey;
import oracle.cabo.ui.collection.AttributeMap;

import oracle.jbo.Row;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpAssetInfotileCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpAssetInfotileCO.java 120.0.12020000.1 2020/01/08 08:00:50 spunam noship $";
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
    String empId = null;
    OAJetGraphBean graphBean = null;
    String empName = pageContext.getUserName().toString();

    OAViewObjectImpl empVo = am.getFwkTbxNewEmployeeVO1();
    //      if (!empVo.isPreparedForExecution()) {
    empVo.setWhereClause("upper(guid)='" + empName.toUpperCase() + "'");
    empVo.executeQuery();
    empId = null;
    try
    {
      Row row = (Row) empVo.getRowAtRangeIndex(0);
      empId = row.getAttribute("EmployeeId").toString();
    }
    catch (Exception e)
    {
      empId = null;
    }
    //      }

    try
    {
      OATileBean assetTile =
        (OATileBean) webBean.findChildRecursive("TileAssetInfoReportRN");
      OATileBean trainingTile =
        (OATileBean) webBean.findChildRecursive("TileTrainingReportRN");
      if (assetTile != null)
      {
        if (empId == null)
        {

          assetTile.setAttributeValue("targetRegionId",
                                      new String("AssetInfoStackLayoutRN"));
          webBean.findIndexedChildRecursive("AssetInfoTableRN").setRendered(true);
          webBean.findIndexedChildRecursive("AssetInfoSpecificTableRN").setRendered(false);
          graphBean =
              (OAJetGraphBean) webBean.findIndexedChildRecursive("AssetGraph");
          AttributeMap map = graphBean.getAttributeMap();

          graphBean.setAttributeValue("title",
                                      "Generic Asset Information");
        }
        else
        {
          String vo2Name =
            new String("FwkTbxNewEmpSpecificAssetInfoChartVO1");
          Serializable[] param2 =
          { vo2Name, empId };
          am.invokeMethod("initEmployeeID", param2);
          assetTile.setAttributeValue("targetRegionId",
                                      new String("AssetInfoSpecificStackLayoutRN"));
          webBean.findIndexedChildRecursive("AssetInfoSpecificTableRN").setRendered(true);
          webBean.findIndexedChildRecursive("AssetInfoTableRN").setRendered(false);
          graphBean =
              (OAJetGraphBean) webBean.findIndexedChildRecursive("AssetSpecificGraph");

          graphBean.setAttributeValue("title",
                                      "Employee Specific Asset Information");


        }


      }

      if (trainingTile != null)
      {
        if (empId == null)
        {

          trainingTile.setAttributeValue("targetRegionId",
                                         new String("TrainingGenericStackLayoutRN"));
          webBean.findIndexedChildRecursive("TrainingGenericTableRN").setRendered(true);
          webBean.findIndexedChildRecursive("TrainingTableRN").setRendered(false);
          graphBean =
              (OAJetGraphBean) webBean.findIndexedChildRecursive("TrainingGenericGraph");
          AttributeMap map = graphBean.getAttributeMap();

          graphBean.setAttributeValue("title",
                                      "Generic Training Information");
        }
        else
        {

          trainingTile.setAttributeValue("targetRegionId",
                                         new String("TrainingStackLayoutRN"));
          webBean.findIndexedChildRecursive("TrainingTableRN").setRendered(true);
          webBean.findIndexedChildRecursive("TrainingGenericTableRN").setRendered(false);
          graphBean =
              (OAJetGraphBean) webBean.findIndexedChildRecursive("TrainingGraph");

          graphBean.setAttributeValue("title",
                                      "Employee Specific Training Information");


        }


      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
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
