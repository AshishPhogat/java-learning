package com.ashish.lld.strategy;

public class NetBankingPayment implements PaymentStrategy {
    @Override 
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using Net Banking");
    }

    @Override
    public Double computeFee(Double amount) {
        System.out.println("Computing fee for Net Banking payment of " + amount);
        return 0.02*amount;
    }
}
