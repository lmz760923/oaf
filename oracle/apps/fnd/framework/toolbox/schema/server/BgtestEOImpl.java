package oracle.apps.fnd.framework.toolbox.schema.server;

import oracle.apps.fnd.framework.server.OAEntityDefImpl;
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
public class BgtestEOImpl extends OAEntityImpl {
    public static final int ID = 0;
    public static final int NAME = 1;
    public static final int DESCRIPTION = 2;
    public static final int QTY = 3;
    public static final int CODEID = 4;
    public static final int CHARTOFACCOUNTSID = 5;


    private static OAEntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public BgtestEOImpl() {
    }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = 
                    (OAEntityDefImpl)EntityDefImpl.findDefObject("oracle.apps.fnd.framework.toolbox.schema.server.BgtestEO");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for Id, using the alias name Id
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as the attribute value for Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for Name, using the alias name Name
     */
    public String getName() {
        return (String)getAttributeInternal(NAME);
    }

    /**Sets <code>value</code> as the attribute value for Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**Gets the attribute value for Description, using the alias name Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**Sets <code>value</code> as the attribute value for Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**Gets the attribute value for Qty, using the alias name Qty
     */
    public Number getQty() {
        return (Number)getAttributeInternal(QTY);
    }

    /**Sets <code>value</code> as the attribute value for Qty
     */
    public void setQty(Number value) {
        setAttributeInternal(QTY, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ID:
            return getId();
        case NAME:
            return getName();
        case DESCRIPTION:
            return getDescription();
        case QTY:
            return getQty();
        case CODEID:
            return getCodeId();
        case CHARTOFACCOUNTSID:
            return getChartOfAccountsId();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ID:
            setId((Number)value);
            return;
        case NAME:
            setName((String)value);
            return;
        case DESCRIPTION:
            setDescription((String)value);
            return;
        case QTY:
            setQty((Number)value);
            return;
        case CODEID:
            setCodeId((Number)value);
            return;
        case CHARTOFACCOUNTSID:
            setChartOfAccountsId((Number)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }


    public void setLastUpdateDate(Date date) {
    }

    public void setLastUpdatedBy(Number number) {
    }

    public void setLastUpdateLogin(Number number) {
    }

    public void setCreationDate(Date date) {
    }

    public void setCreatedBy(Number number) {
    }

    /**Gets the attribute value for CodeId, using the alias name CodeId
     */
    public Number getCodeId() {
        return (Number)getAttributeInternal(CODEID);
    }

    /**Sets <code>value</code> as the attribute value for CodeId
     */
    public void setCodeId(Number value) {
        setAttributeInternal(CODEID, value);
    }

    /**Gets the attribute value for ChartOfAccountsId, using the alias name ChartOfAccountsId
     */
    public Number getChartOfAccountsId() {
        return (Number)getAttributeInternal(CHARTOFACCOUNTSID);
    }

    /**Sets <code>value</code> as the attribute value for ChartOfAccountsId
     */
    public void setChartOfAccountsId(Number value) {
        setAttributeInternal(CHARTOFACCOUNTSID, value);
    }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }
}
