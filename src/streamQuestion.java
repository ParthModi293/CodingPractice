import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamQuestion {

    public static void main(String[] args) {


        List<Integer> l = Arrays.asList(2,5,1,9,7);

        List<Integer> collect = Collections.singletonList(l.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElseThrow());

        System.out.println(collect);



    }
}
