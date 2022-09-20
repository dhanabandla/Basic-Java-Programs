package com.company;

public class Main {

   public static void main(String[] args) {

       // * * * * *
       // * * * * *
       // * * * * *
       // * * * * *
       // * * * * *
       /*{
            int n = 5;
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    System.out.print(" *");
                }``````````````````````````````````````````````````````````````````````````````````````````````````````````````````
                System.out.println();

            }
         }*/

       // * * * * *
       // * * * *
       // * * *
       // * *
       // *
        /*{
            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(" *");
                }
                System.out.println();

            }

        }*/
       // *
       // * *
       // * * *
       // * * * *
       // * * * * *

       {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();

            }

        }
       //          *
       //        * *
       //      * * *
       //    * * * *
       //  * * * * *

      /* {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();

            }

        }*/

       //  * * * * *
       //    * * * *
       //      * * *
       //        * *
       //          *

      /*{
           int n = 5;


           for (int i = 1; i <= n; i++) {

               for (int j = 1; j <= i; j++) {
                   System.out.print("  ");
               }

               for (int j = i; j <= n; j++) {

                   System.out.print("* ");
               }

               System.out.println();

           }

       }*/

       //          *
       //        * * *
       //      * * * * *
       //    * * * * * * *
       //  * * * * * * * * *

       /*{
           int n = 5;
           for (int i = 1; i <=n; i++) {
               for (int j = i; j <= n; j++) {
                   System.out.print("  ");
               }
               for (int j = 1; j <i; j++) {
                   System.out.print("* ");
               }
               for (int j = 1; j <=i; j++) {
                   System.out.print("* ");
               }

               System.out.println();

           }

       }*/

       // * * * * * * * * *
       //    * * * * * * *
       //      * * * * *
       //        * * *
       //          *

       /*{
           int n = 5;
           for (int i = 1; i <=n; i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.print("  ");
               }
               for (int j = i; j <n; j++) {
                   System.out.print("* ");
               }
               for (int j = i; j <=n; j++) {
                   System.out.print("* ");
               }

               System.out.println();

           }

       }*/
       //          *
       //        * * *
       //      * * * * *
       //    * * * * * * *
       //  * * * * * * * * *
       //    * * * * * * *
       //      * * * * *
       //        * * *
       //          *

       /*{
           int n = 5;
           for (int i = 1; i <n; i++) {
               for (int j = i; j <= n; j++) {
                   System.out.print("  ");
               }
               for (int j = 1; j <i; j++) {
                   System.out.print("* ");
               }
               for (int j = 1; j <=i; j++) {
                   System.out.print("* ");
               }

               System.out.println();

           }

       }
       {
           int n = 5;
           for (int i = 1; i <=n; i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.print("  ");
               }
               for (int j = i; j <n; j++) {
                   System.out.print("* ");
               }
               for (int j = i; j <=n; j++) {
                   System.out.print("* ");
               }

               System.out.println();

           }

       }*/

       //5
       //5 4
       //5 4 3
       //5 4 3 2
       //5 4 3 2 1

       /*{
           int n = 5;

           for (int i = 1;i <= n; i++) {
               int p=5;
               for (int j = 1; j <= i; j++)
               {

                   System.out.print(p--+" ");

               }
               System.out.println();

           }

       }*/

/*ASCII value for specific charecters
       char ch1='a';
       char ch2='b';
       int ascci1=ch1;
       int ascci2=ch2;
       System.out.println(ascci1+" "+ascci2);*/
 //prints the ASCII value (0 to 255) of all the characters
      /*for(int i=0;i<=255;i++)
      {
          System.out.println("ascii value of " +(char)i+ "=" +i);
      }*/
 /*print a to z charecters
       for(char ch='a';ch<='z';ch++)
       {
           System.out.println(ch);
       }*/




    }
}
