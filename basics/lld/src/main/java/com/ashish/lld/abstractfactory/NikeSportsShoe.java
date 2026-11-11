package com.ashish.lld.abstractfactory;

public class NikeSportsShoe implements SportsShoe{
    @Override 
    public void wear(){
        System.out.println("Wearing Nike Sports Shoe");
    }

    @Override 
    public void remove(){
        System.out.println("Removing Nike Sports Shoe");
    }

    @Override 
    public void run(){
        System.out.println("Running with Nike Sports Shoe");
    }
}