package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {

   private InformationService informationService;
   private OrderService orderService;
   private OrderRepository orderRepository;

   public OrderProcessor(final InformationService informationService,
                         final OrderService orderService,
                         final OrderRepository orderRepository) {
      this.informationService = informationService;
      this.orderService = orderService;
      this.orderRepository = orderRepository;
   }

   public OrderDto process(final Order order) {
      boolean isSold = orderService.sell(order.getUser(), order.getItem(),
         order.getQuantity());

      if (isSold) {
         informationService.inform(order.getUser());
         orderRepository.createOrder(order.getUser(), order.getItem(), order.getQuantity());
         return new OrderDto(order.getUser(), true);
      } else {
         return new OrderDto(order.getUser(), false);
      }
   }
}
