package Pattern;

public class TringleHalf {
    public static void tringleHalf()
    {
        int  n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {  
       TringleHalf.tringleHalf();
    }
}
