package com.company;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();
        h.put(1,"dhana");
        h.put(2,"sudha");
        h.put(3,"aruna");
        System.out.println(h);
        h.remove(1);
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.get(3));




    }
}
