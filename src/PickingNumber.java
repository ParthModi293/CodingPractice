import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumber {

    public static int pickingNumbers(List<Integer> a) {
        // Frequency array to count occurrences of each number
        int[] frequency = new int[101];

        // Fill frequency array
        for (int num : a) {
            frequency[num]++;
        }

        int maxLength = 0;

        // Iterate through the frequency array
        for (int i = 1; i < frequency.length; i++) {
            // Combine current and previous number's frequency if absolute difference is 1
            maxLength = Math.max(maxLength, frequency[i] + frequency[i - 1]);
        }

        return maxLength;



    }

    public static void main(String[] args) {


        List<Integer> a = Arrays.asList(1 ,2, 2 ,3, 1, 2);

        System.out.println(pickingNumbers(a));



    }
}
