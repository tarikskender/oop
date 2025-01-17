package org.example;

public class CounterThread extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 5; i ++){
            System.out.println("Count: "+ i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread interception: "+e.getMessage());
            }
        }
    }
}

