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

    public Receipt(String custId) {        
        lineItems = new LineItem[0];
        lookUpCustomer(custId);
    }


    public void lookUpCustomer(String custId) {
        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer(custId);
        
    }

    
    public void addItemToSale(String prodId, int qty) {
        LineItem item = new LineItem(prodId,qty);
        addToArray(item);
    }
    
     private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    public void outPutRecipt(){
        System.out.println("Customer Info \nName: " + customer.getCustName() +"\nCustomer ID:"+ customer.getCustId()+"\n");
        System.out.println("Product ID \t Item Name \t Quantity \t Unit Price \t Line Total");
        System.out.println("---------------------------------------------------------------------------");
        for(int i = 0; i < lineItems.length; i++){
            System.out.println(lineItems[i].getProduct().getProdId()+"\t"+lineItems[i].getProduct().getProdName()+"\t"+lineItems[i].getQty()
                    +"\t"+lineItems[i].getProduct().getUnitCost());
            
            
            
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Receipt entry = new Receipt("100");
        entry.addItemToSale("A101", 2);
        System.out.println(entry.getLineItems()[0].getProduct().getProdName());
    }
    
}
