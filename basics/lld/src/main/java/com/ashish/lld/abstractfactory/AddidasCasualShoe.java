package com.ashish.lld.abstractfactory;

public class AddidasCasualShoe implements Shoe{
    @Override 
    public void wear() {
        System.out.println("Wearing Addidas Casual Shoe");
    }

    @Override 
    public void remove() {
        System.out.println("Removing Addidas Casual Shoe");
    }
}
