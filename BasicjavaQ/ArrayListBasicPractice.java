package BasicjavaQ;
import java.util.ArrayList;
public class ArrayListBasicPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(10);

        list.add(20);

        list.add(1,40);
        list.add(1,30);
        list.add(2,90);

        list.set(3, 70);

        for(int num:list)
        {
            System.out.println(num);
        }


        
    }
}
