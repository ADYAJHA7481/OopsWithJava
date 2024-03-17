//Write a method to print n fibonacci number
import java.util.*;
public class ex9 {
    public static void fibo(int[]a,int size)
    {
        a[0]=0;
        a[1]=1;
        System.out.print(a[0] + " " + a[1] + " ");
        for(int i=2;i<size;i++)
        {
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter number to print fibonacci number : ");
        size = sc.nextInt();
        int[]a=new int[50];
        fibo(a,size);
        sc.close();
    }
}


