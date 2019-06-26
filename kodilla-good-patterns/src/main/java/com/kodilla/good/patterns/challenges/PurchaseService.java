package com.kodilla.good.patterns.challenges;

public interface PurchaseService {
    boolean purchase(User user, Product product, int quantity, double price, double totalCost);
}
