import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {


        List<String> s = Arrays.asList("Hello","Hello","Iam","Iam","hello");

        Set<String> collect = s.stream().collect(Collectors.toSet());
        System.out.println(collect);

    }
}
