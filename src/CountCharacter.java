import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {


        List<String> strings = Arrays.asList("Hello I am Parth");

        String s = String.join("", strings);

        Map<Character, Long> collect = s.chars().
                mapToObj(c -> (char) c).

                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);


    }
}
