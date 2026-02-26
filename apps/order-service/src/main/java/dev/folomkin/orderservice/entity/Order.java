package dev.folomkin.orderservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_table")
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "quantity")
    private int quantity;

    public Order() {
    }

    public Order(String orderName, int quantity) {
        this.orderName = orderName;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}