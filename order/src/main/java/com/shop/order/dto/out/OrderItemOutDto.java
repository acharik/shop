package com.shop.order.dto.out;

import java.math.BigDecimal;

public record OrderItemOutDto (
        Long id,
        Long productId,
        String productName,
        Integer quantity,
        BigDecimal productPrice,
        String note,
        BigDecimal discountAmount,
        BigDecimal taxAmount,
        BigDecimal taxPercent,
        Long orderId
){
}
