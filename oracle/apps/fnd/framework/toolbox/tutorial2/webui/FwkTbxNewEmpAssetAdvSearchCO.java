/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                             
 |  05-Feb-2029 xialliu created
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAFlexCriterionInfo;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.apps.fnd.framework.webui.beans.layout.OAAdvancedSearchBean;

import oracle.cabo.style.CSSStyle;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpAssetAdvSearchCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header$";
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
    //initialize Advanced Search KFF
    java.util.HashMap kffInfoMap = new java.util.HashMap();
    OAFlexCriterionInfo assetKFFInfo = new OAFlexCriterionInfo();
    
    //set ID of the KFF item in the result table
    //that this KFF search item is mapped to
    assetKFFInfo.setTableFlexItemId("AssetNumberFlex");
    
    //Set Attributes required for initialize the KFF item:
    //1. StructureCode
    //2. CCID attribute name
    assetKFFInfo.setCCIDAttributeName("CCID");
    assetKFFInfo.setStructureCode("Asset Number Flex Field");
    
    //set any extra attributes on the KFF
    //assetKFFInfo.setWhereClause(...)
    //assetKFFInfo.setFlexMaps(...)
    
    //<k, v> - k: id of the search kff item name in adv search region. 
    kffInfoMap.put("AssetFlexCItem", assetKFFInfo);
    
    //Repeat above for multiple KFF search criteria items ...
    
    //invoke below API to add the HashMap to the AdvancedSearchBean
    ((OAAdvancedSearchBean)webBean).setFlexCriterionInfoMap(kffInfoMap);
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
