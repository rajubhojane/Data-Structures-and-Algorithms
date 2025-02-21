package AccentureDSA;
import java.lang.Math;
public class FloorProblem {

    public static double floorNumber(double N)
    {
        if(N>=1 && N<=9)
        {
            return N;
        }
        else if(N%2==0)
        {
            return ((N-2)/2);

        }
        else{
            return Math.floor(N/2);

        }
    }
    
    public static void main(String args[])
    {
        System.out.println(floorNumber(1));
        System.out.println(floorNumber(2));
        System.out.println(floorNumber(25.0d));
        System.out.println(floorNumber(98.0d));





    }
}
