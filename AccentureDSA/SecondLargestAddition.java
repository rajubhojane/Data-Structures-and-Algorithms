package AccentureDSA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class SecondLargestAddition {

    public static int LargeSmallSum(int arr[])
    {
        System.out.println("Function Execution Started......");
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
      Collections.sort(even);
      Collections.sort(odd);
     int k=even.get(even.size()-2)+odd.get(1);
      return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
        System.out.print("Enter Array Element : ");
           arr[i]=sc.nextInt();
        }

        System.out.println("Passing Array Data to LargeSmall Function->>>>>>>>>>>>>>>");
        System.out.println("Additon Of : "+LargeSmallSum(arr));
        
    }
}
