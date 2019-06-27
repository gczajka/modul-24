package com.kodilla.good.patterns.food2door;

public class HealthyShopPurchaseService implements PurchaseService {
    @Override
    public boolean process(OrderRequest request) {
        System.out.println("Purchase from HealthyShop has been completed");
        return true;
    }
}
