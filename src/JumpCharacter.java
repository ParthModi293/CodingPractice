import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JumpCharacter {

    public static int hurdleRace(int k, List<Integer> height) {

        List<Integer> collect = height.stream().sorted().collect(Collectors.toList());
        Integer i = collect.get(height.size()-1);

        collect.lastIndexOf(i);

        if(k<i){
            return i-k;
        }else{
            return  0;
        }


    }

    public static void main(String[] args) {


        List<Integer> h = Arrays.asList(2, 5 ,4 ,5, 2);
        System.out.println(hurdleRace(7,h));

    }
}
