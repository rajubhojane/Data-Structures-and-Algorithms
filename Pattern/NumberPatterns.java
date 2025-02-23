package Pattern;

public class NumberPatterns {

    public static void numberHalfTringle()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    public static void letterPrint()
    {
        int n=5;
        char letter=65;

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(letter);
                letter++;
                    
            }
            System.out.println();

        }
    }
    
 public static void numberLeftTringle()
 {
    int n=6;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
 }
    
    public static void main(String[] args) {
        //NumberPatterns.numberHalfTringle();
        //NumberPatterns.letterPrint();
        NumberPatterns.numberLeftTringle();
    }
}
