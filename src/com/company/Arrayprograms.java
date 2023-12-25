package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayprograms {
    public static void main(String[] args) {
//copying of array into another array
        /*int[] array1=new int[]{1,2,3,4};
        int[] array2=new int[array1.length];
        for(int i=0;i<array1.length;i++)
        {
            array2[i]=array1[i];

        }
        System.out.println("copying 1st array to 2nd array : ");
       for(int a:array2)
       {
           System.out.println(a);
       }*/
        //copying of array into another array
        /*int arr[]={1,2,3};
        int arr1[]={0,0,0};
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
            System.out.println(arr1[i]);
        }*/

//finding duplicate elements in an array
/*
        int[] array = new int[]{1, 2, 3, 4, 5, 1, 2, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }*/


//pring the elements in an array
           /*int a[]={1,2,3,4};
           for(int i=0;i<a.length;i++)
           {
               System.out.println(a[i]);
           }*/

//print the elements of an array in reverse order
        /*int a[]={1,2,3,4};
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }*/

//print even positions in an array
        /*int a[]={5,10,9,10,11,13};
        for(int i=2;i<a.length;i+=2)
        {
            System.out.println("index :"+i);
            System.out.println("value :"+a[i]);
        }*/

//find maximum value in an array

        /*int a[]={5,17,70,10,180,181};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
           if(a[i]>max)
               max = a[i];

        }
        System.out.println(max);*/

//print some of all elements in an array

        /*int a[]={5,17,70,10,180,180};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];

        }
        System.out.println(sum);*/

//print array elements in assending order

        /*int a[]={5,17,70,10,180,180};
        int temp=0;
        for(int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
        }*/
            /*for(int b:a)
            {
                System.out.println(b);


        }*/

//find third largest value in an array

       /* int a[]={5,17,70,10,180,181};
        int n=a.length;
        Arrays.sort(a);
        System.out.println(a[n-3]);
*/
//print even or odd elements in an array

       /* int a[]={5,17,70,10,180,180};
        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }*/

//concatinate two arrays

      /*int[] a={1,2,3,4,5};
      int[] b={6,7,8};
      int length1=a.length;
      int length2=b.length;
      int[] result=new int[length1+length2];
      System.arraycopy(a,0,result,0,length1);
        System.arraycopy(b,0,result,length1,length2);
        System.out.println(Arrays.toString(result));*/

//Average of an array elements

      /*double[] a={1,2,3,4,5,6,7,8,9,1.2};
      double sum=0.0;
      int i=a.length;
        System.out.println(i);
      for(double num:a)
      {
          sum=num+sum;
      }
        System.out.println(sum);
      double average=sum/a.length;
        System.out.println(average);*/

//conversion of charecter array to string-->using two methods we can convert array to string
        //i.using new string() method
        //ii.using string.valueof() method
        /*char[] ch={'d','h','a','n','a'};
        String s1=new String(ch);
        System.out.println(s1);
        String s2=String.valueOf(ch);
        System.out.println(s2);*/


//conversion of string to an char
       /* String s="dhana";
        char ch[]=s.toCharArray();
        for(char ch1:ch)
        {
            System.out.println(ch1);
        }
*/

       /* if(args.length==1|args[1].equals("test)"))
        {
            System.out.println("test case");
        }
else {
            System.out.println(args[0]);
        }*/
        /*String msg=null;
        try{
            System.out.println(msg.length());
        }
        catch (NullPointerException ex)
        {
            System.out.println("Exception is caught here");
            throw ex;

        }*/
/*

        int numbers[]=new int[2];
        numbers[0]=1265;
        numbers[1]=1212;
        int j=0;
        for (int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[j]);
            ++j;
        }
*/
      /*  String a[]=new String{"test"};
        String a1[]=new String[4]{};
        String a2[]=new String[]{};
        String a3[]=new String[0];*/

        /*for (int i=0;i<5;i++)
        {
            switch (i){
                case 0:
                    System.out.print("v ");break;
                case 1:
                    System.out.print("W ");

                case 2:
                    System.out.print("X ");

                case 3:
                    System.out.print("Y ");
                case 4:
                    System.out.print("z ");break;



            }
        }*/
/*int i1=15;
String b1=i1>20?"Green":i1>10?"Blue":"Violet";
        System.out.println(b1);*/

        /*double x=10;
        int y=20;
        float z=30;
        float b=x+y+z;*/

       /* boolean flag=false;
        if(flag=true)
        {
            System.out.println("true");
        }
else System.out.println("false");*/

        //find second and first largest number in an array
        /*int a[]={2,4,6,7,1,9,10};
        Arrays.sort(a);
        int n=a.length;
        System.out.println("first largest number in an array : "+a[n-1]);
        System.out.println("second largest number in an array : "+a[n-2]);*/

        //fetch duplicate elements from two different arrays

        /*char a[]={'d','h','a','n','a'};
        char b[]={'d','h','k','s','h'};

        ArrayList<Character> c=new ArrayList<>();
      for(int i=0;i<a.length;i++)
      {
          for(int j=0;j<b.length;j++)
          {
              if(a[i]==b[j])//== operator because of arrays are objects and the == operator compares the object references
              {
                  c.add(a[i]);
                  break;


              }
          }


      }
      if(!c.isEmpty())
      {
          System.out.println(c);
      }
      else {
          System.out.println("there were no duplicates found");
      }

*/

        //find duplicates charecters from two different arraylists
       /*ArrayList<Character> a=new ArrayList(Arrays.asList('d','h','a','n','c'));
        ArrayList<Character> b=new ArrayList(Arrays.asList('s','u','d','h','a'));


        ArrayList<Character> c=new ArrayList();
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<b.size();j++)
            {
                if(a.get(i).equals(b.get(j)))
                {
                    c.add(a.get(i));
                    break;
                }
            }


        }
        if(!c.equals(null))
        {
            System.out.println(c);
        }
        else {
            System.out.println("there were no duplicates found");
        }
*/
  /*      //find duplicates strings from two different arraylists
       ArrayList<String> a=new ArrayList(Arrays.asList("dhana","hurry","anna","nice","cheap"));
        ArrayList<String> b=new ArrayList(Arrays.asList("dhana","hurrya","annaq"));


        ArrayList<String> c=new ArrayList();
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<b.size();j++)
            {
                if(a.get(i).equals(b.get(j)))
                {
                    c.add(a.get(i));
                    break;
                }
            }


        }
        if(!c.equals(null))
        {
            System.out.println(c);
        }
        else {
            System.out.println("there were no duplicates found");
        }*/

        //Compare two arrayliasts
    /*    ArrayList a=new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList b=new ArrayList(Arrays.asList(1,2,3,4,6));

        if(a.size()!=b.size())
        {
            System.out.println("Lista are different");

        }
        else {
            System.out.println(a.equals(b));
        }*/

        //convert the arraylist to static array
      /*  ArrayList<String> a=new ArrayList<>(Arrays.asList("sudha","dhana","aruna"));
        String[] s=new String[a.size()];
        for(int i=0;i<a.size();i++)
        {
            s[i]=a.get(i);
            System.out.print(s[i]+" ");
        }*/
        //What will be the output of the following Java code?
        /*class box
        {
            int width;
            int height;
            int length;
        }
        class main
        {
            public static void main(String args[])
            {
                box obj = new box();
                obj.width = 10;
                obj.height = 2;
                obj.length = 10;
                int y = obj.width * obj.height * obj.length;
                System.out.print(y);//200
            }
        }*/
        //What will be the output of the following Java code?
        /*class Output
        {
            public static void main(String args[])
            {
                double x = 3.14;
                int y = (int) Math.ceil(x);//Math.ceil function rounds up the value of x to the nearest integer
                System.out.print(y);//4
            }
        }*/
//which package have contains the random class in java
        /*a) java.util package//the random class is the part of the util pacakge in java and use its methods to generate the random number
        b) java.lang package
        c) java.awt package//this package provides classess for handling teh GUI,handling events, and working with graphics and images
        d) java.io package*/
       // What will be the output of following Java code?
import java.util.Scanner;
        class ThisKeyword {
            private int a = 4;
            private int b = 1;
            void getSum(int a, int b) {
                this.a = a;
                this.b = b;
                System.out.println(this.a + this.b);
            }
        }
        public class Main {
            public static void main(String args[]) {
                ThisKeyword T = new ThisKeyword();
                T.getSum(3, 5);
            }
        }






















    }
    }







