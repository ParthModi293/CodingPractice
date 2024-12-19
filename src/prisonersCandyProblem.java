public class prisonersCandyProblem {

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here

        int temp=s+m-1;

        return   (temp%n);



    }

    public static void main(String[] args) {

        System.out.println(saveThePrisoner(3,7,3));



    }
}
