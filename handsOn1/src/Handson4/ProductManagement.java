package Handson4;

/*
 * Author  : Tamilarasu K
 * Program : Product Class
 * Description : Represents a product with ID, name, price, quantity, and total cost
 */



public class ProductManagement {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public ProductManagement(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int qty) {
        if (qty > 0) {
            this.quantity = qty;
        }
    }

    public int getProductId() {
        return productId;
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public void getProductDetails() {
        System.out.println("\nProduct Details");
        System.out.println("ID       : " + productId);
        System.out.println("Name     : " + productName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + calculateTotal());
    }
}