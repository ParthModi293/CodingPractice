import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfAllLongs {

    private static List<Long> sumALl(List<Long> s) {

        long sum = 0;

        for(int i = 0; i < s.size(); i++){
            sum += s.get(i);
        }


        return Collections.singletonList(sum);
    }






    public static void main(String[] args) {

        List<Long> l = new ArrayList<>();

        l.add(10000L);
        l.add(20000L);
        l.add(20000L);
        l.add(20000L);



        System.out.println( sumALl(l));
    }


}
