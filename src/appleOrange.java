import java.util.Arrays;
import java.util.List;

public class appleOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appCount=0;
        int orangCount=0;

        for (Integer apple : apples) {
            if ((a + apple) >= s && (a + apple) >= t) {
                appCount++;
            }
        }

        for (Integer orange : oranges) {
            if ((b + orange) >= s && (b + orange) >= t) {
                orangCount++;
            }
        }
        System.out.println(appCount);
        System.out.println(orangCount);




    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(-2,2,1);
        List<Integer> o = Arrays.asList(5,-6);

        countApplesAndOranges(7,11,5,15,a,o);


    }
}
