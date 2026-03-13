/*
 * Author  : Tamilarasu K
 * Program : Shopping Cart System
 * Description : Manages products in a cart, allows add/remove, and calculates total price
 */

package Handson4;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private int price;
    private int quantity;

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public int calculateTotal() {
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

public class CartSystem {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully!");
    }

    public void removeProduct(int id) {
        boolean removed = false;
        for (Product p : products) {
            if (p.getProductId() == id) {
                products.remove(p);
                System.out.println("Successfully removed product with ID: " + id);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void calculateTotal() {
        int total = 0;
        for (Product p : products) {
            total += p.calculateTotal();
        }
        System.out.println("\nTotal cart price: " + total);
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            for (Product p : products) {
                p.getProductDetails();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        CartSystem cart = new CartSystem();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanf.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanf.nextInt();
                    scanf.nextLine(); // consume newline
                    System.out.print("Enter Product Name: ");
                    String name = scanf.nextLine();
                    System.out.print("Enter Product Price: ");
                    int price = scanf.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = scanf.nextInt();

                    Product p = new Product(id, name, price, qty);
                    cart.addProduct(p);
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = scanf.nextInt();
                    cart.removeProduct(removeId);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.calculateTotal();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}