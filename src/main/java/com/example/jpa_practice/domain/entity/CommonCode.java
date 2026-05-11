package com.example.jpa_practice.domain.entity;

import com.example.jpa_practice.domain.entity.base.BaseEntity;
import com.example.jpa_practice.domain.entity.type.CodeType;
import jakarta.persistence.*;

@Entity(name = "common_code")
public class CommonCode extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "common_code_id")
    private Long id;

    @Column(nullable = false)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private CodeType type;
}
