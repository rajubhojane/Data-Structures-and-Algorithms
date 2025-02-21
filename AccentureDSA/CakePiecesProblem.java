package AccentureDSA;

public class CakePiecesProblem {

    public static long maxPiece(long n)
    {
        long sum=((n*(n+1))/2)+1;
        long result=sum%1000000007;
        return result;
    }
    public static void main(String args[])
    {
       long N=maxPiece(4);
       System.out.println(N);

    }
}
