package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        String supplier;
        Random gen = new Random();
        int a = gen.nextInt(3);
        if(a==0) {
            supplier = "ExtraFoodShop";
        } else if(a==1) {
            supplier = "HealthyShop";
        } else {
            supplier = "GlutenFreeShop";
        }
        return new OrderRequest(supplier,"something", 3);
    }
}
