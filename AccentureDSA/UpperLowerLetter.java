package AccentureDSA;

public class UpperLowerLetter {
    public static void main(String args[])
    {
        String str="AbCdMnP";
        int lower=0;
        int upper=0;
        for(char ch:str.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
               upper++;
            }
            else{
                lower++;

            }
        }
        if(upper>lower)
        {
            str=str.toUpperCase();

        }
        else{
            str=str.toLowerCase();
        }

        System.out.println(str);
    }
}
