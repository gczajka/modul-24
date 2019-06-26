package com.kodilla.good.patterns.challenges;

public class ElectronicsPurchaseService implements PurchaseService {
    @Override
    public boolean purchase(User user, Product product, int quantity, double price, double totalCost) {
        System.out.println("User:" + user.getName() + " " + user.getSurname() + " made a successful purchase");
        return true;
    }
}
