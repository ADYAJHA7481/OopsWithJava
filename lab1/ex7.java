// Write a java program to find maximum of three numbers
import java.util.Scanner;
public class ex7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first_number = sc.nextInt();
        System.out.println("Enter second number : ");
        int second_number = sc.nextInt();
        System.out.println("Enter third number : ");
        int third_number = sc.nextInt();
        if(first_number>second_number && first_number>third_number)
        {
            System.out.println("maximum = "+first_number);
        }
        else if (second_number>third_number)
        {
            System.out.println("maximum = "+second_number);
        }
        else{
            System.out.println("maximum = "+third_number);
        }
    }
}