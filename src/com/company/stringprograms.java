package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class stringprograms {

    public static void main(String[] args) {

//count the total number of charecters in a string
        String s="My Name is Dhana";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);

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
        System.out.println("before reversing the string");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("after reversing the string");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }*/



//check whether string is palindrome or not

       /* String s="madam";
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

       /* String s="dhana lakshmi dhana";

        String a[]=s.split(" ");

        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++) {
                if (a[i].equals(a[j])) {
                    System.out.println(a[j]);

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

//split of string

     /* String s="My=name=is=dhana";
      String[] s2=s.split("=");
        System.out.println(s2[0]);*/

//caps of string

     /* String s="i Am dHana";
      String[] s2=s.split(" ");
        //for(String w:s2)
       *//* for(int i=0;i<s2.length;i++)
      {
          String first=s2[i].substring(0,1); //extract 1st letter in string-->will not extract 0th letter
          String last =s2[i].substring(1);//extract letters from 1 to end-->will not extract 0th letter
          String caps=first.toUpperCase()+last.toLowerCase();
          System.out.println(caps);
      }*/

//converting char array to string

     /*char ch[]={'s','t','r','i','n','g'};
     String s=new String(ch);
     System.out.println(s);*/

//converting string to char array

    /*String s="dhana";
    char ch[]=s.toCharArray();
        System.out.println(ch[0]+","+ch[1]);*/

//compare two strings with equals and compare keywords

    /*String s1="dhanad45";
    String s2="dhana";
    System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));*/

//get substring

    /*String s="dhana";
    //String s1=s.substring(0,3);//dha(will get 0,1,2 positions)
        String s1=s.substring(3);//na(will get from 3rd letter)
        System.out.println(s1);*/

//trim the string--eliminates the white spaces before and after the string

   /* String tr=" dhana - lakshmi ";
        System.out.println("before trim"+tr);
        String tr1=tr.trim();
        System.out.println("after trim"+tr1);//"dhana - lakshmi"(trimmed before and after the white space)
        //in order to trim space for each string, first need to split and then trim the word
        String[] s=tr1.split("-");
        *//*String strim1=s[0].trim();//"dhana"
        System.out.println("first word trim"+strim1);
        String strim2=s[1].trim();//"lakshmi"
        System.out.println("second word trim"+strim2);*//*
        for(String w:s)
        {
            System.out.println(w.trim());
        }*/



//keep alphabets and spaces

    /* String s="dhana @#90_+!lak^6";
        System.out.println(s.replaceAll("[^a-zA-Z ]",""));*/

//keep alphabets,spaces and numbers
       /* String s1="dhana 5412 @#90_+!lak^6";
        System.out.println(s.replaceAll("[^a-zA-Z0-9 ]",""));*/

//remove numbers in string
        /*String s2="dhana 5412 @#90_+!lak^6";
        System.out.println(s.replaceAll("[^0-9]",""));*/

//keep special charecters in string
       /* String s3="dhana 5412 @#90_+!lak^6";
        System.out.println(s.replaceAll("[0-9a-zA-Z ]",""));
*/
//convert string to int
       /* String ss="125";
        int a=Integer.parseInt(ss);
        System.out.println(a+1);*/

//convert int to string
         /*int n=125;
         String ss1=String.valueOf(n);drdyh jkloiwsz5rftgyhbyhbn(ss1+1);
*/
//compare '==' operator and '.equals' method

        String str1=new String("dhana");
         String str2=new String("dhana");
         System.out.println(str1==str2);//use == operator for reference comparision
         System.out.println(str1.equals(str2));//use equals operator for conten comparision
        //use == operator for reference comparision
        String str3="dhana";
        String str4="dhana";
        System.out.println(str3==str4);

//Remove consecutive letters in array

        /*String str="dhhanaaa";
        String s1="";
        char cha[]=str.toCharArray();
        char p='\0';
        int k=0;
       for(int i=0;i<cha.length;i++)
        {
            if(p!=cha[i])
            {
              cha[k++]=cha[i];
              p=cha[i];
              s1=s1+p;


            }

        }
        System.out.println(s1);*/


        //Remove consecutive letters in array

      /* String str11="ssttdfrnn";
        String res="";
        for(int i=0;i<str11.length();i++)
        {
            if(i<str11.length()-1 && str11.charAt(i)==str11.charAt(i+1))
            {
                continue;
            }
            else
            {
                //System.out.println(s.charAt(i));
               res=res+str11.charAt(i);
            }
        }
        System.out.println(res);*/


        //remove consecutive numbers in array list

        /*int arr[]={1,1,1,2,2,1,3,4,4,3};
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1 && arr[i]==arr[i+1])
            {
                continue;
            }
            else
            {
                System.out.println(arr[i]);
            }
        }*/

        //contains method--->it will returns boolean

       /* String s1="dhana";
        String s2="lakshmidha";
        System.out.println(s1.contains("dha"));*/

//join the strings using join method

   /*   String s1="dhana";
      String s2="lakshmi";
        System.out.println(String.join("dhanu",s1,s2));
        System.out.println(String.join("",s1,s2));
        System.out.println(String.join(" ",s1,s2));
        System.out.println(String.join("-",s1,s2));*/

//replace specific charecter or string

      /*String s1="dhana lucky";
        System.out.println(s1.replace("lucky","Lakshmi"));//replace old string new string
        System.out.println(s1.replace("n","x"));//replace old charecter to new charecter*/

//finding index using index method

     /* String s="dhana";
        System.out.println(s.indexOf('a'));*/

//concatinate two strings

   /* String s1="dhana";
    String s2="lakshmi";
        System.out.println(s1.concat(" lakshmi"));
        System.out.println(s1+" lakshmi");*/

//count charecters in other way

        /*String s="my name is dhana";
        char ch[]=s.toCharArray();
        int count=0;
        for(char ch1:ch)
        {
            if(ch1!=' ')
            count++;
        }
        System.out.println(count);*/

//String palindrome

   /*String s="dhana";
   String rev="";
   char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        System.out.println(rev);
        if(rev.equals(s))
        {
            System.out.println("given string is plaindrome");
        }
        else
            System.out.println("not palindrome");*/

//Remove consecutive elements in array and string

     /*String s="dhana";
     char ch[]=s.toCharArray();
     for(int i=0;i<ch.length;i+=2)
     {

         System.out.println(ch[i]);
     }*/










































    }

}
