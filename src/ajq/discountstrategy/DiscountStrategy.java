/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
public interface DiscountStrategy {
    public abstract double getDiscountAmt(double unitCost, int qty);
    
    public abstract double getDiscountRate();
            
    public abstract void setDiscountRate(double discountRate);
}
