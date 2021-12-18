package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class stringprograms {

    public static void main(String[] args) {

//count the total number of charecters in a string
        /*String s="My Name is Dhana";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);*/

//find number of letters,digits,spaces and other in a string

        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter a string");
        String s=SC.nextLine();
        int letter=0;
        int digit=0;
        int space=0;
        int other=0;
        char ch[]=s.toCharArray();//convert string to charecter array
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(ch[i]))
            {
                letter++;
            }
            else if(Character.isDigit(ch[i]))
            {
                digit++;
            }
            else if(Character.isSpaceChar(ch[i]))
            {
                space++;
            }
            else
                other++;
        }
        System.out.println("letters :" +letter);
        System.out.println("digits :" +digit);
        System.out.println("spaces :" +space);
        System.out.println("others :" +other);*/

//find number  of vowels and consonents in a string

        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter a string");
        String s=SC.nextLine();
        int Ccount=0;
        int Vcount=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                Vcount++;
            else if (s.charAt(i)>='a'&& s.charAt(i)<='z')
                Ccount++;
        }
        System.out.println("vowels :" +Vcount);
        System.out.println("consonents :" +Ccount);*/

//print vowels and consonents in a given string
        /*Scanner SC=new Scanner(System.in);
        System.out.println("enter a string");
        String s=SC.nextLine();
        String vs1="";
        String vs2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vs1=vs1+ch;
            }
            else if(ch>='a' && ch<='z')
            {
                vs2=vs2+ch;
            }

        }
        System.out.println(vs1);
        System.out.println(vs2);*/


//find both strings are anagram or not

        /*String s1="Dhana";
        String s2="anadH";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())
            System.out.println("both strings are not anagram");
        else {
            char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2)==true)
                System.out.println("both strings are anagram");
            else
                System.out.println("both strings are not anagram");
        }*/

//remove empty spaces in a string

        /*String s="dhana lakshmi bandla";
        s=s.replaceAll(" ","");
        System.out.println(s);*/

        /*String s="dhana lakshmi bandla";
        String s1="";
        char ch[]= s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
                s1=s1+s.charAt(i);

        }
        System.out.println(s1);*/

        /*String s="dhana lakshmi bandla";
        String s1="";
        char ch[]= s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
                s1=s1+ch[i];

        }
        System.out.println(s1);*/

//replace lower case charecters to uppercase charecters

        /*String s="dhana lakshmi DFER";
        s=s.toUpperCase();
        System.out.println(s);*/

//Reverse of charecters in a string

        /*String s="dhana lakshmi";
        String rev="";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        System.out.println(rev);*/

        //or

        /*String s="dhana lakshmi";
        String rev="";

        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);*/

        //or
        /*String s="dhana lakshmi";
        StringBuffer sb=new StringBuffer(s);//create stringbuffer object
        System.out.println(sb.reverse());*/


//reverse of words in a string

        /*String str="My Name is Dhana";
        String[] a=str.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }*/

//check whether string is palindrome or not

        /*String s="madam";
        String original=s;
        String rev="";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        if(s==original)
        {
            System.out.println("given string is palindrome");
        }
        else
            System.out.println("given string is not palindrom");*/

//find duplicate charecters in a string

        /*String s="dhana lakshmi";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j]) {
                    System.out.println(ch[i]);
                }
            }

        }*/

//Remove duplicate cahrecters in given string

        /*String s="dhana lakshmi";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            boolean repeated =false;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println(ch[i]);
                }
            }

        }*/

 //find duplicate words in a string

        /*String s="dhana lakshmi dhana";

        String a[]=s.split(" ");

        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++) {
                if (a[i].equals(a[j])) {
                    System.out.println(a[i]);

                }
            }


        }*/

//number of words in a string

        /*String s="dhan lakshmi bandla";
        int a=s.split(" ").length;
        System.out.println( s.split(" ").length);*/

//swap two strings using temp variable

        /*String s1="dhana";
        String s2="lakshmi";
        String  temp;
        temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("swaping of s1 and s2 is :"+s1+ " " +s2);*/

//swapping of two strings without using third variable

        /*String s1="dhana";
        String s2="lakshmi";
        s1=s1+s2;//concatinate s1 and s2(dhanalakshmi)
        s2=s1.substring(s1.length()-s2.length());//store initial s1 to s2(dhana)
        s1=s1.substring(s2.length());//store initial s1 to s2(lakshmi)
        System.out.println("swaping of s1 and s2 is :"+s1+ " " +s2);*/















    }
}
