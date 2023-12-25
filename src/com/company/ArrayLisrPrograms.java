package com.company;

import java.util.*;

public class ArrayLisrPrograms {
    public static void main(String[] args)
    {
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("dhana");
        l1.add("sudha");
        System.out.println(l1);
        ArrayList<String> l2=new ArrayList<String>();
        l2.add("aruna");
        l2.add("mani");
//1.....addAll
        l1.addAll(l2);
        System.out.println(l1);
        for(String s:l1)
        {
            System.out.println(s);
        }
        for(int i=0;i<l1.size();i++ )
        {
            System.out.println(l1.get(i));
        }
//2.....addAll(addAll l2 elements to l1 at specific indexs)
        l1.addAll(1,l2);
        System.out.println(l1);//expected [dhana,aruna,mani,sudha]
//3...clear arraylist
        l1.clear();
        System.out.println(l1);
//4...clone arraylist values
        ArrayList<String> clonelist=(ArrayList<String>)l2.clone();
        System.out.println(clonelist);
//5....contains method
        System.out.println(l1.contains("dhana"));
//6....indexmethod and lastindex method
        System.out.println(l1.indexOf("aruna"));
        System.out.println(l1.lastIndexOf("aruna"));
        l1.removeAll(l2);
        System.out.println(l1);
//7....also insert elements in arraylist directly
        ArrayList<String> l3=new ArrayList<String>(Arrays.asList("adi","app","nag","ram"));
        System.out.println(l3);
//8.....remove specific and all elements in arraylist
        l3.remove(1);
        l3.remove("adi");
        System.out.println(l3);
//9....removeif method
        ArrayList<Integer> l4=new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7,8,9));
        l4.removeIf(n->n%2==0);
        System.out.println(l4);
//10...retain method(will get same string names within arraylist)
        ArrayList<String> l5=new ArrayList<String>(Arrays.asList("dhana","adi","app","nag","ram","adi","app"));
        l5.retainAll(Collections.singleton("app"));
        System.out.println(l5);
//11.....sublist from arraylist
        ArrayList<String> sublist=new ArrayList<String>(l5.subList(1,4));
        System.out.println(sublist);
//12.....setmethod(replace one value with another)
        l5.set(1,"dha");
        System.out.println(l5);
//convert arraylist to array
        ArrayList<Integer> l6=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        Object[] arr=l6.toArray();
        for(Object a:arr)
        {
            System.out.println(a);
        }
        System.out.println(Arrays.toString(arr));
//convert array to arraylist
        int[] a={1,2,3,4,5};
        List a1 =Arrays.asList(a);
        System.out.println(a1);
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);

        System.out.println(al);

//ask sudha about tostring
        ArrayList  a4=new ArrayList(Arrays.asList(10,23,45,67));
        System.out.println(a4);
        System.out.println(a.toString());










    }
}
