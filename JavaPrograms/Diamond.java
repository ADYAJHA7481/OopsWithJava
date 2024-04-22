public class Diamond {
    public static void main(String args[])
    {
        int i , j , k ;
        int row=8;
        for(i=1;i<=row/2;i++)
        {
            for(j=1;j<=row/2-i;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(i=1;i<=row/2;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=row-2*i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
