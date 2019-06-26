package com.kodilla.good.patterns.challenges;

public class PriorityOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product, int quantity, double price, double totalCost) {
        System.out.println("Priority order recorded successfully");
    }
}
