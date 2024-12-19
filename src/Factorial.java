import java.math.BigInteger;

public class Factorial {

    public static void extraLongFactorials(int n) {



        BigInteger result = calculateFactorial(BigInteger.valueOf(n));
        System.out.println(result);




    }

    private static BigInteger calculateFactorial(BigInteger n) {
        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(calculateFactorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
            extraLongFactorials(25);

    }
}
