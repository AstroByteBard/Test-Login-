package com.example.demo;

public class member {

    String Username;
    String Password;
    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public member(){
    }

    public member(String Username , String Password ){
        this.Username = Username;
        this.Password = Password;
    }
}


