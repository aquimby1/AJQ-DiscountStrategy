/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is the discount interface for the structuring of the discounts
 * @author Andrew Quimby
 * @version 1.00
 */
public interface DiscountStrategy {
    public abstract double getDiscountAmt(double unitCost, int qty);
    
    public abstract double getDiscountRate();
            
    public abstract void setDiscountRate(double discountRate);
}
