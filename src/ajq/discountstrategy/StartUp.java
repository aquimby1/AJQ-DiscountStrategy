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
        
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custId);
        cr.addItemToSale("A101",1);
        cr.addItemToSale("B205",3);
        cr.addItemToSale("C222",2);
        cr.finilizeSale();
    }
}
