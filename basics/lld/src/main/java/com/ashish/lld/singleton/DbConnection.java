package com.ashish.lld.singleton;

public class DbConnection {

    private static DbConnection instance = new DbConnection();
    private static boolean isInitialized = false;
    
    // use private constructor
    private DbConnection() {
        if(isInitialized) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        isInitialized = true;   
    }

    public static void main(String[] args) {
        DbConnection dbConnection = DbConnection.getInstance();
        System.out.println(dbConnection);
    }

    public static DbConnection getInstance() {
        return instance;
    }
}
