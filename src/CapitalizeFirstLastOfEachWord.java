import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CapitalizeFirstLastOfEachWord {








    public static void main(String[] args) {

        List<String> input = Arrays.asList("hello","Parth");


        List<String> collect = input.stream().map(CapitalizeFirstLastOfEachWord::capTheWord).collect(Collectors.toList());
      System.out.println(collect);




    }

    public static String capTheWord(String word){

        if(word == null || word.length()<2){
            return word != null ? word.toUpperCase():"";
        }

        return word.substring(0,1).toUpperCase() +
                word.substring(1,word.length()-1) +
                word.substring(word.length()-1).toUpperCase();
    }
}
