/* +======================================================================+ */
/* |    Copyright (c) 2005, 2014 Oracle and/or its affiliates.           | */
/* |                         All rights reserved.                         | */
/* |                           Version 12.0.0                             | */
/* +======================================================================+ */
package oracle.apps.fnd.framework.toolbox.tutorial.server;
import oracle.apps.fnd.framework.server.OAViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import oracle.apps.fnd.common.VersionInfo;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
// javadoc_private

public class PoLinesExpVORowImpl extends OAViewRowImpl {

    public static final int LINEID = 0;
    public static final String RCS_ID="$Header: PoLinesExpVORowImpl.java 120.2.12020000.2 2014/09/18 14:10:00 spunam ship $";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial.server");
    public static final int HEADERID = 1;
    public static final int LINENUMBER = 2;
    public static final int ITEMID = 3;
    public static final int ITEMDESCRIPTION = 4;
    public static final int QUANTITY = 5;
    public static final int UNITPRICE = 6;
    public static final int UNITOFMEASURE = 7;
    public static final int LINETOTAL = 8;
    public static final int ITEMNAME = 9;
    public static final int ATTRIBUTECATEGORY = 10;
    public static final int ATTRIBUTE1 = 11;
    public static final int ATTRIBUTE2 = 12;
    public static final int ATTRIBUTE3 = 13;
    public static final int ATTRIBUTE4 = 14;
    public static final int NEEDBYDATE = 15;


    /**
     *
     * This is the default constructor (do not remove)
     */
  public PoLinesExpVORowImpl()
  {
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute LineId
   */
  public Number getLineId()
  {
    return (Number)getAttributeInternal(LINEID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute LineId
   */
  public void setLineId(Number value)
  {
    setAttributeInternal(LINEID, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute HeaderId
   */
  public Number getHeaderId()
  {
    return (Number)getAttributeInternal(HEADERID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId
   */
  public void setHeaderId(Number value)
  {
    setAttributeInternal(HEADERID, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute LineNumber
   */
  public Number getLineNumber()
  {
    return (Number)getAttributeInternal(LINENUMBER);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute LineNumber
   */
  public void setLineNumber(Number value)
  {
    setAttributeInternal(LINENUMBER, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute ItemId
   */
  public Number getItemId()
  {
    return (Number)getAttributeInternal(ITEMID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute ItemId
   */
  public void setItemId(Number value)
  {
    setAttributeInternal(ITEMID, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute ItemDescription
   */
  public String getItemDescription()
  {
    return (String)getAttributeInternal(ITEMDESCRIPTION);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute ItemDescription
   */
  public void setItemDescription(String value)
  {
    setAttributeInternal(ITEMDESCRIPTION, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute Quantity
   */
  public Number getQuantity()
  {
    return (Number)getAttributeInternal(QUANTITY);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute Quantity
   */
  public void setQuantity(Number value)
  {
    setAttributeInternal(QUANTITY, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute UnitPrice
   */
  public Number getUnitPrice()
  {
    return (Number)getAttributeInternal(UNITPRICE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute UnitPrice
   */
  public void setUnitPrice(Number value)
  {
    setAttributeInternal(UNITPRICE, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute UnitOfMeasure
   */
  public String getUnitOfMeasure()
  {
    return (String)getAttributeInternal(UNITOFMEASURE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute UnitOfMeasure
   */
  public void setUnitOfMeasure(String value)
  {
    setAttributeInternal(UNITOFMEASURE, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute LineTotal
   */
  public Number getLineTotal()
  {
    return (Number)getAttributeInternal(LINETOTAL);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute LineTotal
   */
  public void setLineTotal(Number value)
  {
    setAttributeInternal(LINETOTAL, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute ItemName
   */
  public String getItemName()
  {
    return (String)getAttributeInternal(ITEMNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute ItemName
   */
  public void setItemName(String value)
  {
    setAttributeInternal(ITEMNAME, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute NeedByDate
   */
  public Date getNeedByDate()
  {
    return (Date)getAttributeInternal(NEEDBYDATE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute NeedByDate
   */
  public void setNeedByDate(Date value)
  {
    setAttributeInternal(NEEDBYDATE, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case LINEID:
            return getLineId();
        case HEADERID:
            return getHeaderId();
        case LINENUMBER:
            return getLineNumber();
        case ITEMID:
            return getItemId();
        case ITEMDESCRIPTION:
            return getItemDescription();
        case QUANTITY:
            return getQuantity();
        case UNITPRICE:
            return getUnitPrice();
        case UNITOFMEASURE:
            return getUnitOfMeasure();
        case LINETOTAL:
            return getLineTotal();
        case ITEMNAME:
            return getItemName();
        case ATTRIBUTECATEGORY:
            return getAttributeCategory();
        case ATTRIBUTE1:
            return getAttribute1();
        case ATTRIBUTE2:
            return getAttribute2();
        case ATTRIBUTE3:
            return getAttribute3();
        case ATTRIBUTE4:
            return getAttribute4();
        case NEEDBYDATE:
            return getNeedByDate();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case LINEID:
            setLineId((Number)value);
            return;
        case HEADERID:
            setHeaderId((Number)value);
            return;
        case LINENUMBER:
            setLineNumber((Number)value);
            return;
        case ITEMID:
            setItemId((Number)value);
            return;
        case ITEMDESCRIPTION:
            setItemDescription((String)value);
            return;
        case QUANTITY:
            setQuantity((Number)value);
            return;
        case UNITPRICE:
            setUnitPrice((Number)value);
            return;
        case UNITOFMEASURE:
            setUnitOfMeasure((String)value);
            return;
        case LINETOTAL:
            setLineTotal((Number)value);
            return;
        case ITEMNAME:
            setItemName((String)value);
            return;
        case ATTRIBUTECATEGORY:
            setAttributeCategory((String)value);
            return;
        case ATTRIBUTE1:
            setAttribute1((String)value);
            return;
        case ATTRIBUTE2:
            setAttribute2((String)value);
            return;
        case ATTRIBUTE3:
            setAttribute3((String)value);
            return;
        case ATTRIBUTE4:
            setAttribute4((String)value);
            return;
        case NEEDBYDATE:
            setNeedByDate((Date)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

    /**Gets the attribute value for the calculated attribute AttributeCategory
     */
    public String getAttributeCategory() {
        return (String) getAttributeInternal(ATTRIBUTECATEGORY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute AttributeCategory
     */
    public void setAttributeCategory(String value) {
        setAttributeInternal(ATTRIBUTECATEGORY, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }
}
