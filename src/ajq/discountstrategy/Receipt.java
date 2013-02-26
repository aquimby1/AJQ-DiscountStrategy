/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
class Receipt {
    private Customer customer;
    private LineItem[] lineItems;
    private String custName;
    private String cusId;
    

    public void lookUpCustomer(String custId) {
        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer("100");
        custName = customer.getCustName(); 
    }

    
    public void addItemToSale(String prodId, int qty) {
        LineItem item = new LineItem();
        addToArray(item);
    }
    
     private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    public static void main(String[] args) {
        Receipt entry = new Receipt();
        entry.addItemToSale("100", 2);
        System.out.println(entry.getLineItems()[0]);
    }
}
