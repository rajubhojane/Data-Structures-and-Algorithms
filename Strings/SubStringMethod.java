package Strings;

public class SubStringMethod {
    public static String subStringmethod(String str,int sid,int eid)
    {
        String newsubString="";
        for(int i=sid;i<=eid;i++)
        {
            newsubString+=str.charAt(i);

        }
        return newsubString;
    }
    public static void main(String args[])
    {
     String s="HelloWorld";
     System.err.println(subStringmethod(s, 0, 4));

    }
}
