package com.example.iniyai.eventsusc;

/**
 * Created by iniyai on 29/10/16.
 */
public class Event {
    private String name;
    private String location;
    private String date;
    public Event Next;

    public Event(){
        Next = null;
        this.name = "";
        this.location = "";
        this.date = "";
    }
    public Event(String newName, String location, String date) {
        this.name = newName;
        this.location = location;
        this.date = date;
        this.Next = null;
    }
    public String getName() {
        return this.name;
    }
    public String getLocation() {
        return this.location;
    }
    public String getDate() {
        return this.date;
    }

    public Event getNext() {
        return Next;
    }

    public void setNext(Event n) {
        this.Next = n;
    }

}
