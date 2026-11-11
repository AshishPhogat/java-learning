package com.ashish.lld.strategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(Double amount) {
        Double fee = paymentStrategy.computeFee(amount);
        paymentStrategy.pay(amount+fee);
    }


    public static void main(String[] args){
        
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.pay(100.0);

        paymentService.setPaymentStrategy(new NetBankingPayment());
        paymentService.pay(200.0);

        paymentService.setPaymentStrategy(new UpiPayment());
        paymentService.pay(300.0);
    }
}
