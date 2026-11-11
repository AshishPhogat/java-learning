package com.ashish.lld.strategy;

public class UpiPayment implements PaymentStrategy {
    @Override 
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using UPI");
    }

    @Override
    public Double computeFee(Double amount) {
        System.out.println("Computing fee for UPI payment of " + amount);
        return 0.0;
    }
}
