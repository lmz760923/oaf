package oracle.apps.fnd.framework.toolbox.tutorial.server;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;

import oracle.apps.fnd.common.VersionInfo;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.apps.fnd.framework.toolbox.schema.server.SupplierEOImpl;

//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
// javadoc_private

public class SuppliersVORowImpl extends OAViewRowImpl {

    public static final int SUPPLIERID = 0;
    public static final String RCS_ID="$Header: SuppliersVORowImpl.java 120.4 2006/07/04 02:36:12 atgops1 noship $";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial.server");
    public static final int NAME = 1;
    public static final int ONHOLDFLAG = 2;
    public static final int STARTDATE = 3;
    public static final int ENDDATE = 4;


    /**
     *
     * This is the default constructor (do not remove)
     */
  public SuppliersVORowImpl()
  {
  }

  /**
   * 
   * Gets SupplierEO entity object.
   */
  public SupplierEOImpl getSupplierEO()
  {
    return (SupplierEOImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for SUPPLIER_ID using the alias name SupplierId
   */
  public Number getSupplierId()
  {
    return (Number)getAttributeInternal(SUPPLIERID);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for SUPPLIER_ID using the alias name SupplierId
   */
  public void setSupplierId(Number value)
  {
    setAttributeInternal(SUPPLIERID, value);
  }

  /**
   * 
   * Gets the attribute value for NAME using the alias name Name
   */
  public String getName()
  {
    return (String)getAttributeInternal(NAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for NAME using the alias name Name
   */
  public void setName(String value)
  {
    setAttributeInternal(NAME, value);
  }

  /**
   * 
   * Gets the attribute value for ON_HOLD_FLAG using the alias name OnHoldFlag
   */
  public String getOnHoldFlag()
  {
    return (String)getAttributeInternal(ONHOLDFLAG);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for ON_HOLD_FLAG using the alias name OnHoldFlag
   */
  public void setOnHoldFlag(String value)
  {
    setAttributeInternal(ONHOLDFLAG, value);
  }

  /**
   * 
   * Gets the attribute value for START_DATE using the alias name StartDate
   */
  public Date getStartDate()
  {
    return (Date)getAttributeInternal(STARTDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate
   */
  public void setStartDate(Date value)
  {
    setAttributeInternal(STARTDATE, value);
  }

  /**
   * 
   * Gets the attribute value for END_DATE using the alias name EndDate
   */
  public Date getEndDate()
  {
    return (Date)getAttributeInternal(ENDDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate
   */
  public void setEndDate(Date value)
  {
    setAttributeInternal(ENDDATE, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case SUPPLIERID:
            return getSupplierId();
        case NAME:
            return getName();
        case ONHOLDFLAG:
            return getOnHoldFlag();
        case STARTDATE:
            return getStartDate();
        case ENDDATE:
            return getEndDate();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case SUPPLIERID:
            setSupplierId((Number)value);
            return;
        case NAME:
            setName((String)value);
            return;
        case ONHOLDFLAG:
            setOnHoldFlag((String)value);
            return;
        case STARTDATE:
            setStartDate((Date)value);
            return;
        case ENDDATE:
            setEndDate((Date)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
