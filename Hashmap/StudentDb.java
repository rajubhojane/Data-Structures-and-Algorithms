package Hashmap;
import java.util.HashMap;
import java.util.Map;

public class StudentDb {
    public static void main(String[] args) {
        HashMap<Integer ,String > studentdb=new HashMap<>();
        studentdb.put(101,"Raju");
        studentdb.put(102,"Neha");

        System.out.println("Student Roll Number & Names :");
        for(Map.Entry<Integer,String> entry:studentdb.entrySet()){
            System.out.println("Roll No :"+entry.getKey() + " , Name :"+ entry.getValue());
        }
    }
}
