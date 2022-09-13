package shop.model.service;

import shop.model.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> findAll();

    void add(OrderItem newOrderItem);

    void update(OrderItem newOrderItem);

    OrderItem getOrderItemById(int id);

}
