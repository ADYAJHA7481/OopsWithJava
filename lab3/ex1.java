//WAP to add two integers, three integers and two floating point numbers using method overloading.
public class ex1{
    public static void sum(int a,int b)
    {
        System.out.print("Sum of two integers ="+(a+b));
    }
    public static void sum(int a,int b,int c)
    {
        System.out.print("\nSum of three integers ="+(a+b+c));
    }
    public static void sum(float a,float b)
    {
        System.out.print("\nSum of two floating numbers ="+(a+b));
    }
    public static void main(String args[])
    {
        sum(5,6);
        sum(3,4,8);
        sum(3.4f,6.2f);
    }
}