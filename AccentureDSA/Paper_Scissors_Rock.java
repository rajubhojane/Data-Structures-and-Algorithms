package AccentureDSA;

import java.util.Scanner;

public class Paper_Scissors_Rock {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        if(m=="Rock")
        {
            System.out.println("Paper");
        }else if(m=="scissor")
        {
           System.out.println("Rock");
        }else{
            System.out.println("scissor");
        }
    }
}
