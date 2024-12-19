import java.util.Arrays;
import java.util.List;

public class Bonappetit {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

            int finalres = 0;
        int sum=0;
        for(int i=0; i < bill.size(); i++){

            sum = sum + bill.get(i);


        }

        finalres = (sum - bill.get(k))/2;

        if(finalres != b){

            System.out.println(b - finalres);
        }else{
            System.out.println("Bon Appetit");
        }

    }

    public static void main(String[] args) {


        List<Integer> a = Arrays.asList(3, 10, 2 ,9);
    bonAppetit(a,1,12);



    }
}
