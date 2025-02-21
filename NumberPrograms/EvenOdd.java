package NumberPrograms;
public class EvenOdd {
    public static void main(String args[])
    {
        int n=10;
        // if(n%2==0)
        // {
        // System.out.println("Number is Even ");

        // }else{
        // System.out.println("Number is Odd");
        // }

        if((n&1)==0)
        {
            //example to understand we know there is result even at unit place zero is there 
           System.out.println("Even Number");
        }else {
            System.out.println("Odd number");
        }
    }
    }

