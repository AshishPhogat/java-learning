package com.ashish.lld.abstractfactory;

public class AddidasFactory implements ShoeFactory {
    @Override 
    public AddidasSportsShoe createSportsShoe(){
        return new AddidasSportsShoe();
    }

    @Override 
    public AddidasCasualShoe createCasualShoe(){
        return new AddidasCasualShoe();
    }
}
