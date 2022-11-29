package com.example;

public class Login {
    private String user;
    private String pasword;

    private void verificacion(String user, String pasword)throws Exception{
        if(user.equals("") || pasword.equals("")){
            throw new Exception("vacio xd");
        }
    }

    public String getUser(){
        return user;

    }
    public String getPassword(){
        return pasword;
    }
    
}