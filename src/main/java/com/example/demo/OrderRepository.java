package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class OrderRepository {
    private Map<String, Order> orders = new HashMap<>();

    public Order save(Order order) {
        String id = UUID.randomUUID().toString();
        order.setId(id);
        orders.put(id, order);
        return order;
    }

    public Order findById(String id) {
        return orders.get(id);
    }

    public Collection<Order> findAll() {
        return orders.values();
    }
}
