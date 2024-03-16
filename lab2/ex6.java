//Write a program to find ncr using method
//ncr = n! / r! * (n – r)!
import java.util.*;
public class ex6 {
    public static int factorial(int x)
    {
        int fact = 1;
        for(int i=1; i<=x;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main (String args[])
    {
        int n , r, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value : ");
        n = sc.nextInt();
        System.out.print("Enter R value : ");
        r = sc.nextInt();
        // c = factorial(n)/(factorial(r)*factorial((n-r)));
        // System.out.print(" Output will be : "+ c);
        c = factorial((n-r));
        n = factorial(n);
        r = factorial(r);
        int result = n/(r*c);
        System.out.print(" Output will be : "+ result);

    }
    
}
