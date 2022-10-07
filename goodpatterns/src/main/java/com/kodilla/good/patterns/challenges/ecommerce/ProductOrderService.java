package com.kodilla.good.patterns.challenges.ecommerce;

public class ProductOrderService {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrderExecuted = orderService.order(orderRequest.getUser(), orderRequest.getOrder(),
                orderRequest.getOrderDate());

        if (isOrderExecuted) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getOrderDate());
            orderRepository.addCompletedOrderToRepository(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}