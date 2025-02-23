package BasicjavaQ;

import java.util.Scanner;

public class Basic{

    public static void addditon()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Addditon Program ");

        System.out.print("Enter Your Value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter Your Value of b : ");
        int b=sc.nextInt();
        System.out.println("Addition of a And b : "+(a+b));


    }

    public static void substraction()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Addditon Program ");

        System.out.print("Enter Your Value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter Your Value of b : ");
        int b=sc.nextInt();
        System.out.println("Addition of a And b : "+(a-b));


    }

    public static void Mul()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Addditon Program ");

        System.out.print("Enter Your Value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter Your Value of b : ");
        int b=sc.nextInt();
        System.out.println("Addition of a And b : "+(a*b));


    }

    public static void div()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Addditon Program ");

        System.out.print("Enter Your Value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter Your Value of b : ");
        int b=sc.nextInt();
        System.out.println("Addition of a And b : "+(a/b));


    }

    public static float sum(int a,int b){
       return a-b;
    }

    public static int FirstSum(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
           sum=sum+i;
        }
        return sum;

    }

    public static void EvenOdd()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Value of n : ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Number Is Even");
        }else{
            System.out.println("Number is Odd ");
        }
    }

    public  void evenodd()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Value of n : ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Number Is Even");
        }else{
            System.out.println("Number is Odd ");
        }
        sc.close();

    }

    public static void main(String args[])
    {
        // Basic.addditon();
        // Basic.substraction();
        // Basic.Mul();
        // Basic.div();

        // float result=Basic.sum(12,6);
        // System.out.println(result);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Value N : ");
        // int N=sc.nextInt();
        // int result=FirstSum(N);
        // System.out.println(result);

        //Basic.EvenOdd();
        Basic obj=new Basic();
        obj.evenodd();




    }
}