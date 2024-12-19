import java.util.ArrayList;
import java.util.List;

public class CharacterProblem {
    public static void main(String[] args) {


        char[] input = {'a', 'a', 'b', 'c', 'c', 'c', 'c', 'd', 'd', 'b'};

        List<List<Character>> result = new ArrayList<>();

        List<Character> temp = new ArrayList<>();

        for(int i=0; i<input.length;i++){
            if(!temp.isEmpty() &&  ( temp.get(0) != input[i] || temp.size()==3 ) )     {

            result.add(new ArrayList<>(temp));
            temp.clear();

            }


            temp.add(input[i]);

        }


        System.out.println(result);





    }
}
