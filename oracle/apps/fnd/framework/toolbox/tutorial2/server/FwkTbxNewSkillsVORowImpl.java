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

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FwkTbxNewSkillsVORowImpl extends OAViewRowImpl {
    public static final String RCS_ID = "$Header: FwkTbxNewSkillsVORowImpl.java 120.0.12020000.1 2020/01/08 07:37:13 spunam noship $";
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");
    public static final int SKILLID = 0;
    public static final int SKILLNAME = 1;
    public static final int VERSION = 2;
    public static final int BROADCATEGORY = 3;
    public static final int SKILLCATEGORY = 4;
    public static final int EMPLOYEEID = 5;
    public static final int SKILLID1 = 6;
    public static final int SKILLRATING = 7;
    public static final int PROFICIENCY = 8;
    public static final int FWKTBXNEWEMPSKILLSVO = 9;

    /**This is the default constructor (do not remove)
     */
    public FwkTbxNewSkillsVORowImpl() {
    }

    /**Gets FwkTbxNewSkillsEO entity object.
     */
    public FwkTbxNewSkillsEOImpl getFwkTbxNewSkillsEO() {
        return (FwkTbxNewSkillsEOImpl)getEntity(0);
    }

    /**Gets FwkTbxNewEmpSkillsEO entity object.
     */
    public FwkTbxNewEmpSkillsEOImpl getFwkTbxNewEmpSkillsEO() {
        return (FwkTbxNewEmpSkillsEOImpl)getEntity(1);
    }

    /**Gets the attribute value for SKILL_ID using the alias name SkillId
     */
    public Number getSkillId() {
        return (Number) getAttributeInternal(SKILLID);
    }

    /**Sets <code>value</code> as attribute value for SKILL_ID using the alias name SkillId
     */
    public void setSkillId(Number value) {
        setAttributeInternal(SKILLID, value);
    }

    /**Gets the attribute value for SKILL_NAME using the alias name SkillName
     */
    public String getSkillName() {
        return (String) getAttributeInternal(SKILLNAME);
    }

    /**Sets <code>value</code> as attribute value for SKILL_NAME using the alias name SkillName
     */
    public void setSkillName(String value) {
        setAttributeInternal(SKILLNAME, value);
    }

    /**Gets the attribute value for VERSION using the alias name Version
     */
    public String getVersion() {
        return (String) getAttributeInternal(VERSION);
    }

    /**Sets <code>value</code> as attribute value for VERSION using the alias name Version
     */
    public void setVersion(String value) {
        setAttributeInternal(VERSION, value);
    }

    /**Gets the attribute value for BROAD_CATEGORY using the alias name BroadCategory
     */
    public String getBroadCategory() {
        return (String) getAttributeInternal(BROADCATEGORY);
    }

    /**Sets <code>value</code> as attribute value for BROAD_CATEGORY using the alias name BroadCategory
     */
    public void setBroadCategory(String value) {
        setAttributeInternal(BROADCATEGORY, value);
    }

    /**Gets the attribute value for SKILL_CATEGORY using the alias name SkillCategory
     */
    public String getSkillCategory() {
        return (String) getAttributeInternal(SKILLCATEGORY);
    }

    /**Sets <code>value</code> as attribute value for SKILL_CATEGORY using the alias name SkillCategory
     */
    public void setSkillCategory(String value) {
        setAttributeInternal(SKILLCATEGORY, value);
    }

    /**Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**Gets the attribute value for SKILL_ID using the alias name SkillId1
     */
    public Number getSkillId1() {
        return (Number) getAttributeInternal(SKILLID1);
    }

    /**Sets <code>value</code> as attribute value for SKILL_ID using the alias name SkillId1
     */
    public void setSkillId1(Number value) {
        setAttributeInternal(SKILLID1, value);
    }

    /**Gets the attribute value for SKILL_RATING using the alias name SkillRating
     */
    public Number getSkillRating() {
        return (Number) getAttributeInternal(SKILLRATING);
    }

    /**Sets <code>value</code> as attribute value for SKILL_RATING using the alias name SkillRating
     */
    public void setSkillRating(Number value) {
        setAttributeInternal(SKILLRATING, value);
    }

    /**Gets the attribute value for PROFICIENCY using the alias name Proficiency
     */
    public String getProficiency() {
        return (String) getAttributeInternal(PROFICIENCY);
    }

    /**Sets <code>value</code> as attribute value for PROFICIENCY using the alias name Proficiency
     */
    public void setProficiency(String value) {
        setAttributeInternal(PROFICIENCY, value);
    }

    /**Gets the associated <code>Row</code> using master-detail link FwkTbxNewEmpSkillsVO
     */
    public Row getFwkTbxNewEmpSkillsVO() {
        return (Row)getAttributeInternal(FWKTBXNEWEMPSKILLSVO);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case SKILLID:
            return getSkillId();
        case SKILLNAME:
            return getSkillName();
        case VERSION:
            return getVersion();
        case BROADCATEGORY:
            return getBroadCategory();
        case SKILLCATEGORY:
            return getSkillCategory();
        case EMPLOYEEID:
            return getEmployeeId();
        case SKILLID1:
            return getSkillId1();
        case SKILLRATING:
            return getSkillRating();
        case PROFICIENCY:
            return getProficiency();
        case FWKTBXNEWEMPSKILLSVO:
            return getFwkTbxNewEmpSkillsVO();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case SKILLID:
            setSkillId((Number)value);
            return;
        case SKILLNAME:
            setSkillName((String)value);
            return;
        case VERSION:
            setVersion((String)value);
            return;
        case BROADCATEGORY:
            setBroadCategory((String)value);
            return;
        case SKILLCATEGORY:
            setSkillCategory((String)value);
            return;
        case EMPLOYEEID:
            setEmployeeId((Number)value);
            return;
        case SKILLID1:
            setSkillId1((Number)value);
            return;
        case SKILLRATING:
            setSkillRating((Number)value);
            return;
        case PROFICIENCY:
            setProficiency((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
