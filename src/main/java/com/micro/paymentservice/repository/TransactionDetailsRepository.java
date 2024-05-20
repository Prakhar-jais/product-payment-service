package com.micro.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.paymentservice.entity.TransactionDetails;


@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Long> {
    
}
