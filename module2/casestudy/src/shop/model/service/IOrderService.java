package shop.model.service;

import shop.model.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();

    void add(Order newOrder);

    void update();

    Order findById(long id);

    List<Order> findByUserId(long id);

    boolean existById(long id);
}
