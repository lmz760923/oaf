/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY            
 | 05-NOV-2019 SRSIDDAM  Initial Version
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.jbo.Row;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpTrainingGraphCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpTrainingGraphCO.java 120.0.12020000.2 2020/01/13 16:48:26 spunam noship $";
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
    FwkTbxNewEmployeeAMImpl am =
      (FwkTbxNewEmployeeAMImpl) pageContext.getApplicationModule(webBean);

    String empName = (String) pageContext.getUserName().toString();
    String empId = null;
    OAViewObjectImpl empVo = am.getFwkTbxNewEmployeeVO1();

    empVo.setWhereClause("upper(guid)='" + empName.toUpperCase() + "'");
    empVo.executeQuery();
    try
    {
      Row row = (Row) empVo.getRowAtRangeIndex(0);
      empId = row.getAttribute("EmployeeId").toString();
    }
    catch (Exception e)
    {
      empId = "1";
    }

    OAViewObjectImpl empGraphVo = am.getFwkTbxNewEmpTrainingChartVO1();
    empGraphVo.setWhereClause("employee_id='" + empId + "'");
    empGraphVo.executeQuery();

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
