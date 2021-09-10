package com.java.AmusementPark;

import java.util.ArrayList;
import java.util.List;
 
public class Podcaster implements Subject {
     
    private List<Observer> obv = new ArrayList<>();
 
    @Override
    public void attach(Observer o)
    {
        obv.add(o);
    }
 
    @Override
    public void detach(Observer o)
    {
        obv.remove(o);
    }
 
    @Override
    public void updateListeners(Message msg)
    {
        for(Observer o: obv)
        {
            o.update(msg);
        }
    }
}