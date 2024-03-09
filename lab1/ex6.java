//Write a program to accept a string, character and float variable and print them.
import java.util.Scanner;
public class ex6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String a = sc.next();
        System.out.print("Enter Integer :");
        int b=sc.nextInt();
        System.out.print("Enter Float :");
        float c = sc.nextFloat();      
        System.out.println("String :"+a);  
        System.out.println("Integer :"+b);       
        System.out.println("Float :"+c);
    }
}
