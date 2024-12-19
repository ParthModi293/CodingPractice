import java.util.*;

public class designerPdfViewerExm {

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here

        int length = word.length();

        List<Integer> a= new ArrayList<>();

        for(char c:word.toCharArray()){

            a.add(c-'a');
      }

        List<Integer> b= new ArrayList<>();

        for(int val : a){

            int value = h.get(val);

            b.add(value);


        }

        Optional<Integer> max = b.stream().max(Comparator.naturalOrder());
        Integer i = null;
        if(max.isPresent()){
             i = max.get();
        }
        
        


        return i*length;

    }

    public static void main(String[] args) {

        List<Integer> h = Arrays.asList(1, 3 ,1, 3, 1, 4 ,1, 3 ,2 ,5, 5 ,5, 5, 5 ,5, 5, 5 ,5, 5 ,5, 5, 5, 5, 5, 5, 7
        );
        String s = "zaba";
        System.out.println(designerPdfViewer(h,s));

    }
}
