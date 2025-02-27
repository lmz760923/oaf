/*===========================================================================+
 |      Copyright (c) 2001 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
 // javadoc_private
package oracle.apps.fnd.framework.toolbox.tutorial.server;

import java.util.Vector;

import oracle.jbo.domain.Number;

import oracle.apps.fnd.common.VersionInfo;

import oracle.apps.fnd.framework.server.OAViewObjectImpl;

public class SuppliersExpVOImpl extends OAViewObjectImpl {

  // Required for Applications source control
  public static final String RCS_ID="$Header: SuppliersExpVOImpl.java 120.1 2005/06/06 16:42:32 atgops1 noship $";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "oracle.apps.fnd.framework.toolbox.tutorial.server");


  // Initialize and execute the query
  public void initQuery(String name, String onHold, String number)
  {
    
    StringBuffer whereClause = new StringBuffer(100);
    Vector parameters = new Vector(3);
    int clauseCount = 0;
    int bindCount = 0;
    
    setWhereClauseParams(null); // Always reset

    if ((name != null) && (!("".equals(name.trim()))))
    {
      whereClause.append(" NAME like :");
      whereClause.append(++bindCount);
      parameters.addElement(name + "%");
      clauseCount++;
    }

    if ((number != null) && (!("".equals(number.trim()))))
    {
    
     Number supplierId = null;
      
      try
      {
        supplierId = new Number(number);
      }  
      catch(Exception e) {}
      
      if (clauseCount > 0)
      {
        whereClause.append(" AND ");   
      }
           
      whereClause.append(" SUPPLIER_ID = :");
      whereClause.append(++bindCount);
      parameters.addElement(supplierId);
      clauseCount++;
    }

    if ((onHold != null) && (!("".equals(onHold.trim()))))
    {
      if (clauseCount > 0)
      {
        whereClause.append(" AND ");   
      }
      
      whereClause.append(" ON_HOLD_FLAG = :");
      whereClause.append(++bindCount);
      parameters.addElement("Y");  
      clauseCount++;
    }

    setWhereClause(whereClause.toString());

    if (bindCount > 0) 
    {
      Object[] params = new Object[bindCount];
      
      // the copyInto() is 1.1.8 compliant which, as of 4/02, is required by ARU
      
      parameters.copyInto(params); 
      setWhereClauseParams(params);
    }
    
    executeQuery();

  } // end initQuery( )

//  ---------------------------------------------------------------
//  ---    Unmodified, generated code from here
//  ---------------------------------------------------------------
  
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public SuppliersExpVOImpl()
  {
  }
}
