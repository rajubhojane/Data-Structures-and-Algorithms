package NumberPrograms;

public class AdditionNumberDigits {
    public static void main(String[] args) {
        int n=153;
        int result =0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            result=rem+result;
            n=n/10;

        }
        System.out.println(result);

    }
}
