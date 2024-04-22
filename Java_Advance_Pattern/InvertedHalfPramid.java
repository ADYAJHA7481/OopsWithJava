public class InvertedHalfPramid {
    public static void main(String args[])
    {
        int i , j;
        int row = 5;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=row-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
