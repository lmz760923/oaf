/*===========================================================================+
 | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA             |
 | All rights reserved.                                                       |
 +============================================================================+
 | HISTORY                                                                    |
 | 8/19/19 ychauhan created                                                   |
 |===========================================================================*/

package oracle.apps.fnd.framework.toolbox.tutorial2.server;

import oracle.apps.fnd.framework.server.OAEntityDefImpl;
import oracle.apps.fnd.framework.server.OAEntityImpl;
import oracle.apps.fnd.common.VersionInfo;


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
public class FwkTbxNewAssetEOImpl
  extends OAEntityImpl {


    public static final int ASSETID = 0;

    /**
     * Oracle E-Business Suite internal source control identifier.
     */
    public static final String RCS_ID = "$Header: FwkTbxNewAssetEOImpl.java 120.0.12020000.1 2020/01/08 05:10:47 spunam noship $";

  /**
   * Oracle E-Business Suite internal source control identifier.
   */
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID,
                                   "oracle.apps.fnd.framework.toolbox.tutorial2.server");

    public static final int EMPLOYEEID = 1;
    public static final int ASSETTYPE = 2;
    public static final int MODELNUMBER = 3;
    public static final int AVAILABLE = 4;
    public static final int INUSESINCE = 5;
    public static final int ASSETNUMBID = 6;
    public static final int ASSETNUMBSTRUCTUREID = 7;
    public static final int CCID = 8;
    public static final int FWKTBXNEWEMPLOYEEEO = 9;


    private static OAEntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
  public FwkTbxNewAssetEOImpl()
  {
  }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    (OAEntityDefImpl)EntityDefImpl.findDefObject("oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewAssetEO");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for AssetId, using the alias name AssetId
     */
  public Number getAssetId()
  {
    return (Number) getAttributeInternal(ASSETID);
  }

  /**Sets <code>value</code> as the attribute value for AssetId
   */
  public void setAssetId(Number value)
  {
    setAttributeInternal(ASSETID, value);
  }

  /**Gets the attribute value for EmployeeId, using the alias name EmployeeId
   */
  public Number getEmployeeId()
  {
    return (Number) getAttributeInternal(EMPLOYEEID);
  }

  /**Sets <code>value</code> as the attribute value for EmployeeId
   */
  public void setEmployeeId(Number value)
  {
    setAttributeInternal(EMPLOYEEID, value);
  }

  /**Gets the attribute value for AssetType, using the alias name AssetType
   */
  public String getAssetType()
  {
    return (String) getAttributeInternal(ASSETTYPE);
  }

  /**Sets <code>value</code> as the attribute value for AssetType
   */
  public void setAssetType(String value)
  {
    setAttributeInternal(ASSETTYPE, value);
  }

  /**Gets the attribute value for ModelNumber, using the alias name ModelNumber
   */
  public String getModelNumber()
  {
    return (String) getAttributeInternal(MODELNUMBER);
  }

  /**Sets <code>value</code> as the attribute value for ModelNumber
   */
  public void setModelNumber(String value)
  {
    setAttributeInternal(MODELNUMBER, value);
  }

  /**Gets the attribute value for Available, using the alias name Available
   */
  public String getAvailable()
  {
    return (String) getAttributeInternal(AVAILABLE);
  }

  /**Sets <code>value</code> as the attribute value for Available
   */
  public void setAvailable(String value)
  {
    setAttributeInternal(AVAILABLE, value);
  }

  /**Gets the attribute value for InUseSince, using the alias name InUseSince
   */
  public Date getInUseSince()
  {
    return (Date) getAttributeInternal(INUSESINCE);
  }

  /**Sets <code>value</code> as the attribute value for InUseSince
   */
  public void setInUseSince(Date value)
  {
    setAttributeInternal(INUSESINCE, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index,
                                         AttributeDefImpl attrDef)
    throws Exception
  {
        switch (index) {
        case ASSETID:
            return getAssetId();
        case EMPLOYEEID:
            return getEmployeeId();
        case ASSETTYPE:
            return getAssetType();
        case MODELNUMBER:
            return getModelNumber();
        case AVAILABLE:
            return getAvailable();
        case INUSESINCE:
            return getInUseSince();
        case ASSETNUMBID:
            return getAssetnumbId();
        case ASSETNUMBSTRUCTUREID:
            return getAssetnumbStructureId();
        case CCID:
            return getCCID();
        case FWKTBXNEWEMPLOYEEEO:
            return getFwkTbxNewEMployeeEO();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value,
                                       AttributeDefImpl attrDef)
    throws Exception
  {
        switch (index) {
        case ASSETID:
            setAssetId((Number)value);
            return;
        case EMPLOYEEID:
            setEmployeeId((Number)value);
            return;
        case ASSETTYPE:
            setAssetType((String)value);
            return;
        case MODELNUMBER:
            setModelNumber((String)value);
            return;
        case AVAILABLE:
            setAvailable((String)value);
            return;
        case INUSESINCE:
            setInUseSince((Date)value);
            return;
        case ASSETNUMBID:
            setAssetnumbId((Number)value);
            return;
        case ASSETNUMBSTRUCTUREID:
            setAssetnumbStructureId((Number)value);
            return;
        case CCID:
            setCCID((Number)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

  /**Gets the associated entity FwkTbxNewEMployeeEOImpl
   */
  public FwkTbxNewEMployeeEOImpl getFwkTbxNewEMployeeEO()
  {
    return (FwkTbxNewEMployeeEOImpl) getAttributeInternal(FWKTBXNEWEMPLOYEEEO);
  }

  /**Sets <code>value</code> as the associated entity FwkTbxNewEMployeeEOImpl
   */
  public void setFwkTbxNewEMployeeEO(FwkTbxNewEMployeeEOImpl value)
  {
    setAttributeInternal(FWKTBXNEWEMPLOYEEEO, value);
  }


  public void setCreationDate(Date creationDate)
  {
  }

  public void setCreatedBy(Number createdBy)
  {
  }

  public void setLastUpdateDate(Date lastUpdateDate)
  {
  }

  public void setLastUpdatedBy(Number lastUpdatedBy)
  {
  }

  public void setLastUpdateLogin(Number lastUpdateLogin)
  {
  }


    /**Gets the attribute value for AssetnumbId, using the alias name AssetnumbId
     */
    public Number getAssetnumbId() {
        return (Number)getAttributeInternal(ASSETNUMBID);
    }

    /**Sets <code>value</code> as the attribute value for AssetnumbId
     */
    public void setAssetnumbId(Number value) {
        setAttributeInternal(ASSETNUMBID, value);
    }

    /**Gets the attribute value for AssetnumbStructureId, using the alias name AssetnumbStructureId
     */
    public Number getAssetnumbStructureId() {
        return (Number)getAttributeInternal(ASSETNUMBSTRUCTUREID);
    }

    /**Sets <code>value</code> as the attribute value for AssetnumbStructureId
     */
    public void setAssetnumbStructureId(Number value) {
        setAttributeInternal(ASSETNUMBSTRUCTUREID, value);
    }

    /**Gets the attribute value for CCID, using the alias name CCID
     */
    public Number getCCID() {
        return (Number)getAttributeInternal(CCID);
    }

    /**Sets <code>value</code> as the attribute value for CCID
     */
    public void setCCID(Number value) {
        setAttributeInternal(CCID, value);
    }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number assetId) {
        return new Key(new Object[]{assetId});
    }
}
