package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        PurchaseRequestRetriever retriever = new PurchaseRequestRetriever();
        PurchaseRequest request = retriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(), new ElectronicsPurchaseService(), new PriorityOrderRepository());
        productOrderService.process(request);
    }
}
