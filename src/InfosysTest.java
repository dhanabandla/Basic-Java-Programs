import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InfosysTest {
    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****

        /*int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4

        /*int n=4,p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p);
            }
            System.out.println();
            p++;
        }*/

        //find the frequency of each element in given arraylist

        /*int a[]={1,2,8,3,2,2,2,5,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else
            {
                hm.put(a[i],1);
            }
        }
        System.out.println("Element | Frequency");
        System.out.println("------------------------");
       for(Map.Entry entry:hm.entrySet())
       {
           System.out.println(entry.getKey()+ " "+entry.getValue());
       }
*/
        
        //find the maximum occurence of word in a string
        
        /*String s="The cat is a white cat. The cat name is Rosy.";
        String s2=s.replace(".","");
        System.out.println(s2);
        String[] s1=s2.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<s1.length;i++)
        {
            if(hm.containsKey(s1[i]))
            {
                hm.put(s1[i],hm.get(s1[i])+1);
            }
            else {
                hm.put(s1[i],1);
            }
        }
        int maxCount = 0;

        String maxString = "";

        for (Map.Entry<String, Integer> entry : hm.entrySet())
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();

                maxString = entry.getKey();
            }

        }
        System.out.println(maxString+" : "+maxCount);
        *//*for (Map.Entry<String, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+ " : "+entry.getValue());
            }

        }*//*
*/

        //reverse a string

        /*String s="dhana lakshmi bandla";
        String[] s1=s.split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
            System.out.print(s1[i]+ " ");
        }*/

        /* 1*
2*2*
3*3*3*
4*4*4*4*
4*4*4*4*
3*3*3*
2*2*
1*
*/
        /*int n=4,p=1,p1=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p);
                System.out.print("*");
            }
            System.out.println();
            p++;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(p1);
                System.out.print("*");
            }
            System.out.println();
            p1--;
        }*/


    //write a program for fibanacci series
    //0 1 1 2 3 5 8
    /*int n1=0,n2=1,n3,n=7;
        System.out.print(n1+ " " +n2+ " ");
    for(int i=2;i<n;i++)
    {
        n3=n1+n2;
        System.out.print(n3+ " ");
        n1=n2;
        n2=n3;
    }*/

    //write a program for plaindrome

    /*int n=155,r,sum=0;
    int temp=n ;
    while(n>0)
    {
        r=n%10;//1
        sum=sum*10+r;
        n=n/10;//15

    }
    if(temp==sum)
    {
        System.out.println("given number is palindrome");
    }
    else
        System.out.println("given number is not plaindrome");*/



    }
}
