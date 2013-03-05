/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is the discount used if there is a certain percentage off an item
 * @author Andrew Quimby
 * @version 1.00
 */
public class VariableRateDiscount implements DiscountStrategy{
    private double discountRate = .15;
    
    public VariableRateDiscount(double rate){
        discountRate = rate;
        
    }
    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        return unitCost* qty * discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}

