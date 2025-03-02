package AccentureDSA;

public class DifferenceOfAccenture1 {

    public static int differenceofSum(int n,int m) {
        int sumdiv=0;
        int sumdivnot=0;
        for(int i=0;i<=m;i++ )
        {
            if(i%n==0)
            {
                sumdiv+=i;
            }else{
                sumdivnot+=i;
            }
        }

        int k=sumdivnot-sumdiv;
        return k;
    }
    public static void main(String[] args) {
        int diffrence=differenceofSum(5,15);
        System.out.println(diffrence);
    }
}
