package com.company;

import java.util.Scanner;

public class numberprograms {
    public static void main(String[] args) {
        //reverse of words
       /* String str="My Name is Dhana";
        String[] a=str.split(" ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ") ;
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }*/

        //check given number is even or odd
        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter a number");
        int n=SC.nextInt();
        int result=(n/2)*2;
        if(result==n)
        {
            System.out.println("number is even");
        }
        else
            System.out.println("number is odd");*/

        //swap two numbers using temp value
        /*int a=5;
        int b=7;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+ " " +b);*/

        //some of first 10 natural  numbers
        /*int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);*/

        //find given charecter is alphabet or not
        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter a charecter");
        char ch=SC.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
        {
            System.out.println("given charecter is alphabet");
        }
        else
            System.out.println("not an alphabet");*/

        //factors of given number
        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter a number");
        int n=SC.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i+" ");
        }*/

        //factors from 1 to 100
        /*for(int i=1;i<=100;i++)
        {
            System.out.print("factors of a number " +i+ " are :");
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    System.out.print(" " +j+ " ");
                }

            }
            System.out.println();
        }*/
        //swap two number without using third varoable in java
        /*int a=1;
        int b=3;
        a=a+b;//a=a^b
        b=a-b;//b=a^b
        a=a-b;//a=a^b
        System.out.println("after swapping:"+a+"and"+b+);*/
        //Note : can swap the numbers or strings using xor operator in java as above










    }

}
