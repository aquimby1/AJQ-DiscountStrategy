/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is the discount strategy use if there is no discount
 * @author Andrew Quimby
 * @version 1.00
 */
public class NoDiscount implements DiscountStrategy {

    public NoDiscount() {
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        return 0;
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        
    }
    
}
