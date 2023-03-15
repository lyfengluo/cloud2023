package com.lynne.springcloud.service;

import com.lynne.springcloud.entities.Payment;

public interface PaymentService {
    public int save(Payment payment);

    public Payment getPaymentById(Long id);
}
