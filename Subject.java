package com.java.AmusementPark;

public interface Subject 
{
    public void attach(Observer obv);
    public void detach(Observer obv);
    public void updateListeners(Message msg);
}