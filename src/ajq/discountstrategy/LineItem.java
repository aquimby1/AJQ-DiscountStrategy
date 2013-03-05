/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajq.discountstrategy;

/**
 * This is where the product information is pulled from the database to populate the product property
 * @author Andrew Quimby
 * @version 1.00
 */
public class LineItem {
    private Product product;
    private int qty;

    /**
     * This looks up the product information and populates the product properties
     * @param prodId
     * @param qty 
     */
    public LineItem(String prodId,int qty) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(prodId);
        this.product = product;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
       
}