/*===========================================================================+
 | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 | All rights reserved. |
 +===========================================================================+
 | HISTORY |
 | 29-Aug-19 richanan Created. |
 |===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.File;
import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpUpdateAMImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.TransactionUnitHelper;
import oracle.apps.fnd.framework.webui.beans.OAImageBean;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.cabo.ui.UIConstants;
import oracle.cabo.ui.data.DataObject;

import oracle.jbo.domain.BlobDomain;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpUpdateReviewCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpUpdateReviewCO.java 120.0.12020000.1 2020/01/08 08:23:55 spunam noship $";
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
    String voName = new String("FwkTbxNewEmpDetVO1");
    String empId = (String) pageContext.getTransactionValue("empId");
    FwkTbxNewEmpUpdateAMImpl am =
      (FwkTbxNewEmpUpdateAMImpl) pageContext.getApplicationModule(webBean);
    Serializable[] param1 =
    { pageContext.getTemporaryImageLocation(), voName, empId };

    am.invokeMethod("initImg", param1);

    OAImageBean oaimagebean =
      (OAImageBean) webBean.findIndexedChildRecursive("EmployeeImage");

    DataObject fileUploadData = null;

    String filename = (String) pageContext.getTransactionValue("filename");
    if (oaimagebean != null)
    {

      if (filename != null)
      {


        oaimagebean.setAttributeValue(UIConstants.SOURCE_ATTR, filename);
        //oaimagebean.setAttributeValue(UIConstants.SOURCE_ATTR,"FwkTbxNewEmployeeImage.jsp?empId="+empId);
        oaimagebean.setWidth(100);
        oaimagebean.setHeight(110);
        oaimagebean.setBorderWidth(2);

      }
      else
      {

        File f = new File(param1[0] + "2.jpg");
        oaimagebean.setAttributeValue(UIConstants.SOURCE_ATTR,
                                      f.exists()? "/OA_HTML/fwk/t/2.jpg":
                                      "/OA_MEDIA/male_lg_img.png");
        //oaimagebean.setAttributeValue(UIConstants.SOURCE_ATTR,"FwkTbxNewEmployeeImage.jsp?empId="+empId);
        oaimagebean.setWidth(100);
        oaimagebean.setHeight(110);
        oaimagebean.setBorderWidth(2);
      }
    }
    if (!TransactionUnitHelper.isTransactionUnitInProgress(pageContext,
                                                           "empUpdateTxn",
                                                           true))
    {
      // User can't return to the page after committing changes, a navigation error in such case
      OADialogPage dialogPage = new OADialogPage(NAVIGATION_ERROR);
      pageContext.redirectToDialogPage(dialogPage);
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
