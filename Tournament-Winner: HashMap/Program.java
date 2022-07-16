import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
    HashMap<String,Integer> map = new HashMap<String, Integer>();
    String finalWinningTeam= "";
    int highestScore=0;
    for(int i=0;i<competitions.size();i++){
      int competitionResult = results.get(i);
      String winningTeam=competitions.get(i).get(competitionResult == 0 ? 1:0);
      int oldScore= map.containsKey(winningTeam) ? map.get(winningTeam):0;
      int newScore = oldScore+3;
      if(newScore > highestScore){
        highestScore = newScore;
        finalWinningTeam = winningTeam;
    }
      map.put(winningTeam, newScore);
    }
    return finalWinningTeam;
  }
}
