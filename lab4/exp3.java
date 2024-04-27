//Write a program to find area of a square, rectangle and triangle using parameterized constructor.

import java.util.*;
class ex3 {
    double area;
    ex3(double side) {
        area = side * side; 
    }

    ex3(double length, double breadth) {
        area = length * breadth; 
    }

    ex3(double base, double height, String shape) {
        area = 0.5 * base * height;
    }

    void display() {
        System.out.println("Area: " + area);
    }
}

public class exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        double side = sc.nextDouble();
        ex3 s1 = new ex3(side);
        System.out.print("Area of square: ");
        s1.display();

        System.out.println("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        double breadth = sc.nextDouble();
        ex3 rectangle = new ex3(length, breadth);
        System.out.print("Area of rectangle: ");
        rectangle.display();

        System.out.println("Enter the base of the triangle:");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = sc.nextDouble();
        ex3 triangle = new ex3(base, height, "triangle");
        System.out.print("Area of triangle: ");
        triangle.display();

        sc.close();
    }
}