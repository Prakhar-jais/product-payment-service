package com.micro.paymentservice.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.paymentservice.entity.TransactionDetails;
import com.micro.paymentservice.model.PaymentRequest;
import com.micro.paymentservice.repository.TransactionDetailsRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private TransactionDetailsRepository transactionDetailsRepository ;

    @Override
    public Long doPayment(PaymentRequest paymentRequest) {
        // TODO Auto-generated method stub

        log.info("Recording Payment Details :{}",paymentRequest);

       
        TransactionDetails transactionDetails = TransactionDetails.builder()
        .paymentDate(Instant.now())
        .paymentMode(paymentRequest.getPaymentMode().name())
        .paymentStatus("SUCCESS")
        .orderId(paymentRequest.getOrderId())
        .referenceNumber(paymentRequest.getReferenceNumber())
        .amount(paymentRequest.getAmount())
        .build() ;
        
        
        
        transactionDetailsRepository.save(transactionDetails);
        log.info("Transaction Completed with Id :{}",transactionDetails.getId());
        return transactionDetails.getId();
      
    }
    
}
