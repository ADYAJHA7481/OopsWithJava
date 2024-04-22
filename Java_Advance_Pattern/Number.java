public class Number {
    public static void main(String[] args) {
        int i , j;
        int row = 4;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(j=i;j>1;j--)
            {
                System.out.print((j-1)+" ");
            }
            System.out.println(" ");
        }
    }
}
