import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProblem {
    public static List<Integer> arrayConstruction(int n, int s, int k)  {
        // Write your code here

        List<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));


        if(k==0){
            int value = s/n;

            if(value*n != s){

                List<Integer> res = new ArrayList<>();
                res.add(-1);

                return  res;

            }

            Collections.fill(result, value);
            return result;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            result.set(i, i);  // Fill with [0, 1, 2, ..., n-1]
            sum += i;
        }


//        if(s==0  && k==0){
//            List<Integer> z = new ArrayList<>();
//
//            for(int i=0;i<n;i++ ){
//                z.add(0);
//
//            }
//
//            return  z;
//
//        }
//
//        List<Integer> res =new ArrayList<>();
//
//        for(int i=0;i<n;i++){
//            res.add(i);
//        }
//
//        int currentSum = res.stream().mapToInt(Integer::intValue).sum();

        int different = s-sum;

        result.set(0,  result.get(0)+different );

        int absoluteSum=  calAbsoluteSum(result);

        if(absoluteSum != k){

            List<Integer> a = new ArrayList<>();

              a.add(-1);
              return a;


        }

        return result;






    }


    public static int calAbsoluteSum(List<Integer> res){

        int sum=0;

        for(int i=0; i <res.size(); i++){

            for(int j =i+1; j< res.size();j++){
                sum += Math.abs( res.get(i) - res.get(j) );
            }


        }

        return sum;

    }

    public static void main(String[] args) {


        System.out.println(arrayConstruction(5,10,8));

    }
}
