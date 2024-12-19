public class countVally {

    public static int countingValleys(int steps, String path) {


      int vally=0;
        int currentLevel=0;

      for(int i=0; i < path.length();i++){



          char c = path.charAt(i);

          if(c=='U'){
              currentLevel++;
          }else{
              currentLevel--;
          }

          if(currentLevel==0 && c=='U'){
              vally++;
          }




      }

      return vally;



    }

    public static void main(String[] args) {

        System.out.println(countingValleys(12,"DDUUDDUDUUUD"));

    }
}
