public class FloydTriangle {
    public static void main(String args[])
    {
        int i , j ;
        int rows = 5;
        int number = 1;
        for(i=1; i<=rows; i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println("");
        }
    }
}
