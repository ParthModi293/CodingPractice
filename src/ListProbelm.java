import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProbelm {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> final1 = new ArrayList<>();
        int countFora =0;
        int countForb =0;
        int countForSame =0;

        for(int i=0; i < a.size();i++){




                if(a.get(i)> b.get(i)){
                    countFora++;

                    if(final1.isEmpty()){
                    final1.add(0,countFora);
                    }else{
                        final1.set(0,countFora);
                    }


                }

                if(a.get(i)<b.get(i)){
                    if(final1.isEmpty()){
                        final1.add(0,0);
                    }

                    countForb++;

                    if(final1.get(0) != null){

                        if(final1.get(1) != null){
                            final1.set(1, countForb);
                        }

                        final1.add(1, countForb);

                    }

                }

                if(a.get(i) == b.get(i) ){

                    if(final1.isEmpty()){
                        final1.add(0,0);
                    }
                    else {

                        if(final1.get(1) == null){
                            final1.add(1, countForSame);
                        }else{
                            final1.set(1,0);
                        }


                    }


                }


        }

        return final1;






    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(10,12,50);
        List<Integer> b  = Arrays.asList(20,20,10);

        System.out.println(compareTriplets(a,b));

    }
}
