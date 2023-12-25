package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        int s1=sc.nextInt();
//find given year is leap year or not
        /*int n = 1200;

        if (n % 4 == 0 && n % 400 == 0) {
            System.out.println("year is leap year");
        } else
            System.out.println("not a leap year");*/

        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter any number");
        int n=SC.nextInt();

        if (n%100==0 && n%400==0 || n%100!=0 && n%4==0) {
            System.out.println("year is leap year");
        } else
            System.out.println("not a leap year");*/

 //find year is leap or not in given set of years

       /*int[] array=new int[4];//int[] array={1900,400,1100,4};
       array[0]=1900;
       array[1]=400;
       array[2]=1100;
       array[3]=4;
       for(int i=0;i<array.length;i++)
       {
           if (array[i] % 4 == 0 && array[i]% 400 == 0) {
               System.out.println("year is leap year");
           } else
               System.out.println("not a leap year");
       }*/



    }
}


