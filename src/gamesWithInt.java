public class gamesWithInt {

    public static int beautifulDays(int a, int b, int k) {

        int size = ( b - a )+1;
    //    System.out.println(size);

        int[] arr = new int[size];
        int[] arrRs = new int[size];
        double[] sumArr = new double[size];
        int count =0;



            int index=0;
        for(int i=a; i<=b ;i++ ){



            arr[index] =  i;
            arrRs[index] =  reverse(i);
            index++;

        }

//        for(int num : arr){
//            System.out.println("Input array  "+num);
//        }
//
//        for(int num1 : arrRs){
//            System.out.println("Input array Reverse  "+num1);
//        }

        for(int i=0; i<arr.length;i++){

            sumArr[i] = (double) Math.abs (arr[i] - arrRs[i])/k ;

            if(sumArr[i] == Math.floor(sumArr[i])){
                count++;
            }


        }

//        for(double num1 : sumArr){
//            System.out.println("float array Reverse  "+num1);
//        }



        return count;


    }






    public static int reverse(int a){

        int revese=0;

        while (a != 0 ){

            int digit = a % 10;
             revese = (revese *10) + digit;
             a = a/10;
        }


        return revese;
    }

    public static void main(String[] args) {

        System.out.println("Helo "+beautifulDays(20,23,6));
       // System.out.println(reverse(120));



    }
}
