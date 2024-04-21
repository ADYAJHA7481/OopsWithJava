public class Butterfly {
    public static void main(String args[])
    {
        int i , j , k;
        int row = 12;
        for(i=1;i<=row/2;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(k=1;k<=row-i*2;k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(i=1;i<row/2;i++)
        {
            for(j=1;j<=row/2-i+1;j++)
            {
                System.out.print("* ");
            }
            for(k=1;k<=(i-1)*2;k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=row/2-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
