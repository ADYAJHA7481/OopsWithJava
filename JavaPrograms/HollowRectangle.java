public class HollowRectangle {
    public static void main(String args[])
    {
        int i , j;
        int coloum = 5;
        int row = 4;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=coloum;j++)
            {
                if (i==1 || i==row || j==1 ||j==coloum) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
