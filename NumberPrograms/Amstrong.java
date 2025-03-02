package NumberPrograms;

public class Amstrong {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int result=0;

        while (n>0) {
            int rem=n%10;
            n=n/10;

            rem=rem*rem*rem;
            result=rem+result;

        

        }

        if (result==original) {
            System.out.println("number amstrong");

        }
        else
        {
            System.out.println("not");
        }
    }
}
