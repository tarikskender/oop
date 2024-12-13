package org.example;
import org.example.MenuItem;
import java.util.List;

public class Customer{

    public String customerId;
    public String name;
    public String phoneNumber;


    List<TableReservation<? extends MenuItem>> reservations;

    public Customer(String customerId, String name, String phoneNumber){
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void addReservation(TableReservation<? extends MenuItem> reservation){
        reservations.add(reservation);
    }

    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    public String getCustomerId(){
        return customerId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

}





