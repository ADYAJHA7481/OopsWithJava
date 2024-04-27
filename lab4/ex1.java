//Write a program to swap two variables
public class ex1 {

    public static void swapVariable(int a , int b)
    {
        int c = a;
        a = b;
        b = c ;
        System.out.println("\nAfter Swapping a = "+a);
        System.out.println("After Swapping b = "+b);
    }    

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.print("Before Swapping a = "+a);
        System.out.print("\nBefore Swapping b = "+b);
        swapVariable(a, b);
    }
    
}