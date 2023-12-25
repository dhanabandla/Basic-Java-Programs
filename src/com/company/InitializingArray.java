package com.company;

public class InitializingArray {
    public static void main(String[] args) {


//different ways to initialize an array and printing
        int a[]={1,2,3,4};
        for(Object l3:a)
        {
            System.out.println(l3);


        }
        int a1[]=new int[4];
        for(Object l1:a1)
        {
            System.out.println(l1);


        }
        int a2[]=new int[]{1,2,3,4};
        for(int i=0;i<a2.length;i++)
        {
            System.out.println(a2[i]);
        }

}
    }
