import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class climibingLeaderboard {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>(ranked);
        List<Integer> newRanked = new ArrayList<>(set);
        List<Integer> playerRank = new ArrayList<>();
        for(int i=0,j=newRanked.size()-1; i<player.size();){
            if( j>=0 && player.get(i)>=newRanked.get(j) ){
                j--;
            }else{
                playerRank.add(j+2);
                i++;
            }
        }
        return playerRank;
    }


    public static void main(String[] args) {

        List<Integer> ranked= Arrays.asList(100, 100, 50, 40 ,40, 20 ,10);
        List<Integer> player= Arrays.asList(5 ,25, 50, 120);

        System.out.println(climbingLeaderboard(ranked,player));

    }
}
