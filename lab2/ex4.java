//Write a program to add  matrices.
import java.util.*;
public class ex4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row , coloum ;
        System.out.print("Enter Row : ");
        row = sc.nextInt();
        System.out.print("Enter coloum : ");
        coloum = sc.nextInt();
        int i ,j ;
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        System.out.println("Enter elements of first matrix  ");
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=coloum;j++)
            {
                System.out.print("Enter number for "+i + ""+ j + " : " );
                a[i][j]=sc.nextInt();
            }
        }       

        System.out.println("Enter elements of Second matrix  ");
        
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=coloum;j++)
            {
                System.out.print("Enter number for "+i + ""+ j + ": ");
                b[i][j]=sc.nextInt();
            }
        }  
         
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=coloum;j++)
            {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println("");
        }  
    }
}