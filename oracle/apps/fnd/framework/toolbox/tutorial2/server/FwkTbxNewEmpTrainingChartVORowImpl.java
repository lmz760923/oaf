package oracle.apps.fnd.framework.toolbox.tutorial2.server;
/*========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 |                      All rights reserved.                              |
 +========================================================================+
 |  HISTORY                                                               |
 | 5-Nov-2014 SRSIDDAM Created.                                           |
 +========================================================================*/
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FwkTbxNewEmpTrainingChartVORowImpl extends OAViewRowImpl {
    public static final int POSITIONCODE = 0;
    public static final int AVERAGEDAYS = 1;
    public static final int EMPLOYEEID = 2;
    public static final int AVERAGEHOURS = 3;
    public static final int YEAR = 4;
    public static final String RCS_ID = "$Header: FwkTbxNewEmpTrainingChartVORowImpl.java 120.0.12020000.1 2020/01/08 06:19:12 spunam noship $";
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");

    /**This is the default constructor (do not remove)
     */
    public FwkTbxNewEmpTrainingChartVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute PositionCode
     */
    public String getPositionCode() {
        return (String) getAttributeInternal(POSITIONCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute PositionCode
     */
    public void setPositionCode(String value) {
        setAttributeInternal(POSITIONCODE, value);
    }

    /**Gets the attribute value for the calculated attribute AverageDays
     */
    public Number getAverageDays() {
        return (Number) getAttributeInternal(AVERAGEDAYS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute AverageDays
     */
    public void setAverageDays(Number value) {
        setAttributeInternal(AVERAGEDAYS, value);
    }

    /**Gets the attribute value for the calculated attribute EmployeeId
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute EmployeeId
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**Gets the attribute value for the calculated attribute AverageHours
     */
    public Number getAverageHours() {
        return (Number) getAttributeInternal(AVERAGEHOURS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute AverageHours
     */
    public void setAverageHours(Number value) {
        setAttributeInternal(AVERAGEHOURS, value);
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
        case POSITIONCODE:
            return getPositionCode();
        case AVERAGEDAYS:
            return getAverageDays();
        case EMPLOYEEID:
            return getEmployeeId();
        case AVERAGEHOURS:
            return getAverageHours();
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
        case POSITIONCODE:
            setPositionCode((String)value);
            return;
        case AVERAGEDAYS:
            setAverageDays((Number)value);
            return;
        case EMPLOYEEID:
            setEmployeeId((Number)value);
            return;
        case AVERAGEHOURS:
            setAverageHours((Number)value);
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
