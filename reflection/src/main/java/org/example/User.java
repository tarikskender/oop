package org.example;


public abstract class User {

    public String username;

    public User(String username){
        this.username = username;
    }

    public void sendMessage(){
        System.out.println("User sent a message");
    }
}
