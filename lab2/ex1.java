//Write a program to add two numbers, where numbers is to be accepted using 1.Command line argument 2.Buffer Reader 3. DataInputStream 4.Scanner class

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex1 {
    public static void main(String args[])
    {
        // Using Command Line

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a+b;
        System.out.println("First Number = "+a);
        System.out.println("Second Number = "+b);
        System.out.println("Sum = "+c); 

        // Using Buffer Reader

        try {
            BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number : ");
            int num1 = Integer.parseInt(d.readLine());
            System.out.print("Enter second number : ");
            int num2 = Integer.parseInt(d.readLine());
            int sum = num1 + num2;
            System.out.println("Sum : " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Using DataInputStream
        
        try {
            DataInputStream e = new DataInputStream(System.in);
            System.out.print("Enter first number : ");
            int num1 = Integer.parseInt(e.readLine());
            System.out.print("Enter second number : ");
            int num2 = Integer.parseInt(e.readLine());
            int sum = num1 + num2;
            System.out.println("Sum : " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Using Scanner Class

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum : " + sum);
        sc.close();
    
    }
}
