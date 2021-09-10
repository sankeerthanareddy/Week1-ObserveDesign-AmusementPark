package com.java.AmusementPark;

public class ListenerTwo implements Observer 
{
    @Override
    public void update(Message msg)
    {
        System.out.println(msg.printText());
    }
}