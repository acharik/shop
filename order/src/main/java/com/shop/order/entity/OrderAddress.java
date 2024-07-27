package com.shop.order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_address")
public class OrderAddress extends AbstractBaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contactName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zipCode;
    private Long districtId;
    private String districtName;
    private Long stateOrProvinceId;
    private String stateOrProvinceName;
    private Long countryId;
    private String countryName;
}
