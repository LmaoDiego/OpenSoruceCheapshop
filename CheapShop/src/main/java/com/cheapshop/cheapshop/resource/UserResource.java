package com.cheapshop.cheapshop.resource;

import com.cheapshop.cheapshop.domain.model.AuditModel;

public class UserResource extends AuditModel {
    private Long id;
    private String email;
    private String name;

    public Long getId() {
        return id;
    }

    public UserResource setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResource setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserResource setName(String name) {
        this.name = name;
        return this;
    }

}
