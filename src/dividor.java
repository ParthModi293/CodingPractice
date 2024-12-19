import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dividor {

    public static int findDigits(int n) {

        String numString = Integer.toString(n);

        int[] digits = numString.chars()
                .map(Character::getNumericValue)
                .toArray();
        int count=0;
        for(int i=0; i < digits.length;i++){


            if(digits[i] !=0){
                if(n % digits[i]  == 0 ){
                    count++;
                }
            }


        }




        return  count;

    }




    public static void main(String[] args) {

        System.out.println(findDigits(10));


    }
}
