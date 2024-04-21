public class SolidRhombus {
    public static void main(String args[])
    {
       int i , j ,k;
       int row=5;
       for(i=1;i<=row;i++)
       {
        for(j=1;j<=row-i;j++)
        {
            System.out.print("  ");
        }
        for(k=1;k<=row;k++)
        {
            System.out.print("* ");
        }
        System.out.println("");
       } 
    }
}
