import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class circularArray {








    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        List<Integer> res = new ArrayList<>();


        List<Integer> rotatedList = new ArrayList<>();

        int n = a.size();

        k= k % n;

        rotatedList.addAll(a.subList(n-k,n));

        System.out.println(rotatedList);


        rotatedList.addAll(a.subList(0,n-k));

        System.out.println(rotatedList);

        for(int i=0; i < queries.size();i++){

           res.add(rotatedList.get(queries.get(i)));


        }



return res;

    }





    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(3,4,5);
        List<Integer> q = Arrays.asList(1,2);

        System.out.println( circularArrayRotation(a,2,q));

    }
}


