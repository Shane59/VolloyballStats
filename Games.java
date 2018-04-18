import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class AoiShinya_LastHW here.
 *
 * Shinya Aoi
 * december 8th, 2017
 * Volleyball staticts for teams
 */
public class Games
{
    /*
     * Variables are here
     */
    private Scanner keyboard;
    private String homeTeam;
    private String againstTeam;
    
    private double scoreOne;
    private double scoreTwo;
    
    private double[] teamOneStats = new double[3];
    private double[] teamTwoStats = new double[3];
    private double[] playerThree = new double[3]; //upgrading
    private double[] playerFour = new double[3];
    private double[] playerFive = new double[3];
    private double[] playerSix = new double[3];
    /*
     * Default constructor here.
     */ 
    public Games(){ 
        keyboard = new Scanner(System.in);
        getTeamNames();
        getScores();
    }
    /*
     * Also default constructor with existing file.
     */
    public Games(String file)throws FileNotFoundException{
        keyboard = new Scanner(new FileInputStream(file));
        getHittingTotal();
        getHittingKills();
        getHittingErrors();
    }
    /*
     * Get 2 team names to compare
     */
    public void getTeamNames(){
        System.out.println("Please enter your team name: ");
        homeTeam = keyboard.next();
        System.out.println("Please enter the other team's name: ");
        againstTeam = keyboard.next();
    }
    /*
     * Get their score.
     */
    public void getScores(){
        System.out.println("Please enter your team's score: ");
        scoreOne = keyboard.nextInt();
        System.out.println("Please enter other team's score: ");
        scoreTwo = keyboard.nextInt();
    }
    /*
     * Get total number of hitting for each team.
     */
    public void getHittingTotal(){
        System.out.println("How many times have your team hit?");
        teamOneStats[0]=keyboard.nextInt();
        System.out.println("How many times have the other team hit?");
        teamTwoStats[0]=keyboard.nextInt();
        System.out.println("How many times have the thirs player hit?");
        playerThree[0] = keyboard.nextInt(); //upgrading
        System.out.println("How many times have the fourth player hit?");
        playerFour[0] = keyboard.nextInt();
        System.out.println("How many times have the fifth player hit?");
        playerFive[0] = keyboard.nextInt();
        System.out.println("How many times have the sixth player hit?");
        playerSix[0] = keyboard.nextInt();
    }
    /*
     * Get number of points made by hitting.(Hitting kills)
     */
    public void getHittingKills(){
        System.out.println("How many times have your team kill?");
        teamOneStats[1]=keyboard.nextInt();
        System.out.println("How many times have the other team hit?");
        teamTwoStats[1]=keyboard.nextInt();
        System.out.println("How many times has the third player kill?");
        playerThree[1] = keyboard.nextInt(); //upgrading
        System.out.println("How many times has the fourth player kill?");
        playerFour[1] = keyboard.nextInt();
        System.out.println("How many times has the fifth player kill?");
        playerFive[1] = keyboard.nextInt();
        System.out.println("How many times has the sixth plaer kill?");
        playerSix[1] = keyboard.nextInt();
    }
    /*
     * Get number of hitting errors.
     */
    public void getHittingErrors(){
        System.out.println("How many times have your team hit error?");
        teamOneStats[2]=keyboard.nextInt();
        System.out.println("How many times have the other team hit error?");
        teamTwoStats[2]=keyboard.nextInt();
        System.out.println("How many times has the third player error?");
        playerThree[2] = keyboard.nextInt(); //upgrading
        System.out.println("How many times has the fourth player error?");
        playerFour[2] = keyboard.nextInt();
        System.out.println("How many times has the fifth player error?");
        playerFive[2] = keyboard.nextInt();
        System.out.println("How many times has the sixth player error?");
        playerSix[2] = keyboard.nextInt();
    }
    /*
     * Get first teams name.(getter)
     */
    public String getHomeTeam(){
        return homeTeam;
    }
    /*
     * Get second team's name.
     */
    public String getAgainstTeam(){
        return againstTeam;
    }
    /*
     * Get first team's score.
     */
    public double getScoreOne(){
        return scoreOne;
    }
    /*
     * Get second team's score.
     */
    public double getScoreTwo(){
        return scoreTwo;
    }
    /*
     * Get first team's hitting total.
     */
    public double getTeamOneHT(){
        return teamOneStats[0];
    }
    /*
     * Get second teams hitting total
     */
    public double getTeamTwoHT(){
        return teamTwoStats[0];
    }
    /*
     * Get third player's total.
     */
    public double getPlayerThreeHT(){
        return playerThree[0];
    }
    /*
     * Get third player's total.
     */
    public double getPlayerFourHT(){
        return playerFour[0];
    }
    /*
     * Get third player's total.
     */
    public double getPlayerFiveHT(){
        return playerFive[0];
    }
    /*
     * Get third player's total.
     */
    public double getPlayerSixHT(){
        return playerSix[0];
    }
    /*
     * Get first team's hitting kills
     */
    public double getTeamOneHK(){
        return teamOneStats[1];
    }
    /*
     * Get second team's hiiting kills
     */
    public double getTeamTwoHK(){
        return teamTwoStats[1];
    }
    /*
     * Get third plaer's hiiting kills
     */
    public double getPlayerThreeHK(){
        return playerThree[1];
    }
    /*
     * Get third plaer's hiiting kills
     */
    public double getPlayerFourHK(){
        return playerFour[1];
    }
    /*
     * Get third plaer's hiiting kills
     */
    public double getPlayerFiveHK(){
        return playerFive[1];
    }
    /*
     * Get third plaer's hiiting kills
     */
    public double getPlayerSixHK(){
        return playerSix[1];
    }
    /*
     * Get first team's hitting error
     */
    public double getTeamOneHE(){
        return teamOneStats[2];
    }
    /*
     * Get second team's hitting error
     */
    public double getTeamTwoHE(){
        return teamTwoStats[2];
    }
    /*
     * Get second team's hitting error
     */
    public double getPlayerThreeHE(){
        return playerThree[2];
    }
    /*
     * Get second team's hitting error
     */
    public double getPlayerFourHE(){
        return playerFour[2];
    }
    /*
     * Get second team's hitting error
     */
    public double getPlayerFiveHE(){
        return playerFive[2];
    }
    /*
     * Get second team's hitting error
     */
    public double getPlayerSixHE(){
        return playerSix[2];
    }
    /*
     * Get first temas stats
     */
    public double[] getTeamOneStats(){
        return teamOneStats;
    }
    /*
     * Get second team's stats.
     */
    public double[] getTeamTwoStats(){
        return teamTwoStats;
    }
    /*
     * Get second team's stats.
     */
    public double[] getPlayerThree(){
        return playerThree;
    }
    /*
     * Get second team's stats.
     */
    public double[] getPlayerFour(){
        return playerFour;
    }
    /*
     * Get second team's stats.
     */
    public double[] getPlayerFive(){
        return playerFive;
    }
    /*
     * Get second team's stats.
     */
    public double[] getPlayerSix(){
        return playerSix;
    }
}
