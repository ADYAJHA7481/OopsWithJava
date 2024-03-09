//Write a program to find factorial of a number using method.
import java.util.Scanner;
public class ex2 {
    public static void factorial(int number){
        int i;
        int facto = 1;
        for(i=1; i<=number; i++)
        {
            facto = facto*i;
        }
        System.out.println("Factorial = "+facto);
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number : ");
       int number = sc.nextInt();
       factorial(number);        
    }
}
