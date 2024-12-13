package org.example;
import java.util.HashMap;
import java.util.Date;

class TableReservation<T extends MenuItem & Billable>{

    public String reservationId;
    Date reservationDate;
    HashMap<T, Integer> orderedItems = new HashMap<>();
    int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber){
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.tableNumber = tableNumber;
    }


    public void addItemToOrder(T item, int quantity){
        orderedItems.put(item, quantity);
    }

    public double calculateTotalAmount(){
        return 2.34;
    }

    public String getReservationId(){
        return reservationId;
    }

    public void setReservationId(String reservationId){
        this.reservationId = reservationId;
    }

    public Date getReservationDate(){
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate){
        this.reservationDate = reservationDate;
    }

}