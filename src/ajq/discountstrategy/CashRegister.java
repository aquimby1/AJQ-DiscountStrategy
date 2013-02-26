/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
public class CashRegister {
    private Receipt receipt;
    
    public void startNewSale(String custId) {
        receipt = new Receipt(custId);
    }

    public void addItemToSale(String prodId,int qty) {
        receipt.addItemToSale(prodId,qty) ;
    }

    public void finilizeSale() {
        receipt.outPutRecipt();
    }
    
}
