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
public class FwkTbxNewEmpTrainingsEOImpl
  extends OAEntityImpl {
    public static final int EMPTRAININGID = 0;
    public static final int TRAININGID = 1;
    public static final int EMPLOYEEID = 2;
    public static final int STATUS = 3;
    public static final int STARTDATE = 4;
    public static final int ENROLLEDDATE = 5;
    public static final int ENDDATE = 6;
    public static final int CERTIFICATION = 7;
    public static final int FWKTBXNEWEMPLOYEEEO = 8;
    public static final int FWKTBXNEWTRAININGEO = 9;
    private static FwkTbxNewEmpTrainingsEODefImpl mDefinitionObject;
    public static final String RCS_ID = "$Header: FwkTbxNewEmpTrainingsEOImpl.java 120.0.12020000.1 2020/01/08 06:29:43 spunam noship $";
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");

  /**This is the default constructor (do not remove)
   */
  public FwkTbxNewEmpTrainingsEOImpl()
  {
  }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = (FwkTbxNewEmpTrainingsEODefImpl)EntityDefImpl.findDefObject("oracle.apps.fnd.framework.toolbox.tutorial2.server.FwkTbxNewEmpTrainingsEO");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for EmpTrainingId, using the alias name EmpTrainingId
     */
  public Number getEmpTrainingId()
  {
    return (Number) getAttributeInternal(EMPTRAININGID);
  }

  /**Sets <code>value</code> as the attribute value for EmpTrainingId
   */
  public void setEmpTrainingId(Number value)
  {
    setAttributeInternal(EMPTRAININGID, value);
  }

  /**Gets the attribute value for TrainingId, using the alias name TrainingId
   */
  public Number getTrainingId()
  {
    return (Number) getAttributeInternal(TRAININGID);
  }

  /**Sets <code>value</code> as the attribute value for TrainingId
   */
  public void setTrainingId(Number value)
  {
    setAttributeInternal(TRAININGID, value);
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

  /**Gets the attribute value for Status, using the alias name Status
   */
  public String getStatus()
  {
    return (String) getAttributeInternal(STATUS);
  }

  /**Sets <code>value</code> as the attribute value for Status
   */
  public void setStatus(String value)
  {
    setAttributeInternal(STATUS, value);
  }

  /**Gets the attribute value for StartDate, using the alias name StartDate
   */
  public Date getStartDate()
  {
    return (Date) getAttributeInternal(STARTDATE);
  }

  /**Sets <code>value</code> as the attribute value for StartDate
   */
  public void setStartDate(Date value)
  {
    setAttributeInternal(STARTDATE, value);
  }

  /**Gets the attribute value for EnrolledDate, using the alias name EnrolledDate
   */
  public Date getEnrolledDate()
  {
    return (Date) getAttributeInternal(ENROLLEDDATE);
  }

  /**Sets <code>value</code> as the attribute value for EnrolledDate
   */
  public void setEnrolledDate(Date value)
  {
    setAttributeInternal(ENROLLEDDATE, value);
  }

  /**Gets the attribute value for EndDate, using the alias name EndDate
   */
  public Date getEndDate()
  {
    return (Date) getAttributeInternal(ENDDATE);
  }

  /**Sets <code>value</code> as the attribute value for EndDate
   */
  public void setEndDate(Date value)
  {
    setAttributeInternal(ENDDATE, value);
  }

  /**Gets the attribute value for Certification, using the alias name Certification
   */
  public String getCertification()
  {
    return (String) getAttributeInternal(CERTIFICATION);
  }

  /**Sets <code>value</code> as the attribute value for Certification
   */
  public void setCertification(String value)
  {
    setAttributeInternal(CERTIFICATION, value);
  }

  public void setCreationDate(Date creationDate)
  {
    String a = null;
  }

  public void setCreatedBy(Number createdBy)
  {
    String a = null;
  }

  public void setLastUpdateDate(Date lastUpdateDate)
  {
    String a = null;
  }

  public void setLastUpdatedBy(Number lastUpdatedBy)
  {
    String a = null;
  }

  public void setLastUpdateLogin(Number lastUpdateLogin)
  {
    String a = null;
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index,
                                         AttributeDefImpl attrDef)
    throws Exception
  {
        switch (index) {
        case EMPTRAININGID:
            return getEmpTrainingId();
        case TRAININGID:
            return getTrainingId();
        case EMPLOYEEID:
            return getEmployeeId();
        case STATUS:
            return getStatus();
        case STARTDATE:
            return getStartDate();
        case ENROLLEDDATE:
            return getEnrolledDate();
        case ENDDATE:
            return getEndDate();
        case CERTIFICATION:
            return getCertification();
        case FWKTBXNEWTRAININGEO:
            return getFwkTbxNewTrainingEO();
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
        case EMPTRAININGID:
            setEmpTrainingId((Number)value);
            return;
        case TRAININGID:
            setTrainingId((Number)value);
            return;
        case EMPLOYEEID:
            setEmployeeId((Number)value);
            return;
        case STATUS:
            setStatus((String)value);
            return;
        case STARTDATE:
            setStartDate((Date)value);
            return;
        case ENROLLEDDATE:
            setEnrolledDate((Date)value);
            return;
        case ENDDATE:
            setEndDate((Date)value);
            return;
        case CERTIFICATION:
            setCertification((String)value);
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

    /**Gets the associated entity FwkTbxNewTrainingEOImpl
     */
    public FwkTbxNewTrainingEOImpl getFwkTbxNewTrainingEO() {
        return (FwkTbxNewTrainingEOImpl)getAttributeInternal(FWKTBXNEWTRAININGEO);
    }

    /**Sets <code>value</code> as the associated entity FwkTbxNewTrainingEOImpl
     */
    public void setFwkTbxNewTrainingEO(FwkTbxNewTrainingEOImpl value) {
        setAttributeInternal(FWKTBXNEWTRAININGEO, value);
    }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number empTrainingId) {
        return new Key(new Object[]{empTrainingId});
    }
}
