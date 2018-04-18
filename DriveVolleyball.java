import java.io.*;
import java.util.*;
/**
 * Write a description of class DriveVolleyball here.
 *
 * Shinya Aoi
 * 12/8/17
 */
public class DriveVolleyball
{
    /*
     * Recalling the StatsVolleyball class.
     */
    static StatsVolleyball driver; 
    
    /*
     * Main method here.
     * Ask file name that a user wants to save as a file.
     * Usin try catch to print out in the file.
     * repeat the program until the user says no.
     */
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String conti = "";
        do{
            PrintWriter intoFile = null;
            System.out.println("Please put the name that you want to save your data:");
                
            String fileName = keyboard.nextLine();
            
            
            try{
                driver = new StatsVolleyball();
                intoFile = new PrintWriter(
                    new FileOutputStream(fileName));
                driver.output(intoFile);
                driver.output();
                System.out.println(
                    "Would you like to put another game? (enter y to continue)");
                conti = keyboard.next();
        
            }
            catch(IOException e){
                System.exit(0);
        }
        
        intoFile.close();
        }
        while(conti.equals("y"));
        
    }
}
