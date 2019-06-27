package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest request = retriever.retrieve();
        SupplierSorter sorter = new SupplierSorter();
        PurchaseService service = sorter.supplyPurchaseService(request);
        PurchaseProcessor processor = new PurchaseProcessor(service);
        processor.process(request);
    }
}
