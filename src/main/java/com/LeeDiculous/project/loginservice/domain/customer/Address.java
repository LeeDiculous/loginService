package com.LeeDiculous.project.loginservice.domain.customer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Address {

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADDRESS_INFO")
    private String addressInfo;
}
