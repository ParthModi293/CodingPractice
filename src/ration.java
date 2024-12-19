import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ration {


    public static void plusMinus(List<Integer> arr) {

        double first=0;
        double second=0;
        double third=0;

        for(int i =0; i <arr.size();i++){

            if(arr.get(i)>0){
                first++;
            }

            if(arr.get(i)<0){
                second++;
            }

            if(arr.get(i)==0){
                third++;
            }

        }

        double firstOne = first/arr.size();
        double firstSec = second/arr.size();
        double firstThird = third/arr.size();

        System.out.printf("%.6f%n",firstOne);
        System.out.printf("%.6f%n",firstSec);
        System.out.printf("%.6f%n",firstThird);





    }





    public static void main(String[] args) {


        List<Integer> input = Arrays.asList(1,2,3,0,-1,-2);

        plusMinus(input);

    }
}
