public class jumpingCloud {

    static int jumpingOnClouds(int[] c, int k) {


//        (i+k)%n

        int length = c.length;
        int power=100;
        int i =0;

 do{

     i = (i +k)%length;
     power--;

     if(c[i]==1){
         power-=2;
     }


 }while (i!=0);






        return power;


    }
    public static void main(String[] args) {

        int[] c = new int[]{1 ,1 ,1, 0, 1 ,1 ,0, 0, 0 ,0};
        System.out.println(jumpingOnClouds(c,3));

    }
}
