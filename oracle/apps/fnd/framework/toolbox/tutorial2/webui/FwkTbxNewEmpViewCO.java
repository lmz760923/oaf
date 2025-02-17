/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |  11-Nov-2019   SRSIDDAM    Initial version                                |
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import java.io.File;
import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpUpdateAMImpl;
import oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmployeeAMImpl;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAImageBean;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.cabo.ui.UIConstants;

import oracle.jbo.Row;


/**
 * Controller for ...
 */
public class FwkTbxNewEmpViewCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: FwkTbxNewEmpViewCO.java 120.0.12020000.3 2020/03/25 09:43:12 spunam noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID, "%oracle.apps.fnd.framework.toolbox.tutorial2.webui%");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);
    String currentClassName = "FwkTbxNewEmpViewCO";
    if (pageContext.isLoggingEnabled(1))
      pageContext.writeDiagnostics(this,
                                   currentClassName + " : Entering processRequest..",
                                   1);
    FwkTbxNewEmployeeAMImpl am =
      (FwkTbxNewEmployeeAMImpl) pageContext.getApplicationModule(webBean);
    String voEmpDetName = new String("FwkTbxNewEmpDetVO1");
    String voEmpName = new String("FwkTbxNewEmployeeVO1");
    String voHgridName = new String("FwkTbxEmployeeHgridVO1");
    String voEducation = new String("FwkTbxNewEducationVO1");
    String voExperience = new String("FwkTbxNewExperienceVO1");
    String voTraining = new String("FwkTbxNewEmpTrainingVO1");
    String voAssets = new String("FwkTbxNewAssetVO1");
    String voSkills = new String("FwkTbxNewEmpSkillsVO1");

    String empId = pageContext.getParameter("empId");
    if (empId == null || empId.isEmpty())
    {
      empId = String.valueOf(pageContext.getSessionValue("empId"));

    }
    if (empId == null || empId.isEmpty())
    {
      empId =
          String.valueOf(am.calculateEmpIdFromGuid(pageContext.getUserName()));

    }


    pageContext.putSessionValue("empId", empId);

    if (pageContext.isLoggingEnabled(1))
      pageContext.writeDiagnostics(this,
                                   currentClassName + " : empId value is:" +
                                   empId, 1);

    Serializable[] empDetParams =
    { voEmpDetName, empId };
    Serializable[] empParams =
    { voEmpName, empId };
    Serializable[] hgridParams =
    { voHgridName, empId };

    Serializable[] educationParams =
    { voEducation, empId };
    Serializable[] experienceParams =
    { voExperience, empId };
    Serializable[] trainingParams =
    { voTraining, empId };
    Serializable[] assetsParams =
    { voAssets, empId };
    Serializable[] skillsParams =
    { voSkills, empId };


    try
    {

      am.invokeMethod("initQuery", empDetParams);
      am.invokeMethod("initQuery", empParams);
      am.invokeMethod("initQuery", hgridParams);

      am.invokeMethod("initQuery", educationParams);
      am.invokeMethod("initQuery", experienceParams);
      am.invokeMethod("initQuery", trainingParams);
      am.invokeMethod("initQuery", assetsParams);
      am.invokeMethod("initQuery", skillsParams);
    }
    catch (Exception e)
    {
      if (pageContext.isLoggingEnabled(1))
        pageContext.writeDiagnostics(this,
                                     currentClassName + " : Exception at initQuery:" +
                                     e, 1);
    }

    if (am.getVORowCount("FwkTbxNewEducationVO1") <= 0){
        if(webBean.findChildRecursive("EduAccordionRN")!=null)
            webBean.findChildRecursive("EduAccordionRN").setRendered(false);
    }
    if (am.getVORowCount("FwkTbxNewExperienceVO1") <= 0){
      if(webBean.findChildRecursive("ExpAccordionRN")!=null)
          webBean.findChildRecursive("ExpAccordionRN").setRendered(false);
    }
      
    if (am.getVORowCount("FwkTbxNewEmpTrainingVO1") <= 0){
      if(webBean.findChildRecursive("TrainingAccordionRN")!=null)
          webBean.findChildRecursive("TrainingAccordionRN").setRendered(false);
    }
      
    if (am.getVORowCount("FwkTbxNewAssetVO1") <= 0){
      if(webBean.findChildRecursive("AssetAccrdionRN")!=null)
          webBean.findChildRecursive("AssetAccrdionRN").setRendered(false);
    }
    if (am.getVORowCount("FwkTbxNewEmpSkillsVO1") <= 0){
        if(webBean.findChildRecursive("SkillAccrdionRN")!=null)
            webBean.findChildRecursive("SkillAccrdionRN").setRendered(false);
      }
      


    Serializable[] params =
    { pageContext.getTemporaryImageLocation(), voEmpDetName, empId };

    am.invokeMethod("initImg", params);
    OAImageBean oaimagebean =
      (OAImageBean) webBean.findIndexedChildRecursive("EmployeeImage");
    if (oaimagebean != null)
    {
      File f = new File(params[0] + "2.jpg");
      oaimagebean.setAttributeValue(UIConstants.SOURCE_ATTR,
                                    f.exists()? "/OA_HTML/fwk/t/2.jpg":
                                    "/OA_MEDIA/male_lg_img.png");
      oaimagebean.setWidth(100);
      oaimagebean.setHeight(110);
      oaimagebean.setBorderWidth(2);
    }
    if (pageContext.isLoggingEnabled(1))
      pageContext.writeDiagnostics(this, "Leaving processRequest..", 1);
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
