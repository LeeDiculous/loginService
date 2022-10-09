package com.LeeDiculous.project.loginservice.domain.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT c FROM Customer c WHERE c.login.loginId = :loginId AND c.login.loginPassword = :loginPassword")
    Customer findByLogin(@Param("loginId") String loginId, @Param("loginPassword") String loginPassword);
}
