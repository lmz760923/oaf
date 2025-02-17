/*===========================================================================+
   |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
   |                         All rights reserved.                              |
   +===========================================================================+
   |  HISTORY -                                                                |
   |   05-Nov-2019  arpirai  Created ( This CO deals with the Basic Profile    |
   |                         page of the Update Profile Flow)                  |
   +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.File;
import java.io.Serializable;

import java.util.Hashtable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.flexj.DescriptiveFlexfield;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpUpdateAMImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.TransactionUnitHelper;
import oracle.apps.fnd.framework.webui.beans.OADescriptiveFlexBean;
import oracle.apps.fnd.framework.webui.beans.OAImageBean;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.apps.fnd.framework.webui.beans.message.OAMessageFileUploadBean;

import oracle.cabo.ui.UIConstants;

import oracle.cabo.ui.collection.AttributeMap;

import oracle.cabo.ui.data.DataObject;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.BlobDomain;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpUpdProfileCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpUpdProfileCO.java 120.0.12020000.1 2020/01/08 08:29:16 spunam noship $";
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
    String voName = new String("FwkTbxNewEmpDetVO1");

    if (!pageContext.isBackNavigationFired(false) &&
        (!"goto".equals(pageContext.getParameter(EVENT_PARAM))))
    {

      TransactionUnitHelper.startTransactionUnit(pageContext,
                                                 "empUpdateTxn");

    }

    // Fetching Emp User name from pageContext
    String empName = pageContext.getUserName().toString();

    //
    FwkTbxNewEmpUpdateAMImpl am =
      (FwkTbxNewEmpUpdateAMImpl) pageContext.getApplicationModule(webBean);

    Hashtable<String, String> empDet = am.fetchDetails(empName);

    String empId = null;
    String empFullName = null;

    if (empDet != null)
    {
      empId = empDet.get("EMP_ID");
      empFullName = empDet.get("EMP_FULLNAME");
    }

    pageContext.putTransactionValue("empId", empId);
    pageContext.putTransactionValue("empFullName", empFullName);

    Serializable[] params =
    { empId };

    am.invokeMethod("initDetails", params);
    am.invokeMethod("initAddress", params);
    am.invokeMethod("initDFFAddress", params);

    Serializable[] param1 =
    { pageContext.getTemporaryImageLocation(), voName, empId };

    am.invokeMethod("initImg", param1);

    OAImageBean oaimagebean =
      (OAImageBean) webBean.findIndexedChildRecursive("EmployeeImage");
    if (oaimagebean != null)
    {
      File imageFile = new File(param1[0] + "2.jpg");
      oaimagebean.setAttributeValue(UIConstants.SOURCE_ATTR,
                                    imageFile.exists()?
                                    "/OA_HTML/fwk/t/2.jpg":
                                    "/OA_MEDIA/male_lg_img.png");
      oaimagebean.setWidth(100);
      oaimagebean.setHeight(110);
      oaimagebean.setBorderWidth(2);
    }

    if (!TransactionUnitHelper.isTransactionUnitInProgress(pageContext,
                                                           "empUpdateTxn",
                                                           true))
    {

      // User can't go back while the transaction is in process
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

    OAImageBean oaimagebean =
      (OAImageBean) webBean.findIndexedChildRecursive("EmployeeImage");
    DataObject fileUploadData = null;
    FwkTbxNewEmpUpdateAMImpl am =
      (FwkTbxNewEmpUpdateAMImpl) pageContext.getApplicationModule(webBean);
    fileUploadData = pageContext.getNamedDataObject("UploadEmpImage");

    if (fileUploadData != null)
    {
      String FileName =
        "/OA_MEDIA/" + (String) fileUploadData.selectValue(null,
                                                           "UPLOAD_FILE_NAME");


      if (oaimagebean != null)
      {

        pageContext.putTransactionValue("filename", FileName);
      }
    }


    OADescriptiveFlexBean dffBean =
      (OADescriptiveFlexBean) webBean.findChildRecursive("EmployeeLocationDFF");
    DescriptiveFlexfield dff =
      (DescriptiveFlexfield) dffBean.getAttributeValue(FLEXFIELD_REFERENCE);

  }

}
