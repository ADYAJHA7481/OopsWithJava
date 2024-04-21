public class RotatedHalfPyramid {
    public static void main(String args[])
    {
        int i, j, k;
        int row = 4;
        for(i=1; i <=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    } 
}
