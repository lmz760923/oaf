package oracle.apps.fnd.framework.toolbox.tutorial2.server;
/*========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 |                      All rights reserved.                              |
 +========================================================================+
 |  HISTORY                                                               |
 | 5-Nov-2014 SRSIDDAM Created.                                           |
 +========================================================================+
 */
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FwkTbxNewEmpTrendGraph3VORowImpl extends OAViewRowImpl {
    public static final int MRCOUNT = 0;
    public static final int MRSCOUNT = 1;
    public static final int CONTRACTOR = 2;
    public static final int REGULAR = 3;
    public static final int YEAR = 4;
  	public static final String RCS_ID = "$Header: FwkTbxNewEmpTrendGraph3VORowImpl.java 120.0.12020000.1 2020/01/08 06:33:36 spunam noship $"; 
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");
    /**This is the default constructor (do not remove)
     */
    public FwkTbxNewEmpTrendGraph3VORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute MrCount
     */
    public Number getMrCount() {
        return (Number) getAttributeInternal(MRCOUNT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute MrCount
     */
    public void setMrCount(Number value) {
        setAttributeInternal(MRCOUNT, value);
    }

    /**Gets the attribute value for the calculated attribute MrsCount
     */
    public Number getMrsCount() {
        return (Number) getAttributeInternal(MRSCOUNT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute MrsCount
     */
    public void setMrsCount(Number value) {
        setAttributeInternal(MRSCOUNT, value);
    }

    /**Gets the attribute value for the calculated attribute Contractor
     */
    public Number getContractor() {
        return (Number) getAttributeInternal(CONTRACTOR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Contractor
     */
    public void setContractor(Number value) {
        setAttributeInternal(CONTRACTOR, value);
    }

    /**Gets the attribute value for the calculated attribute Regular
     */
    public Number getRegular() {
        return (Number) getAttributeInternal(REGULAR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Regular
     */
    public void setRegular(Number value) {
        setAttributeInternal(REGULAR, value);
    }

    /**Gets the attribute value for the calculated attribute Year
     */
    public String getYear() {
        return (String) getAttributeInternal(YEAR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Year
     */
    public void setYear(String value) {
        setAttributeInternal(YEAR, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case MRCOUNT:
            return getMrCount();
        case MRSCOUNT:
            return getMrsCount();
        case CONTRACTOR:
            return getContractor();
        case REGULAR:
            return getRegular();
        case YEAR:
            return getYear();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case MRCOUNT:
            setMrCount((Number)value);
            return;
        case MRSCOUNT:
            setMrsCount((Number)value);
            return;
        case CONTRACTOR:
            setContractor((Number)value);
            return;
        case REGULAR:
            setRegular((Number)value);
            return;
        case YEAR:
            setYear((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
