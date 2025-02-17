/*===========================================================================+
 |      Copyright (c) 2004 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
 // javadoc_private
package oracle.apps.fnd.framework.toolbox.tutorial.server;
import oracle.apps.fnd.framework.server.OAViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;

import oracle.apps.fnd.common.VersionInfo;

public class PurchaseOrderReceiptsSVORowImpl extends OAViewRowImpl {


    public static final int PONUMBER = 0;

    /**
     * Oracle Applications internal source control identifier
     */
    public static final String RCS_ID="$Header: PurchaseOrderReceiptsSVORowImpl.java 120.3 2006/07/04 01:35:57 atgops1 noship $";
  /**
   * Oracle Applications internal source control identifier
   */
   public static final boolean RCS_ID_RECORDED =
         VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial.server");
    public static final int LINEID = 1;
    public static final int HEADERID1 = 2;
    public static final int SHIPMENTID = 3;
    public static final int LINEID1 = 4;
    public static final int SHIPMENTNUMBER = 5;
    public static final int LINENUMBER = 6;
    public static final int NEEDBYDATE = 7;
    public static final int RECEIPTQUANTITY = 8;
    public static final int ORDERQUANTITY = 9;
    public static final int RECEIPTDATE = 10;

    /**
     *
     * This is the default constructor (do not remove)
     */
  public PurchaseOrderReceiptsSVORowImpl()
  {
  }

  /**
   * 
   * Gets PurchaseOrderHeaderEO entity object.
   */
  public oracle.apps.fnd.framework.toolbox.schema.server.PurchaseOrderHeaderEOImpl getPurchaseOrderHeaderEO()
  {
    return (oracle.apps.fnd.framework.toolbox.schema.server.PurchaseOrderHeaderEOImpl)getEntity(0);
  }

  /**
   * 
   * Gets PurchaseOrderLineEO entity object.
   */
  public oracle.apps.fnd.framework.toolbox.schema.server.PurchaseOrderLineEOImpl getPurchaseOrderLineEO()
  {
    return (oracle.apps.fnd.framework.toolbox.schema.server.PurchaseOrderLineEOImpl)getEntity(1);
  }

  /**
   * 
   * Gets PurchaseOrderShipmentEO entity object.
   */
  public oracle.apps.fnd.framework.toolbox.schema.server.PurchaseOrderShipmentEOImpl getPurchaseOrderShipmentEO()
  {
    return (oracle.apps.fnd.framework.toolbox.schema.server.PurchaseOrderShipmentEOImpl)getEntity(2);
  }

  /**
   * 
   * Gets the attribute value for HEADER_ID using the alias name PoNumber
   */
  public Number getPoNumber()
  {
    return (Number)getAttributeInternal(PONUMBER);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for HEADER_ID using the alias name PoNumber
   */
  public void setPoNumber(Number value)
  {
    setAttributeInternal(PONUMBER, value);
  }

  /**
   * 
   * Gets the attribute value for LINE_ID using the alias name LineId
   */
  public Number getLineId()
  {
    return (Number)getAttributeInternal(LINEID);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId
   */
  public void setLineId(Number value)
  {
    setAttributeInternal(LINEID, value);
  }

  /**
   * 
   * Gets the attribute value for HEADER_ID using the alias name HeaderId1
   */
  public Number getHeaderId1()
  {
    return (Number)getAttributeInternal(HEADERID1);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for HEADER_ID using the alias name HeaderId1
   */
  public void setHeaderId1(Number value)
  {
    setAttributeInternal(HEADERID1, value);
  }

  /**
   * 
   * Gets the attribute value for SHIPMENT_ID using the alias name ShipmentId
   */
  public Number getShipmentId()
  {
    return (Number)getAttributeInternal(SHIPMENTID);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for SHIPMENT_ID using the alias name ShipmentId
   */
  public void setShipmentId(Number value)
  {
    setAttributeInternal(SHIPMENTID, value);
  }

  /**
   * 
   * Gets the attribute value for LINE_ID using the alias name LineId1
   */
  public Number getLineId1()
  {
    return (Number)getAttributeInternal(LINEID1);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId1
   */
  public void setLineId1(Number value)
  {
    setAttributeInternal(LINEID1, value);
  }

  /**
   * 
   * Gets the attribute value for SHIPMENT_NUMBER using the alias name ShipmentNumber
   */
  public Number getShipmentNumber()
  {
    return (Number)getAttributeInternal(SHIPMENTNUMBER);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for SHIPMENT_NUMBER using the alias name ShipmentNumber
   */
  public void setShipmentNumber(Number value)
  {
    setAttributeInternal(SHIPMENTNUMBER, value);
  }

  /**
   * 
   * Gets the attribute value for LINE_NUMBER using the alias name LineNumber
   */
  public Number getLineNumber()
  {
    return (Number)getAttributeInternal(LINENUMBER);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LINE_NUMBER using the alias name LineNumber
   */
  public void setLineNumber(Number value)
  {
    setAttributeInternal(LINENUMBER, value);
  }

  /**
   * 
   * Gets the attribute value for NEED_BY_DATE using the alias name NeedByDate
   */
  public Date getNeedByDate()
  {
    return (Date)getAttributeInternal(NEEDBYDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for NEED_BY_DATE using the alias name NeedByDate
   */
  public void setNeedByDate(Date value)
  {
    setAttributeInternal(NEEDBYDATE, value);
  }

  /**
   * 
   * Gets the attribute value for RECEIPT_QUANTITY using the alias name ReceiptQuantity
   */
  public Number getReceiptQuantity()
  {
    return (Number)getAttributeInternal(RECEIPTQUANTITY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for RECEIPT_QUANTITY using the alias name ReceiptQuantity
   */
  public void setReceiptQuantity(Number value)
  {
    setAttributeInternal(RECEIPTQUANTITY, value);
  }

  /**
   * 
   * Gets the attribute value for ORDER_QUANTITY using the alias name OrderQuantity
   */
  public Number getOrderQuantity()
  {
    return (Number)getAttributeInternal(ORDERQUANTITY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for ORDER_QUANTITY using the alias name OrderQuantity
   */
  public void setOrderQuantity(Number value)
  {
    setAttributeInternal(ORDERQUANTITY, value);
  }

  /**
   * 
   * Gets the attribute value for RECEIPT_DATE using the alias name ReceiptDate
   */
  public Date getReceiptDate()
  {
    return (Date)getAttributeInternal(RECEIPTDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for RECEIPT_DATE using the alias name ReceiptDate
   */
  public void setReceiptDate(Date value)
  {
    setAttributeInternal(RECEIPTDATE, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case PONUMBER:
            return getPoNumber();
        case LINEID:
            return getLineId();
        case HEADERID1:
            return getHeaderId1();
        case SHIPMENTID:
            return getShipmentId();
        case LINEID1:
            return getLineId1();
        case SHIPMENTNUMBER:
            return getShipmentNumber();
        case LINENUMBER:
            return getLineNumber();
        case NEEDBYDATE:
            return getNeedByDate();
        case RECEIPTQUANTITY:
            return getReceiptQuantity();
        case ORDERQUANTITY:
            return getOrderQuantity();
        case RECEIPTDATE:
            return getReceiptDate();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case PONUMBER:
            setPoNumber((Number)value);
            return;
        case LINEID:
            setLineId((Number)value);
            return;
        case HEADERID1:
            setHeaderId1((Number)value);
            return;
        case SHIPMENTID:
            setShipmentId((Number)value);
            return;
        case LINEID1:
            setLineId1((Number)value);
            return;
        case SHIPMENTNUMBER:
            setShipmentNumber((Number)value);
            return;
        case LINENUMBER:
            setLineNumber((Number)value);
            return;
        case NEEDBYDATE:
            setNeedByDate((Date)value);
            return;
        case RECEIPTQUANTITY:
            setReceiptQuantity((Number)value);
            return;
        case ORDERQUANTITY:
            setOrderQuantity((Number)value);
            return;
        case RECEIPTDATE:
            setReceiptDate((Date)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }






















  //  Generated method. Do not modify.

  //  Generated method. Do not modify.


}