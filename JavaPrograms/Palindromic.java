public class Palindromic {
    public static void main(String args[])
    {
        int i , j;
        int row=5;
        for(i=1; i<=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
