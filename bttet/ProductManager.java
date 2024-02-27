/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nhvd2
 */
public class ProductManager {
    List<Product> products = new ArrayList<>();

    public void createProduct(Long id, String name, Double price, Integer quantity, Category category) {
        Product product = new Product(id, name, price, quantity, category);
        products.add(product);
        System.out.println("Product created successfully.");
    }

    public void editProduct(Long id, String name, Double price, Integer quantity, Category category) {
        for (Product product : products) {
            if (product.id.equals(id)) {
                product.name = name;
                product.price = price;
                product.quantity = quantity;
                product.category = category;
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(Long id) {
        for (Product product : products) {
            if (product.id.equals(id)) {
                products.remove(product);
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayProductById(Long id) {
        for (Product product : products) {
            if (product.id.equals(id)) {
                System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity + ", Category: " + product.category.name);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity + ", Category: " + product.category.name);
        }
    }

    public void displayProductsByCategory(Category category) {
        for (Product product : products) {
            if (product.category.name.equals(category.name)) {
                System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity);
            }
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.price * product.quantity;
        }
        return totalPrice;
    }

    public void displayProductsPriceGreaterThan(double amount) {
        for (Product product : products) {
            if (product.price > amount) {
                System.out.println("Product: " + product.name + ", Price: " + product.price);
            }
        }
    }

    public void displayElectronicsProductsPriceGreaterThan(double amount) {
        for (Product product : products) {
            if (product.price > amount && product.category.name.equals("Điện tử")) {
                System.out.println("Product: " + product.name + ", Price: " + product.price);
            }
        }
    }
}
