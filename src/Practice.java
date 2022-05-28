import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter an ineger");
        n=s.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }if(sum==n)
        {
            System.out.println("the no is perfect");
        }
        else
        {
            System.out.println("the no is not perfect");
        }
    }
    int dividor(int x)
    {
        return x;
    }
}
