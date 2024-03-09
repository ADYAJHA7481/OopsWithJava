//Write a program to find grade
import java.util.Scanner;
public class ex11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your percentage to know the grade : ");
        int a = sc.nextInt();
        if (a>=95) 
        {
            System.out.println("Your Grade is A++ ");
        }
        if (a>=90) 
        {
            System.out.println("Your Grade is A ");
        }
        else if (a>=80) 
        {
            System.out.println("Your Grade is B ");
        }
        else if (a>=70) 
        {
            System.out.println("Your Grade is C ");
        }
        else if (a>=60) 
        {
            System.out.println("Your Grade is D ");
        }
        else if (a>=40) 
        {
            System.out.println("Your Grade is E ");
        }
        else
        {
            System.out.println("Your Grade is F ");
        }
    }
}
