import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */





public class diagonalSum {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int left = 0;
        int right = 0;

        for(int i =0; i< arr.size();i++){

            left += arr.get(i).get(i);
            right += arr.get(i).get(arr.size()-1-i);




//
        }

//        for(int j=0; j<arr.size();j++){
//
////              right += arr.get(j).get(arr.size()-1-j);
//
//
//
//            }






        return Math.abs( left-right);

    }


    public static void main(String[] args) throws IOException {

        List<List<Integer>> l = new ArrayList<>();

        l.add(Arrays.asList(1, 2, 2));  // First inner list
        l.add(Arrays.asList(1, 3, 3));     // Second inner list
        l.add(Arrays.asList(1, 2, 3));


        System.out.println(diagonalDifference(l));




    }
}
