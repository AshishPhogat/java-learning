package com.ashish.lld.abstractfactory;

public class AddidasSportsShoe implements SportsShoe {
    @Override
    public void wear() {
        System.out.println("Wearing Addidas Sports Shoe");
    }

    @Override 
    public void remove(){
        System.out.println("Removing Addidas Sports Shoe");
    }

    @Override 
    public void run(){
        System.out.println("Running with Addidas Sports Shoe");
    }
}
