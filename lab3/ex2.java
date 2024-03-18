//Find the area of a square,rectangle and triangle using method overloading
import java.util.*;
public class ex2 {
    public static void area(int side){
        System.out.print("Area of square : "+side*side);
    }
    public static void area(int length,int width){
        System.out.print("\nArea of rectangle : "+(length*width));
    }
    public static void area(float base,float height){
        float result = base*height;
        System.out.print("\nArea of triangle : " +(result/2));
    }
    public static void main(String args[])
    {
        int side,length,width;
        float base, height;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square : ");
        side=sc.nextInt();

        System.out.print("Enter length of rectangle : ");
        length=sc.nextInt();

        System.out.print("Enter width of rectangle : ");
        width=sc.nextInt();

        System.out.print("Enter base of triangle : ");
        base=sc.nextFloat();

        System.out.print("Enter height of triangle : ");
        height=sc.nextFloat();

        area(side);
        area(base, height);
        area(length, width);
        sc.close();
    }
}
