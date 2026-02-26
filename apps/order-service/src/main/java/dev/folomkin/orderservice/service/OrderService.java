package dev.folomkin.orderservice.service;

import dev.folomkin.orderservice.entity.Order;
import dev.folomkin.orderservice.entity.OrderDto;
import dev.folomkin.orderservice.entity.OrderMapper;
import dev.folomkin.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;


    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order create(OrderDto dto) {
        return repository.save(OrderMapper.toEntity(dto));
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

}
