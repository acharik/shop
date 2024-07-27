package com.shop.order.dto.out;

import com.shop.order.entity.enumeration.DeliveryMethod;
import com.shop.order.entity.enumeration.DeliveryStatus;
import com.shop.order.entity.enumeration.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderOutDto(
        Long id,
        OrderStatus orderStatus,
        BigDecimal totalPrice,
        DeliveryStatus deliveryStatus,//enum
        DeliveryMethod deliveryMethod,//enum
        List<OrderItemOutDto> orderItems,

        LocalDateTime createdOn
) {
}
