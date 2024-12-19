import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class findSquares {

    public static int squares(int a, int b) {
        // Write your code here

      /*  int i = 0;
        List<Integer> abc = new ArrayList<>();
      while(i<b){

          int ans = i*i;
          abc.add(ans);
          i++;




      }
        System.out.println(abc);

        List<Integer> collect = abc.stream().filter(ab -> (ab >= a && ab <= b)).collect(Collectors.toList());


        return collect.size();*/

        int lowerBound = (int) Math.ceil(Math.sqrt(a));

        // Find the largest integer whose square is <= b
        int upperBound = (int) Math.floor(Math.sqrt(b));

        // Count the numbers in the range [lowerBound, upperBound]
        if (lowerBound > upperBound) {
            return 0; // No squares in the range
        }
        return upperBound - lowerBound + 1;

    }

    public static void main(String[] args) {

        System.out.println(squares(24,49));

    }
}
