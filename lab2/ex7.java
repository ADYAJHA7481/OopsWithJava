//Write a program to print transpose of matrix
import java.util.*;
public class ex7 {
    public static void main(String[] args) {
        int a[][]= new int[20][20];
        int b[][]= new int[20][20];
        int i , j , row, coloum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        row = sc.nextInt();
        System.out.print("Enter no. of coloum : ");
        coloum = sc.nextInt();
        for(i=1; i<=row; i++)
        {
            for(j=1; j<=coloum; j++)
            {
                System.out.print("Enter element for " +i+""+j + " : ");
                a[i][j]= sc.nextInt();
            }
        }
        for(i=1; i<=coloum; i++)
        {
            for(j=1; j<=row; j++)
            {
                System.out.print((b[i][j]=a[j][i])+" ");
            }
            System.out.println("");
        }

    }
}
