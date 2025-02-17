/*========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 |                      All rights reserved.                              |
 +========================================================================+
 |  HISTORY                                                               |
 | 5-Nov-2014 MBONDADA Created.                                           |
 +========================================================================+
 */
package oracle.apps.fnd.framework.toolbox.tutorial2.server;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAEntityDefImpl;
import oracle.apps.fnd.framework.server.OAEntityImpl;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FwkTbxNewEmpAssetCcEOImpl extends OAEntityImpl
{
  public static final int ASSETNUMBID = 0;
  public static final int ASSETNUMBSTRUCTUREID = 1;
  public static final int SEGMENT1 = 2;
  public static final int SEGMENT2 = 3;
  public static final int SEGMENT3 = 4;
  public static final int STARTDATEACTIVE = 5;
  public static final int ENDDATEACTIVE = 6;
  public static final int SUMMARYFLAG = 7;
  public static final int ENABLEDFLAG = 8;
  public static final int CREATEDBY = 9;
  public static final int CREATIONDATE = 10;
  public static final int LASTUPDATEDBY = 11;
  public static final int LASTUPDATEDATE = 12;
  public static final int LASTUPDATELOGIN = 13;
  public static final String RCS_ID = "$Header: FwkTbxNewEmpAssetCcEOImpl.java 120.0.12020000.1 2020/01/08 05:35:39 spunam noship $"; 
  public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");


  private static OAEntityDefImpl mDefinitionObject;

  /**This is the default constructor (do not remove)
   */
  public FwkTbxNewEmpAssetCcEOImpl() {
    }


  /**Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject =
          (OAEntityDefImpl)EntityDefImpl.findDefObject("oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpAssetCcEO");
    }
    return mDefinitionObject;
  }

  /**Gets the attribute value for Segment1, using the alias name Segment1
   */
    public String getSegment1() {
        return (String)getAttributeInternal(SEGMENT1);
    }

    /**Sets <code>value</code> as the attribute value for Segment1
     */
    public void setSegment1(String value) {
        setAttributeInternal(SEGMENT1, value);
    }

    /**Gets the attribute value for Segment2, using the alias name Segment2
     */
    public String getSegment2() {
        return (String)getAttributeInternal(SEGMENT2);
    }

    /**Sets <code>value</code> as the attribute value for Segment2
     */
    public void setSegment2(String value) {
        setAttributeInternal(SEGMENT2, value);
    }

    /**Gets the attribute value for Segment3, using the alias name Segment3
     */
    public String getSegment3() {
        return (String)getAttributeInternal(SEGMENT3);
    }

    /**Sets <code>value</code> as the attribute value for Segment3
     */
    public void setSegment3(String value) {
        setAttributeInternal(SEGMENT3, value);
    }

    /**Gets the attribute value for StartDateActive, using the alias name StartDateActive
     */
    public Date getStartDateActive() {
        return (Date)getAttributeInternal(STARTDATEACTIVE);
    }

    /**Sets <code>value</code> as the attribute value for StartDateActive
     */
    public void setStartDateActive(Date value) {
        setAttributeInternal(STARTDATEACTIVE, value);
    }

    /**Gets the attribute value for EndDateActive, using the alias name EndDateActive
     */
    public Date getEndDateActive() {
        return (Date)getAttributeInternal(ENDDATEACTIVE);
    }

    /**Sets <code>value</code> as the attribute value for EndDateActive
     */
    public void setEndDateActive(Date value) {
        setAttributeInternal(ENDDATEACTIVE, value);
    }

    /**Gets the attribute value for SummaryFlag, using the alias name SummaryFlag
     */
    public String getSummaryFlag() {
        return (String)getAttributeInternal(SUMMARYFLAG);
    }

    /**Sets <code>value</code> as the attribute value for SummaryFlag
     */
    public void setSummaryFlag(String value) {
        setAttributeInternal(SUMMARYFLAG, value);
    }

    /**Gets the attribute value for EnabledFlag, using the alias name EnabledFlag
     */
    public String getEnabledFlag() {
        return (String)getAttributeInternal(ENABLEDFLAG);
    }

    /**Sets <code>value</code> as the attribute value for EnabledFlag
     */
    public void setEnabledFlag(String value) {
        setAttributeInternal(ENABLEDFLAG, value);
    }
    /**Adding setters for who columns
     * */
     public void setLastUpdatedBy(Number lastUpdatedBy){
         
     }
     public void setLastUpdateDate(Date lastUpdateDate){
         
     }
     public void setLastUpdateLogin(Number lastUpdateLogin){
         
     }
     public void setCreationDate(Date creationDate){
         
     }
     public void setCreatedBy(Number createdBy){
         
     }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
    switch (index)
    {
    case ASSETNUMBID:
      return getAssetnumbId();
    case ASSETNUMBSTRUCTUREID:
      return getAssetnumbStructureId();
    case SEGMENT1:
      return getSegment1();
    case SEGMENT2:
      return getSegment2();
    case SEGMENT3:
      return getSegment3();
    case STARTDATEACTIVE:
      return getStartDateActive();
    case ENDDATEACTIVE:
      return getEndDateActive();
    case SUMMARYFLAG:
      return getSummaryFlag();
    case ENABLEDFLAG:
      return getEnabledFlag();
    case CREATEDBY:
      return getCreatedBy();
    case CREATIONDATE:
      return getCreationDate();
    case LASTUPDATEDBY:
      return getLastUpdatedBy();
    case LASTUPDATEDATE:
      return getLastUpdateDate();
    case LASTUPDATELOGIN:
      return getLastUpdateLogin();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
    switch (index)
    {
    case ASSETNUMBID:
      setAssetnumbId((Number)value);
      return;
    case ASSETNUMBSTRUCTUREID:
      setAssetnumbStructureId((Number)value);
      return;
    case SEGMENT1:
      setSegment1((String)value);
      return;
    case SEGMENT2:
      setSegment2((String)value);
      return;
    case SEGMENT3:
      setSegment3((String)value);
      return;
    case STARTDATEACTIVE:
      setStartDateActive((Date)value);
      return;
    case ENDDATEACTIVE:
      setEndDateActive((Date)value);
      return;
    case SUMMARYFLAG:
      setSummaryFlag((String)value);
      return;
    case ENABLEDFLAG:
      setEnabledFlag((String)value);
      return;
    case CREATEDBY:
      setCreatedBy((Number)value);
      return;
    case CREATIONDATE:
      setCreationDate((Date)value);
      return;
    case LASTUPDATEDBY:
      setLastUpdatedBy((Number)value);
      return;
    case LASTUPDATEDATE:
      setLastUpdateDate((Date)value);
      return;
    case LASTUPDATELOGIN:
      setLastUpdateLogin((Number)value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }

  /**Gets the attribute value for AssetnumbId, using the alias name AssetnumbId
   */
  public Number getAssetnumbId()
  {
    return (Number)getAttributeInternal(ASSETNUMBID);
  }

  /**Sets <code>value</code> as the attribute value for AssetnumbId
   */
  public void setAssetnumbId(Number value)
  {
    setAttributeInternal(ASSETNUMBID, value);
  }

  /**Gets the attribute value for AssetnumbStructureId, using the alias name AssetnumbStructureId
   */
  public Number getAssetnumbStructureId()
  {
    return (Number)getAttributeInternal(ASSETNUMBSTRUCTUREID);
  }

  /**Sets <code>value</code> as the attribute value for AssetnumbStructureId
   */
  public void setAssetnumbStructureId(Number value)
  {
    setAttributeInternal(ASSETNUMBSTRUCTUREID, value);
  }

  /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
   */
  public Number getCreatedBy()
  {
    return (Number)getAttributeInternal(CREATEDBY);
  }

  /**Gets the attribute value for CreationDate, using the alias name CreationDate
   */
  public Date getCreationDate()
  {
    return (Date)getAttributeInternal(CREATIONDATE);
  }

  /**Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy
   */
  public Number getLastUpdatedBy()
  {
    return (Number)getAttributeInternal(LASTUPDATEDBY);
  }

  /**Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate
   */
  public Date getLastUpdateDate()
  {
    return (Date)getAttributeInternal(LASTUPDATEDATE);
  }

  /**Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin
   */
  public Number getLastUpdateLogin()
  {
    return (Number)getAttributeInternal(LASTUPDATELOGIN);
  }

  /**Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(String enabledFlag)
  {
    return new Key(new Object[]{enabledFlag});
  }
}
