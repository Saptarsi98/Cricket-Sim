/*
The InningsChecker Object.This checks the conditions pertaining to the innings 
like win,loss,over completion.

Variables(Properties):
int innings_num: The innings number
String batting_team: The current batting team name
String bowling_team: The current bowling team name
int previous_innings_score: The previous innings score(if any)

Functions(Behaviour):
boolean check(int current_innings_score,int current_wickets,int current_balls): This checks the conditions pertaining to the innings 
like win,loss,over completion.

*/
public class InningsChecker {
    int innings_num;
    String batting_team;
    String bowling_team;
    int previous_innings_score;
    InningsChecker(int innings_num,String batting_team,String bowling_team,int previous_innings_score){
        this.innings_num=innings_num;
        this.previous_innings_score=previous_innings_score;
        this.batting_team=batting_team;
        this.bowling_team=bowling_team;
    }
    public boolean check(int current_innings_score,int current_wickets,int current_balls){
    if((current_wickets==10||current_balls==120)&&innings_num==1){
        System.out.println(bowling_team+" needs "+(current_innings_score+1)+" runs to win");
        return true;   
    }
    else if(current_wickets==10&&innings_num==2){
        System.out.println(bowling_team+" won by "+(previous_innings_score-current_innings_score)+"runs");
        return true;
    }
    if(current_innings_score>previous_innings_score&&innings_num==2){
        System.out.println(batting_team+" won by "+(10-current_wickets)+" wickets");
        return true;  
    }
    else if(current_innings_score<previous_innings_score&&current_balls==120&&innings_num==2){
        System.out.println(bowling_team+"won by "+((previous_innings_score-current_innings_score)+" runs"));
        return true;
    }
    else if(current_innings_score==previous_innings_score&&current_balls==120&&innings_num==2){
        System.out.println("Match Tied");
        return true;
    }
    return false;
}
}
