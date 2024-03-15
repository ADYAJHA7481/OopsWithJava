//Write a program to find largest and smallest number in an array   
import java.util.*;
public class ex3 {
    public static void small_large(int arr[],int size)
    {   int max = arr[0];
        int min = arr[0];
        for(int i=0; i<size; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.print("Largest number = "+max);
        System.out.print("\nSmallest number = "+min);
    }
    public static void main(String args[])
    {
        int i,size;
        int a[]=new int [20];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        small_large(a, size);
    }
}