import java.util.ArrayList;

class ArrayListOp{
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list)
    {
        
        for(int i=list.size()-1;i>=0;i--)
        {
        System.out.print(list.get(i)+" ");

        }
        return list;


    }

    
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(50);
        list.add(100);
        list.add(150);

        // for(int i=0;i<list.size();i++)
        // {
        // System.out.println(list.get(i));
        // }
        // System.out.println(list.isEmpty());
        // System.out.println(list.contains(50));
        ArrayListOp.reverseList(list);
       


    }
}