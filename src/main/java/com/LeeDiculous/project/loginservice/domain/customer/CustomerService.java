package com.LeeDiculous.project.loginservice.domain.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private final CustomerRepo customerRepo;

    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer getCustomer(Long customerId) {
        return customerRepo.findById(customerId).orElseThrow(()-> new NoSuchElementException("Customer not found"));
    }

    public void deleteCustomer(Customer customer) {
        customerRepo.delete(customer);
    }

    public Customer login(String loginId, String loginPassword) {
        return customerRepo.findByLogin(loginId, loginPassword);
    }
}
