package com.LeeDiculous.project.loginservice.domain.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "CUSTOMER")
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Embedded
    private Login login;

    private String name;

    @Column(name = "USERNAME")
    private String userName;

    private String email;

    @Embedded
    private Address address;

}
