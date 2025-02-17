/*===========================================================================+
 | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 | All rights reserved. |
 +===========================================================================+
 | HISTORY |
 | 22-Aug-19 richanan Created. |
 |===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.util.HashMap;

import java.io.Serializable;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpTitleVOImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpUpdateAMImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageRadioGroupBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageStyledTextBean;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpGenderCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpGenderCO.java 120.0.12020000.2 2020/01/13 16:44:25 spunam noship $";
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

    String voName = new String("FwkTbxNewEmpTitleVO1");
    if (webBean.findChildRecursive("EmployeeGender") instanceof
        OAMessageRadioGroupBean)
    {
      OAMessageRadioGroupBean radioWB =
        (OAMessageRadioGroupBean) webBean.findChildRecursive("EmployeeGender");
      radioWB.setAttributeValue(ORIENTATION_ATTR, ORIENTATION_HORIZONTAL);
      radioWB.setAttributeValue(V_ALIGN_ATTR, V_ALIGN_MIDDLE);
    }
    String selectedSkills =
      (String) pageContext.getTransactionValue("Trailing_List");
    if (selectedSkills != null)
    {
      String items[] = selectedSkills.split(",");
      String message = "";
      HashMap<String, String> map = new HashMap<String, String>();
      if (items != null)
      {

        String result = "";
        for (int i = 0; i <= items.length - 1; i++)
        {
          Connection conn =
            pageContext.getApplicationModule(webBean).getOADBTransaction().getJdbcConnection();
          String Query =
            "SELECT skill_name FROM FWK_TBX_NEW_SKILLS WHERE skill_id=TO_NUMBER(:1)";

          try{
          
            PreparedStatement stmt = null;

          try
          {
            stmt = conn.prepareStatement(Query);
            stmt.setString(1, items[i].trim());
            for (ResultSet resultset = stmt.executeQuery();
                 resultset.next(); )
            {
              result = resultset.getString("skill_name");
              message = result + " , " + message;
              map.put(items[i], result);
            }
          }
          catch (SQLException e)
          {
            // TODO
          }
          finally{
              stmt.close();
          }
        }
        catch (SQLException e) {
            // TODO
        }

        }
        if (message.length() > 1)
          message = message.substring(0, message.length() - 2);


        pageContext.putTransactionTransientValue("SkillsSelected", map);


      }
      OAMessageStyledTextBean skills =
        (OAMessageStyledTextBean) webBean.findChildRecursive("EmployeeSkills");
      if (skills != null)
      {
        skills.setValue(pageContext, message);
      }
    }
    FwkTbxNewEmpUpdateAMImpl am =
      (FwkTbxNewEmpUpdateAMImpl) pageContext.getApplicationModule(webBean);

    //  alternate way to refer a VO -->
    //   FwkTbxNewEmpTitleVOImpl vo = am.getFwkTbxNewEmpTitleVO1();
    //  vo.executeQuery();

    OAViewObjectImpl vo = (OAViewObjectImpl) am.findViewObject(voName);
    vo.executeQuery();
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
