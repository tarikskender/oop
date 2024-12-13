package org.example;

@UserPermission(level = 2)
public class AdminUser extends User{
    public AdminUser(String username){
       super(username);
    }
    @Override
    public void sendMessage(){
        System.out.println("Admin sent a message");
    }
}
