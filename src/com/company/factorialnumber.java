package com.company;

import java.util.Scanner;

public class factorialnumber {
    public static void main(String[] args) {
        //Scanner SC =new Scanner(System.in);
        //System.out.println("enter a number");
        //int n=SC.nextInt();
        int n=20;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
