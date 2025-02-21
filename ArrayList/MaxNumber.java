import java.util.ArrayList;
class MaxNumber{
    public static void main(String args[]){

        ArrayList<Integer> maxnum=new ArrayList<Integer>();
        maxnum.add(10);
        maxnum.add(20);
        maxnum.add(30);
        maxnum.add(40);
        maxnum.add(50);
      
        int max=Integer.MIN_VALUE;
        for(int i=0;i<maxnum.size();i++)
        {
            if(max<maxnum.get(i))
            {
                   max=maxnum.get(i);
            }
        }
        System.out.println(max);




        

    }
}