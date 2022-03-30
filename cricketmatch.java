import java.util.*;
class cricketmatch{
    public static void main(String args[])throws Exception{
        int runs[]={0,1,2,4,6,-1};
        int num=0;
        int team1_score=0;
        int team1_wickets=0;
        Random rand=new Random();
        for(int i=1;i<=120;i++){
            num=rand.nextInt(6);
            if(num==5)
            team1_wickets++;
            else
            team1_score+=runs[num];
            System.out.println("Team 1:"+team1_score+"/"+team1_wickets);
            System.out.println("Overs:"+(i/6)+"."+(i%6));
            System.out.println();
            Thread.sleep(300);
            if(team1_wickets==10||i==120){
            System.out.println("Team 2 needs "+(team1_score+1)+" runs to win");
            break;
            }
        }
        int team2_score=0;
        int team2_wickets=0;
        for(int i=1;i<=120;i++){
            num=rand.nextInt(6);
            if(num==5)
            team2_wickets++;
            else
            team2_score+=runs[num];
            System.out.println("Team 2:"+team2_score+"/"+team2_wickets);
            System.out.println("Overs:"+(i/6)+"."+(i%6));
            System.out.println();
            Thread.sleep(300);
            if(team2_score>team1_score){
            System.out.println("Team2 won by "+(10-team2_wickets)+" wickets");  
            break;  
            }
            if(team2_wickets==10){
            System.out.println("Team1 won by "+(team1_score-team2_score)+" runs");
            break;
            }
            if(team2_score<team1_score&&i==120){
            System.out.println("Team1 won by "+(team1_score-team2_score)+" runs");
        }
        if(team2_score==team1_score&&i==120){
            System.out.println("Match Tied");
        }
        }
    }
}