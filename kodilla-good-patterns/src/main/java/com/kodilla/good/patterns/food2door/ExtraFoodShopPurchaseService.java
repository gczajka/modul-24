package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopPurchaseService implements PurchaseService {
    @Override
    public boolean process(OrderRequest request) {
        System.out.println("Purchase from ExtraFoodShop has been completed");
        return true;
    }
}
