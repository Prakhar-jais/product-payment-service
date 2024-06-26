package com.micro.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.paymentservice.model.PaymentRequest;
import com.micro.paymentservice.model.PaymentResponse;
import com.micro.paymentservice.service.PaymentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/payment")
public class PaymentController {
    

    @Autowired
    private PaymentService paymentService ;


    @PostMapping("/")  
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest){
        return new ResponseEntity<>(paymentService.doPayment(paymentRequest),HttpStatus.OK);
    }


    @GetMapping("/order/{orderId}")
    public ResponseEntity<PaymentResponse> getPaymentDetailsByOrderId(@PathVariable String orderId){

        return new ResponseEntity<>(
            paymentService.getPaymentDetailsByOrderId(orderId),
            HttpStatus.OK
        ) ;
    }
}
