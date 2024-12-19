import java.util.stream.IntStream;

public class liked {

    public static int viralAdvertising(int n) {
        // Write your code here
        return java.util.stream.IntStream.iterate(2, i -> i * 3 / 2)
                .limit(n)
                .sum();
    }
    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));

    }
}
