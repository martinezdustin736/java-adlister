package com.codeup.adlister.dao;

public class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }

    //        getUser() was for the jdbc lecture
    public String getUser() {
        return "dustinmartinez";
    }

    public String getPassword() {
        return "Rachel1@";
    }
}
