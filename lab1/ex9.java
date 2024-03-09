//write a java program to convert miles to kilometers.
import java.util.Scanner;
public class ex9 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Enter miles to convert kilometer : ");
        a = sc.nextDouble();
        double b = a*1.60934;
        System.out.println("Kilometer = "+b);
    }
}
