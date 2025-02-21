package Strings;

public class InsertStringBetween {
    public static String insertString(String originalString,String stringToBeInserted,int index )
    {
        int n=originalString.length();
        String newString=new String();

        for(int i=0;i<n;i++)
        {
            newString+=originalString.charAt(i);
            if(i==index)
            {
                newString+=stringToBeInserted;
            }
        }
        return newString;

    }
    public static void main(String args[])
    {
        String originalString = "GeeksGeeks"; 
        String stringToBeInserted = "For"; 
        int index = 4; 

        String s=insertString(originalString,stringToBeInserted,index);
        System.out.println(s);
    }
}
