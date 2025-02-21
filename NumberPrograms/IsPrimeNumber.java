package NumberPrograms;

public abstract class IsPrimeNumber {

    static boolean isPrime(int n)
    {
        boolean isprime=true;
        if(2<n)
        {
            isprime=false;
        }else
        {
            for(int i=2;i<n;i++)
            {
                if(n%2==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        return isprime;

    }
    public static void main(String[] args) 
    {
      boolean m=isPrime(7);
      System.out.println(m);
        
    }
}
