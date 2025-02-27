/*========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 |                      All rights reserved.                              |
 +========================================================================+
 |  HISTORY                                                               |
 | 5-Nov-2014 SRSIDDAM Created.                                           |
 +========================================================================+
 */
package oracle.apps.fnd.framework.toolbox.tutorial2.server;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAEntityDefImpl;
import oracle.apps.fnd.framework.server.OAEntityImpl;


import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class   FwkTbxNewEmpSkillsEOImpl extends OAEntityImpl {
    public static final int SKILLID = 0;
    public static final String RCS_ID = "$Header: FwkTbxNewEmpSkillsEOImpl.java 120.0.12020000.1 2020/01/08 06:06:17 spunam noship $"; 
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");
    public static final int EMPLOYEEID = 1;
    public static final int SKILLRATING = 2;
    public static final int PROFICIENCY = 3;
    public static final int FWKTBXNEWEMPLOYEEEO = 4;
    public static final int FWKTBXNEWSKILLSEO = 5;
    public static final int FWKTBXNEWSKILLSEO1 = 6;
    public static final int FWKTBXNEWSKILLSVO = 7;

    private static FwkTbxNewEmpSkillsEODefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public FwkTbxNewEmpSkillsEOImpl() {
    }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = (FwkTbxNewEmpSkillsEODefImpl)EntityDefImpl.findDefObject("oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpSkillsEO");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for SkillId, using the alias name SkillId
     */
    public Number getSkillId() {
        return (Number)getAttributeInternal(SKILLID);
    }

    /**Sets <code>value</code> as the attribute value for SkillId
     */
    public void setSkillId(Number value) {
        setAttributeInternal(SKILLID, value);
    }

    /**Gets the attribute value for EmployeeId, using the alias name EmployeeId
     */
    public Number getEmployeeId() {
        return (Number)getAttributeInternal(EMPLOYEEID);
    }

    /**Sets <code>value</code> as the attribute value for EmployeeId
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**Gets the attribute value for SkillRating, using the alias name SkillRating
     */
    public Number getSkillRating() {
        return (Number)getAttributeInternal(SKILLRATING);
    }

    /**Sets <code>value</code> as the attribute value for SkillRating
     */
    public void setSkillRating(Number value) {
        setAttributeInternal(SKILLRATING, value);
    }

    /**Gets the attribute value for Proficiency, using the alias name Proficiency
     */
    public String getProficiency() {
        return (String)getAttributeInternal(PROFICIENCY);
    }

    /**Sets <code>value</code> as the attribute value for Proficiency
     */
    public void setProficiency(String value) {
        setAttributeInternal(PROFICIENCY, value);
    }
    public void setCreationDate(Date creationDate){};
    public void setCreatedBy(Number createdBy){};
    public void setLastUpdateDate(Date lastUpdateDate){};
    public void setLastUpdatedBy(Number lastUpdatedBy){};
    public void setLastUpdateLogin(Number lastUpdateLogin){};


    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case SKILLID:
            return getSkillId();
        case EMPLOYEEID:
            return getEmployeeId();
        case SKILLRATING:
            return getSkillRating();
        case PROFICIENCY:
            return getProficiency();
        case FWKTBXNEWSKILLSEO1:
            return getFwkTbxNewSkillsEO1();
        case FWKTBXNEWEMPLOYEEEO:
            return getFwkTbxNewEMployeeEO();
        case FWKTBXNEWSKILLSEO:
            return getFwkTbxNewSkillsEO();
        case FWKTBXNEWSKILLSVO:
            return getFwkTbxNewSkillsVO();
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
        case EMPLOYEEID:
            setEmployeeId((Number)value);
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

    /**Gets the associated entity FwkTbxNewEMployeeEOImpl
     */
    public FwkTbxNewEMployeeEOImpl getFwkTbxNewEMployeeEO() {
        return (FwkTbxNewEMployeeEOImpl)getAttributeInternal(FWKTBXNEWEMPLOYEEEO);
    }

    /**Sets <code>value</code> as the associated entity FwkTbxNewEMployeeEOImpl
     */
    public void setFwkTbxNewEMployeeEO(FwkTbxNewEMployeeEOImpl value) {
        setAttributeInternal(FWKTBXNEWEMPLOYEEEO, value);
    }

    /**Add attribute defaulting logic in this method.
     */
    public void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**Add Entity validation code in this method.
     */
    protected void validateEntity() {
        super.validateEntity();
    }

    /**Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**Custom DML update/insert/delete logic here.
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }


  /**Gets the associated entity FwkTbxNewSkillsEOImpl
   */
  public FwkTbxNewSkillsEOImpl getFwkTbxNewSkillsEO()
  {
    return (FwkTbxNewSkillsEOImpl)getAttributeInternal(FWKTBXNEWSKILLSEO);
  }

  /**Sets <code>value</code> as the associated entity FwkTbxNewSkillsEOImpl
   */
  public void setFwkTbxNewSkillsEO(FwkTbxNewSkillsEOImpl value)
  {
    setAttributeInternal(FWKTBXNEWSKILLSEO, value);
  }

  /**Uses the link FwkTbxEmpSkillsVL to return rows of FwkTbxNewSkillsVO
   */
  public RowIterator getFwkTbxNewSkillsVO()
  {
    return (RowIterator)getAttributeInternal(FWKTBXNEWSKILLSVO);
  }

  /**Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getFwkTbxNewSkillsEO1()
  {
    return (RowIterator)getAttributeInternal(FWKTBXNEWSKILLSEO1);
  }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number skillId, Number employeeId) {
        return new Key(new Object[]{skillId, employeeId});
    }
}
