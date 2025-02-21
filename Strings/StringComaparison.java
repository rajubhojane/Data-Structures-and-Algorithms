package Strings;
import java.lang.Object;

public class StringComaparison {
    
    public static void equalMethod()
    {
        String s1="Raju";
        String s2="Bhojane";
        String s3="Raju";
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));

       if(s1==s3)
       {
        System.out.println("Address True");
       }else{
        System.out.println("Address False");
       }
       
       //s1="Ram";

       System.out.println(s1);
       System.out.println(s1.hashCode());
       System.err.println(s3.hashCode());
       
       String m1=new String("Raju");
       String m2=new String("Raju1");

       System.out.println(m1==m2);
       System.out.println(m1.equals(m2));
       System.out.println(m1.hashCode());
       System.out.println(m2.hashCode());





    }

    public static void equalMethodIgnoreCase()
    {
        System.out.println("Raju".equalsIgnoreCase("raju"));
        System.out.println("Raju".equalsIgnoreCase("Raju1"));

    }

    public static void compareToMethod()
    {
        System.out.println("apple".compareTo("banana"));
        System.out.println("banana".compareTo("apple"));
        System.out.println("Apple".compareTo("apple"));
        System.out.println("banana".compareTo("Banana"));
        System.out.println("Mona".compareTo("lisa"));

    }

    public static void nullPointerString()
    {
        String s1="Raju";
        String s2=null;

        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(null , null));


    }
    public static void main(String args[])
    {
        //equalMethod();
        //equalMethodIgnoreCase();
        //compareToMethod();
        nullPointerString();

    }
}
