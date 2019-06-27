package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    String supplier;
    String product;
    int quantity;

    public OrderRequest(String supplier, String product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
