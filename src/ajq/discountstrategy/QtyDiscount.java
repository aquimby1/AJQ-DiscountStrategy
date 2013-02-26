/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
public class QtyDiscount implements DiscountStrategy{
    private double discountRate = .15;
    private int minQty = 5;
    
    public QtyDiscount(double rate, int minQty){
        discountRate = rate;
        this.minQty = minQty;
        
    }
    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        if(qty >= minQty){
          return unitCost* qty * discountRate;  
        }
        return 0;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
    
}
