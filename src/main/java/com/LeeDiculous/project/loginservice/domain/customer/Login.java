package com.LeeDiculous.project.loginservice.domain.customer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Login {

    @Column(name = "LOGIN_ID", unique = true, nullable = false)
    private String loginId;

    @Column(name = "LOGIN_PASSWORD", nullable = false)
    private String loginPassword;
}
