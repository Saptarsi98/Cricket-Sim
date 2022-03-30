class cricketmatch{
    public static void main(String args[])throws Exception{
        InningsChecker first_innings_checker=new InningsChecker(1,"Team 1","Team 2",0);
        Innings first_innings=new Innings(1,20,"Team 1", "Team 2",first_innings_checker);
        first_innings.play();
        InningsChecker second_innings_checker=new InningsChecker(2,"Team 2","Team 1",first_innings.getscore());
        Innings second_innings=new Innings(2,20,"Team 2", "Team 1",second_innings_checker);
        second_innings.play();
    }
}