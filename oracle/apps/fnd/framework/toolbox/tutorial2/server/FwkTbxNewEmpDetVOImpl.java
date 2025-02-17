package oracle.apps.fnd.framework.toolbox.tutorial2.server;
/*========================================================================+
 |   Copyright (c) 2001, 2020 Oracle Corporation, Redwood Shores, CA, USA |
 |                      All rights reserved.                              |
 +========================================================================+
 |  HISTORY                                                               |
 | 5-Nov-2014 SRSIDDAM Created.                                           |
 +========================================================================*/
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FwkTbxNewEmpDetVOImpl extends OAViewObjectImpl {
    public static final String RCS_ID = "$Header: FwkTbxNewEmpDetVOImpl.java 120.0.12020000.1 2020/01/08 05:43:25 spunam noship $";
    public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial2.server");
    /**This is the default constructor (do not remove)
     */
    public FwkTbxNewEmpDetVOImpl() {
    }
    public void initQuery(String empId) {
          if((empId!=null) && !("".equals(empId.trim()))) {
              Number employeeId = null;
              try{
                  employeeId = new Number(empId);       
              }
              catch(Exception exc) {
              throw new OAException("FND","FWK_TBX_INVALID_EMP_NUMBER");    
              }
              setWhereClause("EMPLOYEE_ID = :1");
              setWhereClauseParams(null);
              setWhereClauseParam(0, employeeId);
              executeQuery();
          }
        } 
}
