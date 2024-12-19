import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLargeestAndCount {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here



        if (candles == null || candles.isEmpty()) {

            return 0;
        }

        List<Integer> collect = candles.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);


        TreeMap<Integer, Long> collect1 =  collect.stream().collect(Collectors.groupingBy(c -> c,TreeMap::new, Collectors.counting()));
        System.out.println(collect1);


        Integer i = collect1.lastKey();
        long l = collect1.get(i);


        return (int) l ;
    }

    public static void main(String[] args) {


        List<Integer> i = Arrays.asList(18,90,90,13,90,75,90,8,90,43);

        System.out.println(birthdayCakeCandles(i));

    }
}
