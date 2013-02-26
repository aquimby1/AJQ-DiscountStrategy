/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
public class Product {
    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;

    
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
    public static void main(String[] args) {
        Product shirt = new Product("blah","blah",20,new VariableRateDiscount(.30));        
        double out = shirt.getDiscountAmt(5);
        System.out.println("amt:" + out);
}
}
