package org.example;

@UserPermission()
public class RegularUser extends User{
    public RegularUser(String username){
        super(username);
    }
    @Override
    public void sendMessage() {
        System.out.println("Regular user sent a message");
    }
}
