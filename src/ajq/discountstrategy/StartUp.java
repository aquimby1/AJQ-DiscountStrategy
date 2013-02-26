/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custId = "100";
        String prodId = "A101";
        int qty = 2;
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custId);
        cr.addItemToSale(prodId,qty);
        cr.addItemToSale("b235",1);
        cr.finilizeSale();
    }
}
