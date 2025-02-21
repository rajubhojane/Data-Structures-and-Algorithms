// package Strings;
// public class Palindrom {
//     public static boolean palindromString(String str)
//     {   

//        for(int i=0;i<str.length()/2;i++)
//        {
//         int n=str.length();

//         if(str.charAt(i)!=str.charAt(n-1-i)){
//             return false;
//         }
//        }
//        return true;
//     }
//     public static void main(String args[])
//     {
//       String str="racecar";
//       boolean p=palindromString(str);
//       System.out.println(p);
//     }
// }


package Strings;
public class Palindrom{

  public static boolean palindromstring(String str)
  {
     int n=str.length();
     boolean ispalindrom=true;
     for(int i=0;i<n/2;i++)
     {
      if(str.charAt(i)!=str.charAt(n-i-1))
      {
        ispalindrom=false;
      }
     }

     return ispalindrom;
  }
  public static void main(String[] args)
  {
   
    String s="Raju";
    boolean m=palindromstring(s);
    System.out.println(m);


  }
}

//leet code 1 

// class Solution {
//   public boolean isPalindrome(String s) {
//       String result=s.replaceAll("[^a-zA-Z0-9]","");
//       String s1=result.toLowerCase();
//       boolean ispalindrome=true;
//       int n=s1.length();
//       if(s.equals(" "))
//       {
//           return true;
//       }

//       for(int i=0;i<n/2;i++)
//       {
//           if(s1.charAt(i)!=s1.charAt(n-i-1))
//           {
//               ispalindrome=false;
//           }
//       }

//       return ispalindrome;
//   }
// }