package com.ashish.lld.singleton;

public class BillPughSingleton {
    
    private BillPughSingleton(){}

    private static class SingletonHolder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private static BillPughSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton dbConnection = BillPughSingleton.getInstance();
        System.out.println(dbConnection);
    }
}
