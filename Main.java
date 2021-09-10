package com.java.AmusementPark;

public class Main 
{
    public static void main(String[] args) 
    {
        ListenerOne lst1 = new ListenerOne();
        ListenerTwo lst2 = new ListenerTwo();
        Podcaster pd = new Podcaster();

        pd.attach(lst1);
        pd.updateListeners(new Message("Hey first listeners!"));
        pd.detach(lst1);
        pd.attach(lst2);
        pd.updateListeners(new Message("Hey second listeners!"));
    }
}