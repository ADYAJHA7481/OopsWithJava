//Write a program to find largest and smallest number in an array   
public class ex3 {
    public static void small_large(int arr[])
    {   int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<=min)
            {
                min = arr[i];
            }
        }
        System.out.print("Largest number = "+max);
        System.out.print("\nSmallest number = "+min);
    }
    public static void main(String args[])
    {
        int arr[] = {1,5,6,7,18,11,2};        
        small_large(arr);
    }
}