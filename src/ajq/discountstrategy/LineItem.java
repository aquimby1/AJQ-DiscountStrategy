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
    private int qty;

    public LineItem(String prodId,int qty) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(prodId);
        this.product = product;
        this.qty = qty;
    }
       
    public static void main(String[] args) {
        LineItem enty = new LineItem("A101",1);
        System.out.println(enty.product.getDiscountAmt(enty.qty));
    }
}
