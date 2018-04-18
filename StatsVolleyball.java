
import java.io.*;
/**
 * Write a description of class StatsVolleyball here.
 *
 * Shinya Aoi
 * 12/8/17
 */
public class StatsVolleyball
{
    /*
     * Private variables are here.
     */
    private Games games;
    private double[] probOne = new double[2];
    private double[] probTwo = new double[2];
    private double[] probThree = new double[2];
    private double[] probFour = new double[2];
    private double[] probFive = new double[2];
    private double[] probSix = new double[2];
    private double[] fullStatsOne = new double[5];
    private double[] fullStatsTwo = new double[5];
    private double[] fullStatsThree = new double[5];
    private double[] fullStatsFour = new double[5];
    private double[] fullStatsFive = new double[5];
    private double[] fullStatsSix = new double[5];
    /*
     * Default constructor.
     */
    public StatsVolleyball(){
        
        games = new Games();
        winner();
        games.getHittingTotal();
        games.getHittingKills();
        games.getHittingErrors();
        probOfHKOne();
        probOfHKTwo();
        probOfHKThree();
        probOfHKFour();
        probOfHKFive();
        probOfHKSix();
        probOfHEOne();
        probOfHETwo();
        probOfHEThree();
        probOfHEFour();
        probOfHEFive();
        probOfHESix();
        combineArray(games.getTeamOneStats(),fullStatsOne, probOne);
        combineArray(games.getTeamTwoStats(),fullStatsTwo, probTwo);
        combineArray(games.getPlayerThree(),fullStatsThree, probThree);
        combineArray(games.getPlayerFour(),fullStatsFour, probFour);
        combineArray(games.getPlayerFive(),fullStatsFive, probFive);
        combineArray(games.getPlayerSix(),fullStatsSix, probSix);
        
    }
    /*
     * Output method to output on the screen.
     */
    public void output(){
       System.out.println();
       System.out.println("Here is the statistics of your data: ");
       System.out.println();
        
       
       System.out.println("HT = Hitting total, HK = Hitting kills"+
                "\nPHK = Probability of hitting kills, and PHE = Probability of hitting errors.");
       System.out.println("--------------------------------------");
       System.out.println("          HT  HK  HE  PHK   PHE");
       System.out.printf("%-10s", games.getHomeTeam());
       for (int i=0; i<fullStatsOne.length; i++){
           if (i < 3)
           System.out.printf("%.0f  ", fullStatsOne[i]);
           else
           System.out.printf("%3.2f  ", fullStatsOne[i]);
           
       }
       System.out.println();
       System.out.printf("%-10s", games.getAgainstTeam());
       for (int i=0; i<fullStatsOne.length; i++){
           if (i < 3)
           System.out.printf("%.0f  ", fullStatsTwo[i]);
           else
           System.out.printf("%3.2f  ", fullStatsTwo[i]);
        } 
       System.out.println();
       System.out.println("--------------------------------------");
         
    }
    /*
     * Another output method that output in a file.
     */
    public void output(PrintWriter file){
       
       file.println("Here is the statistics of your data: ");
       file.println();
        
       
       file.print("HT = Hitting total, HK = Hitting kills");
       file.println("PHK = Probability of hitting kills, and PHE = Probability of hitting errors.");
       file.println("--------------------------------------");
       file.println("          HT  HK  HE  PHK   PHE");
       file.printf("%-10s", games.getHomeTeam());
       for (int i=0; i<fullStatsOne.length; i++){
           if (i < 3)
           file.printf("%.0f  ", fullStatsOne[i]);
           else
           file.printf("%3.2f  ", fullStatsOne[i]);
           
        }
       file.println();
       file.printf("%-10s", games.getAgainstTeam());
       for (int i=0; i<fullStatsOne.length; i++){
           if (i < 3)
           file.printf("%.0f  ", fullStatsTwo[i]);
           else
           file.printf("%3.2f  ", fullStatsTwo[i]);
        } 
       file.println();
       file.println("--------------------------------------");
       
    }
    /*
     * A method that to cobine two arrays.
     * the first array is from Games class.
     * the second array is from this class.
     */
    private void combineArray(double[] basicStats,
                        double[] fullStats, double[] prob){
        
        for (int i=0; i<basicStats.length; i++){
             fullStats[i] = basicStats[i];
        }
        fullStats[3] = prob[0];
        fullStats[4] = prob[1];
        
    }
    
    /*
     * Find the winner with using if else statement.
     * and print out the winner.
     */
    public void winner(){
        
        if (games.getScoreOne() > games.getScoreTwo()){
            System.out.println("Winner is "+
                        games.getHomeTeam()+"!");
            System.out.println("Way to go!");
            System.out.println();
        }
        else{ 
        System.out.println("Winner is "+
                            games.getAgainstTeam()+"!");
        System.out.println("Way to go!"); 
        System.out.println();
        }
        
    }
    /*
     * get the probability of hitting total of team one.
     */
    public void probOfHKOne(){
        probOne[0] = games.getTeamOneHK()/games.getTeamOneHT();
    }
    /*
     * Calculating the second team's probability of hitting kills.
     */
    public void probOfHKTwo(){
        probTwo[0] = games.getTeamTwoHK()/games.getTeamTwoHT();
    }
    /*
     * get the probability of hitting total of team one.
     */
    public void probOfHKThree(){
        probThree[0] = games.getPlayerThreeHK()/games.getPlayerThreeHT();
    }
    /*
     * get the probability of hitting total of team one.
     */
    public void probOfHKFour(){
        probFour[0] = games.getPlayerFourHK()/games.getPlayerFourHT();
    }
    /*
     * get the probability of hitting total of team one.
     */
    public void probOfHKFive(){
        probFive[0] = games.getPlayerFiveHK()/games.getPlayerFiveHT();
    }
    /*
     * get the probability of hitting total of team one.
     */
    public void probOfHKSix(){
        probSix[0] = games.getPlayerSixHK()/games.getPlayerSixHT();
    }
    /*
     * Getting the probability of first team's hitting errors.
     */
    public void probOfHEOne(){
        probOne[1] = games.getTeamOneHE()/games.getTeamOneHT();
    }
    /*
     * Getting the probability of second team's hitting errors.
     */
    public void probOfHETwo(){
        probTwo[1] = games.getTeamTwoHE()/games.getTeamTwoHT();
    }
    /*
     * Getting the probability of second team's hitting errors.
     */
    public void probOfHEThree(){
        probThree[1] = games.getPlayerThreeHE()/games.getPlayerThreeHT();
    }
    /*
     * Getting the probability of second team's hitting errors.
     */
    public void probOfHEFour(){
        probFour[1] = games.getPlayerFourHE()/games.getPlayerFourHT();
    }
    /*
     * Getting the probability of second team's hitting errors.
     */
    public void probOfHEFive(){
        probFive[1] = games.getPlayerFiveHE()/games.getPlayerFiveHT();
    }
    /*
     * Getting the probability of second team's hitting errors.
     */
    public void probOfHESix(){
        probSix[1] = games.getPlayerSixHE()/games.getPlayerSixHT();
    }
}
