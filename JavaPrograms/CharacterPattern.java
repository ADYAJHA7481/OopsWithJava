public class CharacterPattern {
    public static void main(String args[])
    {
        int line = 5;
        int i , j;
        char ch='A';
        for(i=1;i<=line;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
}
