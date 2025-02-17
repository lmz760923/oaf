package oracle.apps.fnd.framework.toolbox.tutorial2.server;
/*===========================================================================+
 | Copyright (c) 2012, 2020 Oracle Corporation, Redwood Shores, CA, USA             |
 | All rights reserved.                                                       |
 +============================================================================+
 | HISTORY                                                                    |
 | 8/19/19 ychauhan created                                                   |
 |===========================================================================*/
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FwkTbxNewTrainingVORowImpl extends OAViewRowImpl {
    public static final String RCS_ID = "$Header: FwkTbxNewTrainingVORowImpl.java 120.0.12020000.1 2020/01/08 07:39:52 spunam noship $";
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");
    public static final int TRAININGID = 0;
    public static final int TRAININGNAME = 1;
    public static final int TRAININGDESCRIPTION = 2;
    public static final int MANDATORY = 3;
    public static final int TRAININGSTARTDATE = 4;
    public static final int TRAININGENDDATE = 5;
    public static final int INSTRUCTOR = 6;
    public static final int DURATIONINMIN = 7;
    public static final int ENROLLSWITCHER = 8;
	

    /**This is the default constructor (do not remove)
     */
    public FwkTbxNewTrainingVORowImpl() {
    }

    /**Gets FwkTbxNewTrainingEO entity object.
     */
    public FwkTbxNewTrainingEOImpl getFwkTbxNewTrainingEO() {
        return (FwkTbxNewTrainingEOImpl)getEntity(0);
    }

    /**Gets the attribute value for TRAINING_ID using the alias name TrainingId
     */
    public Number getTrainingId() {
        return (Number) getAttributeInternal(TRAININGID);
    }

    /**Sets <code>value</code> as attribute value for TRAINING_ID using the alias name TrainingId
     */
    public void setTrainingId(Number value) {
        setAttributeInternal(TRAININGID, value);
    }

    /**Gets the attribute value for TRAINING_NAME using the alias name TrainingName
     */
    public String getTrainingName() {
        return (String) getAttributeInternal(TRAININGNAME);
    }

    /**Sets <code>value</code> as attribute value for TRAINING_NAME using the alias name TrainingName
     */
    public void setTrainingName(String value) {
        setAttributeInternal(TRAININGNAME, value);
    }

    /**Gets the attribute value for TRAINING_DESCRIPTION using the alias name TrainingDescription
     */
    public String getTrainingDescription() {
        return (String) getAttributeInternal(TRAININGDESCRIPTION);
    }

    /**Sets <code>value</code> as attribute value for TRAINING_DESCRIPTION using the alias name TrainingDescription
     */
    public void setTrainingDescription(String value) {
        setAttributeInternal(TRAININGDESCRIPTION, value);
    }

    /**Gets the attribute value for MANDATORY using the alias name Mandatory
     */
    public String getMandatory() {
        return (String) getAttributeInternal(MANDATORY);
    }

    /**Sets <code>value</code> as attribute value for MANDATORY using the alias name Mandatory
     */
    public void setMandatory(String value) {
        setAttributeInternal(MANDATORY, value);
    }

    /**Gets the attribute value for TRAINING_START_DATE using the alias name TrainingStartDate
     */
    public Date getTrainingStartDate() {
        return (Date) getAttributeInternal(TRAININGSTARTDATE);
    }

    /**Sets <code>value</code> as attribute value for TRAINING_START_DATE using the alias name TrainingStartDate
     */
    public void setTrainingStartDate(Date value) {
        setAttributeInternal(TRAININGSTARTDATE, value);
    }

    /**Gets the attribute value for TRAINING_END_DATE using the alias name TrainingEndDate
     */
    public Date getTrainingEndDate() {
        return (Date) getAttributeInternal(TRAININGENDDATE);
    }

    /**Sets <code>value</code> as attribute value for TRAINING_END_DATE using the alias name TrainingEndDate
     */
    public void setTrainingEndDate(Date value) {
        setAttributeInternal(TRAININGENDDATE, value);
    }

    /**Gets the attribute value for INSTRUCTOR using the alias name Instructor
     */
    public String getInstructor() {
        return (String) getAttributeInternal(INSTRUCTOR);
    }

    /**Sets <code>value</code> as attribute value for INSTRUCTOR using the alias name Instructor
     */
    public void setInstructor(String value) {
        setAttributeInternal(INSTRUCTOR, value);
    }

    /**Gets the attribute value for DURATION_IN_MIN using the alias name DurationInMin
     */
    public Number getDurationInMin() {
        return (Number) getAttributeInternal(DURATIONINMIN);
    }

    /**Sets <code>value</code> as attribute value for DURATION_IN_MIN using the alias name DurationInMin
     */
    public void setDurationInMin(Number value) {
        setAttributeInternal(DURATIONINMIN, value);
    }

    /**Gets the attribute value for the calculated attribute EnrollSwitcher
     */
    public String getEnrollSwitcher() {
        return (String) getAttributeInternal(ENROLLSWITCHER);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute EnrollSwitcher
     */
    public void setEnrollSwitcher(String value) {
        setAttributeInternal(ENROLLSWITCHER, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case TRAININGID:
            return getTrainingId();
        case TRAININGNAME:
            return getTrainingName();
        case TRAININGDESCRIPTION:
            return getTrainingDescription();
        case MANDATORY:
            return getMandatory();
        case TRAININGSTARTDATE:
            return getTrainingStartDate();
        case TRAININGENDDATE:
            return getTrainingEndDate();
        case INSTRUCTOR:
            return getInstructor();
        case DURATIONINMIN:
            return getDurationInMin();
        case ENROLLSWITCHER:
            return getEnrollSwitcher();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case TRAININGID:
            setTrainingId((Number)value);
            return;
        case TRAININGNAME:
            setTrainingName((String)value);
            return;
        case TRAININGDESCRIPTION:
            setTrainingDescription((String)value);
            return;
        case MANDATORY:
            setMandatory((String)value);
            return;
        case TRAININGSTARTDATE:
            setTrainingStartDate((Date)value);
            return;
        case TRAININGENDDATE:
            setTrainingEndDate((Date)value);
            return;
        case INSTRUCTOR:
            setInstructor((String)value);
            return;
        case DURATIONINMIN:
            setDurationInMin((Number)value);
            return;
        case ENROLLSWITCHER:
            setEnrollSwitcher((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
