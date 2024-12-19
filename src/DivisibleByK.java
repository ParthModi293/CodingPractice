import java.util.Arrays;
import java.util.List;

public class DivisibleByK {


    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count=0;


        for(int i =0; i < n; i++){

            for(int j=0; j<n;j++) {

                if(i != j){
                if ( (ar.get(i) + ar.get(j)) % k == 0) {

                    count++;
                }}
            }


        }


        return count/2;

    }



    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1 ,3, 2 ,6, 1, 2);

        System.out.println(divisibleSumPairs(6,3,a));








    }
}
