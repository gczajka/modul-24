package com.kodilla.good.patterns.challenges;

public class PurchaseRequest {
    private User user;
    private Product product;
    private int quantity;
    private double price;
    private double totalCost;

    public PurchaseRequest(User user, Product product, int quantity, double price) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = quantity * price;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
