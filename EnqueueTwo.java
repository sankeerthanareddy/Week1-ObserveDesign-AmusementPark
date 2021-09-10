package com.java.AmusementPark;

public class EnqueueTwo implements Observer 
{
    @Override
    public void update(Message msg)
    {
        System.out.println(msg.printText());
    }
}