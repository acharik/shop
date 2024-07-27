package com.shop.order.entity;


import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class AbstractBaseEntity {

    @CreationTimestamp
    private LocalDateTime createdOn;

    @CreatedBy
    private String createdBy;

    @UpdateTimestamp
    private LocalDateTime lastModifiedOn;

    @LastModifiedBy
    private String lastModifiedBy;
}
