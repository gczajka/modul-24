package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve() {
        User user = new User("Piotr", "Kowalski", "adress");
        Product product = new Pendrive();
        int quantity = 3;
        double price = 2.5;
        return new PurchaseRequest(user, product, quantity, price);
    }
}
