/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY -                                                                |
 |   05-Nov-2019  arpirai  Created ( This CO deals with the Page Navigation
 |                         of the Update Profile Flow)
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;
import java.util.Set;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OADialogPage;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.OAWebBeanConstants;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.form.OASubmitButtonBean;
import oracle.apps.fnd.framework.webui.beans.nav.OATrainBean;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpUpdPgNavCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpUpdPgNavCO.java 120.0.12020000.2 2020/01/13 17:37:15 spunam noship $";
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


    // Figure out whether the Submit button should be rendered or
    // not; this should appear only on the final page (Step 4).
    // The OATrainBean is a named component of the page layout, so
    // you have a special way of getting a handle to it (you can't
    // "find" it like you do for normal, indexed children that would
    // be below the current region in the hierarchy.

    OATrainBean trainBean =
      (OATrainBean) pageContext.getPageLayoutBean().getLocation();

    // You must call the following before getting the target page index

    trainBean.prepareForRendering(pageContext);
    int step = trainBean.getSelectedTrainStepRenderedIndex();
    if (step + 1 != trainBean.getNumberOfRenderedTrainSteps())
    {
      OASubmitButtonBean submitButton =
        (OASubmitButtonBean) webBean.findIndexedChildRecursive("SubmitButton");
      submitButton.setRendered(false);
    }
  } // end processRequest()

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
    OAApplicationModule am = pageContext.getApplicationModule(webBean);

    // This button is only displayed on the final page...
    if (pageContext.getParameter("SubmitButton") != null)
    {
      am.invokeMethod("apply");
      HashMap<String, String> map =
        (HashMap<String, String>) pageContext.getTransactionTransientValue("SkillsSelected");
      Set set = map.entrySet();
      Iterator iterator = set.iterator();
      while (iterator.hasNext())
      {
        Map.Entry mentry = (Map.Entry) iterator.next();
        Connection conn =
          pageContext.getApplicationModule(webBean).getOADBTransaction().getJdbcConnection();
        String empId =
          String.valueOf(pageContext.getTransactionValue("empId"));
        String Query =
          "INSERT INTO FWK_TBX_NEW_EMP_SKILLS (skill_id,employee_id) VALUES(TO_NUMBER(:1),TO_NUMBER(:2))";

     try{
        PreparedStatement stmt = null;
        Statement stmt1 = null;

        try
        {
          stmt = conn.prepareStatement(Query);
          stmt1 = conn.createStatement();
          String skillID = mentry.getKey().toString();
          String empID = empId;
          stmt.setString(1, skillID);
          stmt.setString(2, empID);
          stmt.execute();
          String query = "commit";
          stmt1.execute(query);
        }
        catch (SQLException exc)
        {
          // TODO
          exc.printStackTrace();
        }
        catch (Exception ex)
        {
          // TODO
          ex.printStackTrace();
        }
        finally{
            stmt.close();
            stmt1.close();
            conn.close();
        }
     }
     catch (SQLException e) {
         e.printStackTrace();
     }

      }

      String employeeId =
        (String) pageContext.getTransactionValue("empId");

      String employeeFullName =
        (String) pageContext.getTransactionValue("empFullName");

      // Loading the message token with Employee's full name
      MessageToken[] confirmMsgTokens =
      { new MessageToken("EMPLOYEEFULLNAME", employeeFullName) };

      // Assuming the commit succeeds, you'll display a Confirmation
      // FND_CONFIRM_EMP_UPDATE_PROFILE is the FND MSG for confirmation commit

      OAException confirmMessage =
        new OAException("FND", "FND_CONFIRM_EMP_UPDATE_PROFILE",
                        confirmMsgTokens, OAException.CONFIRMATION, null);

      // Navigate back to the inception page once OK is pressed.
      OADialogPage dialogPage =
        new OADialogPage(OAException.CONFIRMATION, confirmMessage, null,
                         "OA.jsp?page=/oracle/apps/fnd/framework/toolbox/tutorial2/webui/FwkTbxNewEmpDetails",
                         null);

      // Note that we release the root "UI" application module
      // so we can correctly handle any subsequent "Back" button
      // navigation and attempts to resubmit the transaction.
      pageContext.releaseRootApplicationModule();
      pageContext.redirectToDialogPage(dialogPage);
    }
    else if (pageContext.getParameter("CancelButton") != null)
    {

      //FND_CANCEL_EMP_UPDATE_PROFILE is the FND MSG for Cancel
      OAException warningMessage =
        new OAException("FND", "FND_CANCEL_EMP_UPDATE_PROFILE");
      OADialogPage dialogPage =
        new OADialogPage(OAException.WARNING, warningMessage, null,
                         "OA.jsp?page=/oracle/apps/fnd/framework/toolbox/tutorial2/webui/FwkTbxNewEmpDetails",
                         pageContext.getCurrentUrl());

      dialogPage.setOkButtonItemName("Yes");

      pageContext.redirectToDialogPage(dialogPage);
      am.invokeMethod("rollbackEmployee");

      // Remove the "in transaction" indicator
      pageContext.removeTransactionValue("empUpdateTxn");
      pageContext.releaseRootApplicationModule();

    }
  } // end processFormRequest

}
