package oracle.apps.fnd.framework.toolbox.schema.server;

import oracle.apps.fnd.framework.server.OAViewObjectImpl;
import oracle.jbo.domain.Number;
import oracle.apps.fnd.common.VersionInfo;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
// javadoc_private

public class OrderTotalVVOImpl extends OAViewObjectImpl {

  public static final String RCS_ID="$Header: OrderTotalVVOImpl.java 120.2 2006/07/03 20:27:01 atgops1 noship $";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.schema.server");

  public void initQuery(Number headerId)
  {
    setWhereClauseParams(null); // Always reset
    setWhereClauseParam(0, headerId);
    executeQuery();

  }
  
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public OrderTotalVVOImpl()
  {
  }
}
