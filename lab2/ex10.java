//Write a method in java to find GCD of two number using recursion.
import java.util.Scanner;
public class ex10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second number : ");
        int b =sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        sc.close();
    }
}

