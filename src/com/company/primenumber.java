package com.company;

public class primenumber {
    public static void main(String[] args) {
        //find given number is prime or not
       /* int n=12;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }
        if(count==2)
            System.out.println("given number is prime number");
        else
            System.out.println("not a prime number");*/

 //find the prime numbers in between 1 to 100
        int n=100;
        boolean isprime;
        for(int i=2;i<=n;i++) {
            isprime=true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    isprime=false;
                    break;
                }

            }
            if (isprime)
                System.out.print(i+ " ");

        }



    }
}
