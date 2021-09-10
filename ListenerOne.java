package com.java.AmusementPark;

public class ListenerOne implements Observer 
{
    @Override
    public void update(Message msg) 
    {
        System.out.println(msg.printText());
    }
}