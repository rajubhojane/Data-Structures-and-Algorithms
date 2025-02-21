package Strings;


public class CharAtMethod {
    public void letterExtractionMethod(String str)
    {
        for(int i=0;i<str.length();i++)
        {
        System.out.print(str.charAt(i)+ " ");
        }
        
    }
    public static void main(String args[])
    {
        String str="Raju";
        CharAtMethod obj=new CharAtMethod();
        obj.letterExtractionMethod(str);

    }
}
