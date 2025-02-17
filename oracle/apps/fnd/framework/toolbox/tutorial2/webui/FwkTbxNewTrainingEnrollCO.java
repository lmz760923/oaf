/*===========================================================================+
   | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA             |
   | All rights reserved.                                                       |
   +============================================================================+
   | HISTORY                                                                    |
   | 9/06/19 ychauhan created                                                   |
   |===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import com.sun.java.util.collections.HashMap;

import java.io.Serializable;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.OAWebBeanConstants;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

/**
 * Controller for ...
 */
public class FwkTbxNewTrainingEnrollCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewTrainingEnrollCO.java 120.0.12020000.1 2020/01/08 08:32:33 spunam noship $";
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

    FwkTbxNewEmployeeAMImpl am =
      (FwkTbxNewEmployeeAMImpl) pageContext.getApplicationModule(webBean);
    String voName = new String("FwkTbxNewTrainingVO1");
    String guid = pageContext.getUserName();
    String executeQuery = "true";
    Serializable[] param =
    { guid, voName, executeQuery };
    am.invokeMethod("initTrainingEnrollQuery", param);
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * As of now have 4 cases :-
   * 1. enrollTraining - When user clicks on enroll icon. We will create a new
   *    row for FwkTbxNewEmpEnrollTrainingVo and will also create a new confirmation
   *    popup to confirm if he wants to enroll in the training or not.
   * 2. EnrollConfirm - When user clicks on "OK" button to confirm the enrollment
   *    in the training. We will commit the transaction and delete the row that was
   *    created in VO.
   * 3. EnrollCancel - When user clicks on "No", we will just delete the VO row
   *    that was created.
   * 4. qbe - This condition checks if table refresh is happening because of qbe
   *    actions. If so, we send executeQuery param as false, so that VO query doesn't
   *    execute (it won't have necessary attribute values at this moment, so it will
   *    result in error if it runs).
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext,
                                 OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);

    OAApplicationModule am = pageContext.getApplicationModule(webBean);

    if ("enrollTraining".equals(pageContext.getParameter(EVENT_PARAM)))
    {

      Serializable[] param =
      { pageContext.getUserName() };
      am.invokeMethod("createNewEmpTrainingRow", param);

      OAViewObject vo =
        (OAViewObject) am.findViewObject("FwkTbxNewEmpEnrollTrainingVO1");

      vo.getCurrentRow().setAttribute("TrainingId",
                                      pageContext.getParameter("trainingId"));
      vo.getCurrentRow().setAttribute("Status", "New");
      vo.getCurrentRow().setAttribute("EnrolledDate",
                                      (new oracle.jbo.domain.Date()).getCurrentDate());

      MessageToken[] tokens =
      { new MessageToken("TRAINING_NAME",
                         pageContext.getParameter("trainingName")) };
      OAException mainMessage =
        new OAException("FND", "FND_TBX_TRAINING_ENROLL_WARN", tokens);
      OADialogPage dialogPage =
        new OADialogPage(OAException.WARNING, mainMessage, null, "", "");

      String yes = pageContext.getMessage("AK", "FWK_TBX_T_YES", null);
      String no = pageContext.getMessage("AK", "FWK_TBX_T_NO", null);

      dialogPage.setOkButtonItemName("EnrollConfirm");
      dialogPage.setNoButtonItemName("EnrollCancel");

      dialogPage.setOkButtonToPost(true);
      dialogPage.setNoButtonToPost(true);
      dialogPage.setPostToCallingPage(true);

      dialogPage.setOkButtonLabel(yes);
      dialogPage.setNoButtonLabel(no);

      java.util.Hashtable formParams = new java.util.Hashtable(1);
      dialogPage.setFormParameters(formParams);
      formParams.put("trainingId", pageContext.getParameter("trainingId"));

      pageContext.redirectToDialogPage(dialogPage);

    }

    else if (pageContext.getParameter("EnrollConfirm") != null)
    {

      am.invokeMethod("apply"); // retain AM

      am.invokeMethod("removeNewEmpTrainingRow");

      MessageToken[] tokens =
      { };
      OAException message;
      message =
          new OAException("FND", "FND_TBX_TRAINING_ENROLL_CNF", tokens,
                          OAException.CONFIRMATION, null);

      pageContext.putDialogMessage(message); // retain AM
      pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/fnd/framework/toolbox/tutorial2/webui/FwkTbxNewTrainingEnrollPG",
                                     null,
                                     OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                     null, null, true,
                                     OAWebBeanConstants.ADD_BREAD_CRUMB_NO);
    }

    else if (pageContext.getParameter("EnrollCancel") != null)
    {
      am.invokeMethod("removeNewEmpTrainingRow");
    }

    else if ("qbe".equals(pageContext.getParameter(EVENT_PARAM)))
    {
      String voName = new String("FwkTbxNewTrainingVO1");
      String guid = pageContext.getUserName();
      if (guid != null && guid.length() > 2)
      {
        guid = guid.substring(0, 2) + guid.substring(2).toLowerCase();
      }
      String executeQuery = "false";
      Serializable[] param =
      { guid, voName, executeQuery };
      am.invokeMethod("initTrainingEnrollQuery", param);
    }
  }

}
