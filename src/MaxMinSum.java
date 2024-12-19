import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMinSum {


    public static void miniMaxSum(List<Integer> arr) {

        Long sum=0L;
        Long sumother=0L;
        int sumFinal=0;

        for(int i=0;i<arr.size();i++){

            sum += arr.get(i);


        }

     //   System.out.println(sum);

        List<Long> list = new ArrayList<>();

        for(int i=0; i<arr.size();i++){

            sumother = sum - arr.get(i);
            list.add(sumother);


        }


        List<Long> collect = list.stream().sorted().collect(Collectors.toList());

      //  System.out.println("Sorted List::"+collect);

        System.out.println(collect.get(0)+" "+collect.get(collect.size()-1));



    }

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5);

        miniMaxSum(l);



    }
}
