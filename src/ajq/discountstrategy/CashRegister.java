/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is where the handling of new items and the output used
 * @author Andrew Quimby
 * @version 1.00
 */
public class CashRegister {
    private Receipt receipt;
    
    /**
     * This creates a new receipt with no items
     * @param custId 
     */
    public void startNewSale(String custId) {
        receipt = new Receipt(custId);
    }
    /**
     * Takes product information and adds it to receipt
     * @param prodId
     * @param qty 
     */
    public void addItemToSale(String prodId,int qty) {
        receipt.addItemToSale(prodId,qty) ;
    }
    /**
     * This calls the final building and output for the receipt
     */
    public void finilizeSale() {
        System.out.println(receipt.outPutReceipt());
        
        
    }
    
}
