package com.ashish.lld.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override 
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }

    @Override
    public Double computeFee(Double amount) {
        System.out.println("Computing fee for Credit Card payment of " + amount);
        return 0.05 * amount;
    }
    
}
