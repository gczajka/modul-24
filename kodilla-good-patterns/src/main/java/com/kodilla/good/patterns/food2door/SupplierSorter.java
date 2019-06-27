package com.kodilla.good.patterns.food2door;

public class SupplierSorter {

    public PurchaseService supplyPurchaseService(OrderRequest request) {
        if (request.getSupplier() == "ExtraFoodShop") {
            return new ExtraFoodShopPurchaseService();
        } else if (request.getSupplier() == "HealthyShop") {
            return new HealthyShopPurchaseService();
        } else {
            return new GlutenFreeShopPurchaseService();
        }
    }
}
