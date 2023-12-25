package com.company;

import java.util.*;

public class LengthOfGroupedStrings {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> hm=new HashMap();
        ArrayList<String> ss=new ArrayList<>(Arrays.asList("dhana","lakshmi","bandla","Apparao"));
        for(String ss1:ss)
        {
           Integer Slength=ss1.length();
           if(!hm.containsKey(Slength))
           {

               hm.put(Slength,new ArrayList<>());

           }

               hm.get(Slength).add(ss1);

        }
        for(Map.Entry<Integer, List<String>> entry:hm.entrySet())
        {
            System.out.print("Length "+entry.getKey()+" : ");
           List<String> groupLength= entry.getValue();
            System.out.println(groupLength);

        }


    }






}
