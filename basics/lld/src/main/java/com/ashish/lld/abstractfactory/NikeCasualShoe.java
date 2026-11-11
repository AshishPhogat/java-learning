package com.ashish.lld.abstractfactory;

public class NikeCasualShoe implements Shoe{

    @Override 
    public void wear(){
        System.out.println("Wearing Nike Casual Shoe");
    }

    @Override 
    public void remove(){
        System.out.println("Removing Nike Casual Shoe");
    }
}


