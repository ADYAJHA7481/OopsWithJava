public class InvertedStar {
    public static void main(String args[])
    {
        int i , j ;
        for(i=1;i<=5;i++)
        {
            for(j=i-1+1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
