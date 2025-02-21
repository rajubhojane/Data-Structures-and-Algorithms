package Strings;

public class EvenWordFind {
    public static void evenWord(String s)
    {
      for(String m:s.split(" "))
      {
        if(m.length()%2==0)
        {
            System.out.println(m);
        }
      }
    }
    public static void main(String args[])
    {
        String s="I am Raju Bhojane";
        evenWord(s);

    }
}
