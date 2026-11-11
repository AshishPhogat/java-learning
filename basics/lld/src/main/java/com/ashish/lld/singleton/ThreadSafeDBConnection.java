package com.ashish.lld.singleton;

public class ThreadSafeDBConnection {
    private static ThreadSafeDBConnection instance;

    private ThreadSafeDBConnection() {}

    public static synchronized ThreadSafeDBConnection getInstance(){
        if(instance == null){
            instance = new ThreadSafeDBConnection();
        } 

        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeDBConnection dbConnection = ThreadSafeDBConnection.getInstance();
        System.out.println(dbConnection);
    }
}
