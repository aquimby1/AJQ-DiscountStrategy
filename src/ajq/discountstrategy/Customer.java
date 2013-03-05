/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is where the customer information is stored
 * @author Andrew Quimby
 * @version 1.00
 */
public class Customer {
    private String custId;
    private String custName;

    /**
     * This populates the customer properties
     * @param custId
     * @param custName 
     */
    public Customer(String custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    
}
