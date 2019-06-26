package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final PurchaseService purchaseService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDto process(final PurchaseRequest purchaseRequest) {
        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProduct(),
                purchaseRequest.getQuantity(), purchaseRequest.getPrice(), purchaseRequest.getTotalCost());

        if(isPurchased) {
            informationService.inform(purchaseRequest.getUser());
            orderRepository.createOrder(purchaseRequest.getUser(), purchaseRequest.getProduct(),
                    purchaseRequest.getQuantity(), purchaseRequest.getPrice(), purchaseRequest.getTotalCost());
            return new ProductOrderDto(purchaseRequest.getUser(), true);
        } else {
            return new ProductOrderDto(purchaseRequest.getUser(), false);
        }
    }
}
