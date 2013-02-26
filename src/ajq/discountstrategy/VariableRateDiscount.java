/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
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

