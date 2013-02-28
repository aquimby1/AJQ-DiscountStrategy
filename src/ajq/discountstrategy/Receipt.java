/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Andrew Quimby
 */
class Receipt {
    private Customer customer;
    private LineItem[] lineItems;
    private Date receiptDate;
    
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
    /**
     * This method takes all the information and builds a formated string out of it 
     * @return a complete formated output of receipt
     */
    public String outPutReceipt(){
        String output="";
        double discountAmtTotal=0;
        double totalBD=0;
        double totalAD=0;
        receiptDate = new Date();
        Calendar c = Calendar.getInstance();
        
        String format = "M/dd/yyyy h:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);        
        c = Calendar.getInstance();
        receiptDate = c.getTime();        
        String formattedDate = sdf.format(receiptDate);
        
        output+="Welcome to this Store \n"+formattedDate+"\n";
        
        output+=("Customer Info: \nName: " + customer.getCustName() +"\nCustomer ID:"+ customer.getCustId()+"\n\n");
        output+=("Product ID \t Item Name \t\t Quantity \t Unit Price \t Line Total\n");
        for(int j = 0; j <= 84; j++)output+=("-");  

        for(int i = 0; i <= lineItems.length-1; i++){
            output+=("\n"+lineItems[i].getProduct().getProdId()+"\t\t"+lineItems[i].getProduct().getProdName()+"\t\t"+lineItems[i].getQty()
                    +"\t\t"+lineItems[i].getProduct().getUnitCost()+"\t\t"+lineItems[i].getProduct().getUnitCost()*lineItems[i].getQty());    
            discountAmtTotal += lineItems[i].getProduct().getDiscountAmt(lineItems[i].getQty());
            totalBD += lineItems[i].getProduct().getUnitCost()*lineItems[i].getQty();
            
        }
        totalAD += totalBD-discountAmtTotal;
        discountAmtTotal = (double)Math.round((discountAmtTotal*100))/100;
        totalAD = (double)Math.round((totalAD*100))/100;
        totalBD = (double)Math.round((totalBD*100))/100;
        
        output+=("\n\n\t\t\t\t\t\t\t Total Before Discount: "+totalBD+"\n");
        output+=("\t\t\t\t\t\t\t Total Discount: "+discountAmtTotal+"\n");
        output+=("\t\t\t\t\t\t\t Total Due: "+totalAD+"\n");
        
        return output;
    }
    
    
    public static void main(String[] args) {
        Receipt entry = new Receipt("100");
        entry.addItemToSale("A101", 2);
        System.out.println(entry.getLineItems()[0].getProduct().getProdName());
    }
    
}
