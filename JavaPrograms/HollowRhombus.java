public class HollowRhombus {
    public static void main(String[] args) {
        int i,j;
        int row=5;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=row;j++)
            {
                if(i==1 || i==row || j==1 || j==row)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}
