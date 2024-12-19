import java.util.*;

public class CheckCount {

    public static List<Integer> migratoryBirds(List<Integer> arr) {

//
//        HashMap<Integer,Integer> h = new HashMap<>();
//
//        for(Integer a :arr){
//            h.put(a, h.getOrDefault(a,0)+1);
//        }
//
//        int maxElement = h.entrySet().stream()
//                .sorted((entry1, entry2) -> {
//                    // Compare by occurrences (values) in descending order
//                    int valueCompare = entry2.getValue().compareTo(entry1.getValue());
//                    if (valueCompare == 0) {
//                        // If occurrences are equal, compare keys in ascending order
//                        return entry1.getKey().compareTo(entry2.getKey());
//                    }
//                    return valueCompare;
//                })
//                .findFirst() // Get the first entry (highest occurrence, smallest key)
//                .map(Map.Entry::getKey) // Extract the key
//                .orElse(-1);
//
//        return maxElement;


        List<Integer> res= new ArrayList<>(arr);

       Collections.reverse(res);

       return res;






    }


    public static void main(String[] args) {

      List<Integer> a =  Arrays.asList(1,2,3,4);
        System.out.println(migratoryBirds(a));

    }
}
