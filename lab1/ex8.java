// write a java program to swap two numbers
public class ex8 {
    public static void main(String args[])
    {
        int a = 5 ;
        int b = 7;
        System.out.println("Before Swapping A = "+a);
        System.out.println("Before Swapping B = "+b);
        int c = b;
        b = a;
        a = c;
        System.out.println("After Swapping A = "+a);
        System.out.println("After Swapping B = "+b);
    }
}
