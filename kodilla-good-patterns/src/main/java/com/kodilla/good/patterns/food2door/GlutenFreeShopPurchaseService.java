package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopPurchaseService implements PurchaseService {
    @Override
    public boolean process(OrderRequest request) {
        System.out.println("Purchase from GlutenFreeShop has been completed");
        return true;
    }
}
