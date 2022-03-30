import java.util.Random;
/*
The Innings Object.Whenever an innings is played,an Innings object is invoked.
Variables(Properties):
int overs: The overs in the entire innings
String batting_team: The current batting team name
String bowling_team: The current bowling team name
int score: The current score
int wickets: The current wickets
int first_innings_score: The first innings score

Functions(Behaviour):
void play(int overs): This plays the entire innings ball by ball
boolean innings_checker(int score,int wickets,int balls): This checks the conditions for an innings 
to end(like a team winning a match,completion of overs etc)
int getscore(): This gives the score of an innings
int getwickets(): This gives the wickets of an innings
*/

public class Innings {
    int overs;
    String batting_team;
    String bowling_team;
    int score;
    int wickets;
    InningsChecker firstInningsChecker;
    Innings(int innings_num,int overs,String batting_team,String bowling_team,InningsChecker firstInningsChecker){
        this.overs=overs;
        this.batting_team=batting_team;
        this.bowling_team=bowling_team;
        score=0;
        wickets=0;
        this.firstInningsChecker=firstInningsChecker;
    }
    public void play()throws Exception{
        int runs[]={0,1,2,4,6,-1};
        int num=0;
        Random rand=new Random();
        for(int balls=1;balls<=overs*6;balls++){
            num=rand.nextInt(6);
            if(num==5)
            wickets++;
            else
            score+=runs[num];
            System.out.println(batting_team+":"+score+"/"+wickets);
            System.out.println("Overs:"+(balls/6)+"."+(balls%6));
            System.out.println();
            Thread.sleep(300);
            if(firstInningsChecker.check(score, wickets, balls))
            break;
            }
        }
    /*public boolean innings_checker(int score,int wickets,int balls){
        if((wickets==10||balls==120)&&innings_num==1){
            System.out.println(bowling_team+" needs "+(score+1)+" runs to win");
            return true;   
        }
        else if(wickets==10&&innings_num==2){
            System.out.println(bowling_team+" won by "+(first_innings_score-score)+"runs");
            return true;
        }
        if(score>first_innings_score&&innings_num==2){
            System.out.println(batting_team+" won by "+(10-wickets)+" wickets");
            return true;  
        }
        else if(score<first_innings_score&&balls==120&&innings_num==2){
            System.out.println(bowling_team+"won by "+(first_innings_score-score)+" runs");
            return true;
        }
        else if(score==first_innings_score&&balls==120&&innings_num==2){
            System.out.println("Match Tied");
            return true;
        }
        return false;
    }*/
    public int getscore(){
        return score;
    }
    public int getwickets(){
        return wickets;
    }
}
