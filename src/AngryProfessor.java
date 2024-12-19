import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AngryProfessor {


    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here


        List<Integer> res =   a.stream().filter(c-> c <= 0 ).collect(Collectors.toList());
        System.out.println(res.size());


        if(res.size() >= k ){
            return "NO";
        }

        else{
            return "YES";
        }

    }

    public static void main(String[] args) {


        List<Integer> a = Arrays.asList(-1,-3,4,2);
        System.out.println(angryProfessor(3,a));




    }
}
