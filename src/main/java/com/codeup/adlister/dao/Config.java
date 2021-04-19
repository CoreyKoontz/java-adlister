package com.codeup.adlister.dao;

class Config {

    public static String getUrl(){
        return "jdbc:mysql://localhost/ad_listener_db?serverTimezone=UTC&useSSL=false";
    }

    public static String getUsername(){
    return "root";
    }

    public static String getPassword(){
    return "codeup";
    }



}
