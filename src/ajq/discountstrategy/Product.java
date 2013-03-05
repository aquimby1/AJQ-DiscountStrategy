/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is where the product properties are stored
 * @author Andrew Quimby
 * @version 1.00
 */
public class Product {
    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;

    /**
     * This populates the product properties
     * @param prodId
     * @param prodName
     * @param unitCost
     * @param discount 
     */
    public Product(String prodId, String prodName, double unitCost, DiscountStrategy discount) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }

       
    public double getDiscountAmt(int qty) {
        return discount.getDiscountAmt(unitCost, qty);
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
}
