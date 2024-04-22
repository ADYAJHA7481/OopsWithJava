public class ZeroOnePattern {
    public static void main(String[] args) {
        int i , j ;
        int row = 5;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println("");
        }
    }
}
