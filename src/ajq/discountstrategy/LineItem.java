/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 *
 * @author Andrew Quimby
 */
public class LineItem {
    private Product product;
    private String[] lineItem;
    private int qty;
    private String prodId;
    private String custName;
    private String custId;
    private double discountAmt;
    private String prodName;
    private double unitCost;

    public String[] getLineItem() {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(prodId);
        prodName = product.getProdName();
        unitCost = product.getUnitCost();
        discountAmt = product.getDiscountAmt(qty);
                
        
        return lineItem;
    }
    
    public static void main(String[] args) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct("A101");
        System.out.println(product.getUnitCost());
    }
}
