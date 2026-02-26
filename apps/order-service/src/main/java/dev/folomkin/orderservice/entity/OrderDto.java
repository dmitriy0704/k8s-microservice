package dev.folomkin.orderservice.entity;

/**
 * DTO for {@link Order}
 */
public record OrderDto(String orderName, int quantity) {
}