package dev.folomkin.orderservice.controller;

import dev.folomkin.orderservice.entity.Order;
import dev.folomkin.orderservice.entity.OrderDto;
import dev.folomkin.orderservice.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/test-conn")
    public String checkConnection() {
        return "Test connection by Order Service successful!";
    }

    @PostMapping("/create")
    public ResponseEntity<Order> create(@RequestBody OrderDto dto) {
        return ResponseEntity.ok(orderService.create(dto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Order>> getAll(){
        return ResponseEntity.ok(orderService.findAll());
    }
}

