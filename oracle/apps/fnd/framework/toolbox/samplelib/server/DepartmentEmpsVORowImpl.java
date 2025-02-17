/*===========================================================================+
 |      Copyright (c) 2001 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
// javadoc_private
package oracle.apps.fnd.framework.toolbox.samplelib.server;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewRowImpl;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class DepartmentEmpsVORowImpl extends OAViewRowImpl {

    public static final int DEPARTMENTID = 0;
    public static final String RCS_ID="$Header: DepartmentEmpsVORowImpl.java 120.2 2006/07/03 16:45:46 atgops1 noship $";
  public static final boolean RCS_ID_RECORDED =
    VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.samplelib.server");
    public static final int EMPLOYEEID = 1;
    public static final int EMPLOYEENAME = 2;
    public static final int EMPLOYEEEMAIL = 3;


    /**
     *
     * This is the default constructor (do not remove)
     */
  public DepartmentEmpsVORowImpl()
  {
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute DepartmentId
   */
  public Number getDepartmentId()
  {
    return (Number)getAttributeInternal(DEPARTMENTID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute DepartmentId
   */
  public void setDepartmentId(Number value)
  {
    setAttributeInternal(DEPARTMENTID, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute EmployeeId
   */
  public Number getEmployeeId()
  {
    return (Number)getAttributeInternal(EMPLOYEEID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute EmployeeId
   */
  public void setEmployeeId(Number value)
  {
    setAttributeInternal(EMPLOYEEID, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute EmployeeName
   */
  public String getEmployeeName()
  {
    return (String)getAttributeInternal(EMPLOYEENAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute EmployeeName
   */
  public void setEmployeeName(String value)
  {
    setAttributeInternal(EMPLOYEENAME, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute EmployeeEmail
   */
  public String getEmployeeEmail()
  {
    return (String)getAttributeInternal(EMPLOYEEEMAIL);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute EmployeeEmail
   */
  public void setEmployeeEmail(String value)
  {
    setAttributeInternal(EMPLOYEEEMAIL, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case DEPARTMENTID:
            return getDepartmentId();
        case EMPLOYEEID:
            return getEmployeeId();
        case EMPLOYEENAME:
            return getEmployeeName();
        case EMPLOYEEEMAIL:
            return getEmployeeEmail();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
        switch (index) {
        case DEPARTMENTID:
            setDepartmentId((Number)value);
            return;
        case EMPLOYEEID:
            setEmployeeId((Number)value);
            return;
        case EMPLOYEENAME:
            setEmployeeName((String)value);
            return;
        case EMPLOYEEEMAIL:
            setEmployeeEmail((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}