package com.micro.paymentservice.service;

import com.micro.paymentservice.model.PaymentRequest;

public interface PaymentService  {

    Long doPayment(PaymentRequest paymentRequest);
    
}
