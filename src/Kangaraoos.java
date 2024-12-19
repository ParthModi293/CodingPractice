public class Kangaraoos {

    public static String kangaroo(int x1, int v1, int x2, int v2) {


        if(x2 > x1){
            if(v2>v1){
                return "NO";
            }else{

                int sum1 = x1+v1;

                int sum2 = x2+v2;
                if(sum1%sum2==0 || sum2%sum1==0|| sum1%sum2== Math.abs(v1-v2)|| sum2%sum1== Math.abs(v1-v2) ){
                    return "YES";

                }
                return "NO";

            }
        }


            int sum1 = x1+v1;

            int sum2 = x2+v2;

            if(sum1%sum2==0 || sum2%sum1==0 || sum1%sum2== Math.abs(v1-v2)|| sum2%sum1== Math.abs(v1-v2)  ){
                return "YES";

            }
                return "NO";








    }

    public static void main(String[] args) {

//        System.out.println(kangaroo(0,3,4,2));
        System.out.println(kangaroo(14,4,98,2));


    }
}
