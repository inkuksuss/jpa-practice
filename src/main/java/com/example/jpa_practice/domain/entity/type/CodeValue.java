package com.example.jpa_practice.domain.entity.type;

public enum CodeValue {

    MEMBER("MEMBER"),
    ADMIN("ADMIN");

    private final String code;

    CodeValue(String code) {
        this.code = code;
    }
}
