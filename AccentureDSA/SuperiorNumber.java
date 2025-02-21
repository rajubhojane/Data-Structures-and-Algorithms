package AccentureDSA;

public class SuperiorNumber {
    public static int superiorNumber(int arr[],int n)
    {
       int superior=Integer.MIN_VALUE;
       int count=0;
       for(int i=n-1;i>=0;i--)
       {
        if(arr[i]>superior){
        count++;
        superior=arr[i];
        }
       }
      return count;
    }
    public static void main(String[] args)
    {
        int arr[]={8,10,6,2,9,7};
        int n=arr.length;
        int m=superiorNumber( arr, n);
        System.out.println(m);

    }
}
