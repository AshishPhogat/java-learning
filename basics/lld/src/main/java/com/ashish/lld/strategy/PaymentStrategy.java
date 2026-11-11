package com.ashish.lld.strategy;

public interface PaymentStrategy {
    void pay(Double amount);
    
    Double computeFee(Double amount);
}
