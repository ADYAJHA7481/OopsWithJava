//Write a java program to check whether a number is divisible by 5 or not.
import java.util.Scanner;
public class ex12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        if(a%5==0)
        {
            System.out.println("This number is divisible by 5 ");
        }
        else
        {
            System.out.println("This number is not divisible by 5 ");
        }
    }
}
