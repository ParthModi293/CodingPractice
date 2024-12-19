import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class pairsExample {

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Long> collect = ar.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));


        List<Long> values = new ArrayList<>(collect.values());

        long res =0;

        for(int i =0; i < values.size();i++){

             res  = res +  values.get(i)/2;

        }


        return (int) res;

    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(10, 20 ,20 ,10, 10, 30 ,50 ,10 ,20);

        System.out.println(sockMerchant(9,a));

    }
}
