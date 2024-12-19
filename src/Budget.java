import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Budget {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
/*
        Long sum= 0L;

        List<Long> a = new ArrayList<>();

        for(int i=0; i < keyboards.length; i++){
            for (int j=0; j < drives.length; j++){



                    sum = sum + (keyboards[i] + drives[j]);
                    a.add(sum);
                sum=0L;





            }
        }

        System.out.println(a);
        List<Long> collect = a.stream().filter(s -> s < b).sorted().collect(Collectors.toList());

        if(collect.isEmpty()){
            return -1;
        }
        else{
        System.out.println(collect);

        Long i = collect.get(collect.size()-1);


        return Math.toIntExact(i);
        }*/



        int maxspent=-1;

        for(int k : keyboards){
            for (int d : drives ) {


                int sum = (k + d);

                if (sum <= b && sum > maxspent) {
                    maxspent = sum;
                }
            }}






        return maxspent;








    }

    public static void main(String[] args) {

        int k[]= new int[]{5,1,1};
        int d[]= new int[]{4};


        System.out.println(getMoneySpent(k,d,5));

    }
}
