package dev.folomkin.orderservice.entity;

public class OrderMapper {

    public static Order toEntity(OrderDto dto){
        return new Order(dto.orderName(), dto.quantity());
    }
}
