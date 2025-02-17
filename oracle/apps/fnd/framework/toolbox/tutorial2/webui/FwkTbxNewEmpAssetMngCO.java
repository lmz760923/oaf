/*===========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |  05-Nov-2019 mbondada created                                             |
 |  05-Feb-2029 xialliu  modified for KFF search feature in 12.2.10          |
 +===========================================================================*/
package oracle.apps.fnd.framework.toolbox.tutorial2.webui;

import com.sun.java.util.collections.Hashtable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAKeyFlexBean;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.layout.OAQueryBean;

import oracle.apps.fnd.framework.webui.beans.message.OAMessageTextInputBean;

import oracle.cabo.style.CSSStyle;

/**
 * Controller for ...
 */
public class FwkTbxNewEmpAssetMngCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header $";
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
      OAKeyFlexBean kffId =
        (OAKeyFlexBean) webBean.findIndexedChildRecursive("AssetNumberFlex");
      setPropKFF(kffId);
    
    //initialize Simple Search KFF
    OAKeyFlexBean kffSrchId =
      (OAKeyFlexBean) webBean.findIndexedChildRecursive("SearchAssetNumberFlex");
    setPropKFF(kffSrchId);
    kffSrchId.setDynamicInsertion(false);
    
    Hashtable props = new Hashtable();
    props.put("padding-left", "58px");
    CSSStyle style = new CSSStyle(props);
    OAMessageTextInputBean searchAssetID =
      (OAMessageTextInputBean) webBean.findIndexedChildRecursive("SearchAssetID");
    searchAssetID.setInlineStyle(style);
  }

  private void setPropKFF(OAKeyFlexBean kffId)
  {
    // Set the code combination lov
    kffId.useCodeCombinationLOV(true);

    //set the structure code for the item key flex
    kffId.setStructureCode("Asset Number Flex Field");

    //Set the attribute name to the item
   // kffId.setCCIDAttributeName("AssetnumbId");
    kffId.setCCIDAttributeName("CCID");
    kffId.setDynamicInsertion(true);
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
    OAApplicationModule am = pageContext.getApplicationModule(webBean);
    OAQueryBean queryBean =
      (OAQueryBean) webBean.findChildRecursive("QueryRN");
    String go = queryBean.getGoButtonName();
    OAKeyFlexBean kffSrchId =
      (OAKeyFlexBean) webBean.findIndexedChildRecursive("SearchAssetNumberFlex");

   }

}
