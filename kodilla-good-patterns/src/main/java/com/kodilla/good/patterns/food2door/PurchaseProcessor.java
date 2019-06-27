package com.kodilla.good.patterns.food2door;

public class PurchaseProcessor {
    PurchaseService purchaseService;

    public PurchaseProcessor(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public void process(OrderRequest request) {
        purchaseService.process(request);
    }
}
