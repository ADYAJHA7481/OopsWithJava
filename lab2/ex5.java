//Write a program to search an element in an array 
import java.util.* ;
public class ex5 {
    public static void main(String[] args)
    {
        int a[] = new int[30];
        int size , item ,find ;
        find = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        size = sc.nextInt();
        System.out.println("Enter elements of an array  ");
        for(int i=0; i<size;i++)
        {
            System.out.print("Enter element for "+ i + " index : ");
            a[i]=sc.nextInt();        
        }
        System.out.print("Enter element to find : ");
        item = sc.nextInt();
        for(int i=0; i<size;i++)
        {
            if(a[i]==item)
            {
                find = 1;
                break;
            }       
        }
        if(find ==1)
        {
            System.out.println("Element found!!!");
        }
        else
        {
            System.out.println("Element Not found!!!");
        }
       
    }
}