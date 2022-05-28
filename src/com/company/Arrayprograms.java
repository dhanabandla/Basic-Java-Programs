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

        /*int a[]={5,17,70,10,180,180};
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
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
        }
            for(int b:a)
            {
                System.out.println(b);


        }*/

//find third largest value in an array

        /*int a[]={5,17,70,10,180,181};
        int n=a.length;
        Arrays.sort(a);
        System.out.println(a[n-6]);*/

//print even or odd elements in an array

        /*int a[]={5,17,70,10,180,180};
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


















        }
    }







