package com.example.iniyai.eventsusc;

/**
 * Created by iniyai on 30/10/16.
 */
public final class List {
    static Event head = null;
    static int count = 0;

    public static void add(String newData, String newLoc, String newDate) {
        Event temp = new Event(newData, newLoc, newDate);
        Event current = head;
        if (current == null) {
            head = temp;
            count++;
        }
        else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
            count++;
        }
    }


    public static boolean isEmpty() {
        if(head == null) {
            return true;
        }
        else
            return false;
    }

    public static String[] getNames() {
        String[] s = new String[count];
        Event e = head;
        for(int i = 0; i < count; i++) {
            s[i] = e.getName();
            e = e.getNext();
        }
        return s;
    }

    public static Event getEvent(String Name) {
        Event e = head;
        for (int i = 0; i < count; i++){
            if(e.getName() == Name) {
                return e;
            }
            else if(e.getNext() == null){
                return e;
            }
            else {
                e = e.getNext();
            }

        }
        return e;
    }

    public void remove() {
        Event current = head;
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        count --;
    }

}
