import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sequence {

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here

        HashMap<Integer, Integer> h = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int i=0; i < p.size(); i++){

            h.put(p.get(i), i+1);

        }

        for(int i=0; i < p.size();i++){
            res.add(i, h.get(h.get(i+1)));
        }








        return res;
    }

    public static void main(String[] args) {

        List<Integer> p = Arrays.asList(5,2,1,3,4);
        System.out.println(permutationEquation(p));

    }
}
