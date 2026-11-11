package com.ashish.lld.abstractfactory;

public class NikeFactory implements ShoeFactory {
    @Override 
    public NikeSportsShoe createSportsShoe(){
        return new NikeSportsShoe();
    }

    @Override 
    public NikeCasualShoe createCasualShoe(){
        return new NikeCasualShoe();
    }
}
