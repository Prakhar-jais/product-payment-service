package com.micro.paymentservice.service;

import com.micro.paymentservice.model.PaymentRequest;
import com.micro.paymentservice.model.PaymentResponse;

public interface PaymentService  {

    Long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
    
}
