public class NumberPyramid {
    public static void main (String args[])
    {
        int i , j ;
        int row = 5;
        for(i=1; i<=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println("");
        }

    }
}
