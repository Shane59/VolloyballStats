

//necessary imports for file i/o
import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Stats here.
 * 
 * Shinya Aoi
 * Novemner 5th
 */
public class Stats {
    public static void main(String[] args) throws IOException{  
        // Scanner and PrintWrite must be declared outside the try block
        // otherwise their scope will be limited to within the block 
       Scanner inputFile = null;
       
       double total = 0.0;
       double ave = 0.0;
       double max = Integer.MIN_VALUE;
       double min = Integer.MAX_VALUE;
        
       int lineCounter = 0;
       
       int negNum = 0;
       int btw0and100 = 0;
       int geq100 = 0;
       
       
       
       
       
        // need to import file library for this style
        //File file = new File("C:\\Users\\Morteza\\Documents\\BlueJ Projects\\fileIn.txt");
        
       try {
            //Your turn!
            //fis = new FileInputStream(file);    // File being delcred as path
         inputFile = 
         new Scanner ( new FileInputStream ("fileIn.txt"));
           
         
            while(inputFile.hasNextDouble()) {
            //total = inputFile.nextDouble();    
            double randomNumbers = inputFile.nextDouble();        
            total = total + randomNumbers;  
                
                //System.out.println("next number = " + randomNumbers);
            
            lineCounter++; // increment # of line
            
            if (randomNumbers < min){
                min = randomNumbers;
            }
            if (randomNumbers > max){
                max = randomNumbers;
            }
            
            if(randomNumbers >= 0 && randomNumbers < 100 ){
                btw0and100++;  
            }
            else if( randomNumbers >= 100){
                geq100++; 
                
            }
            else if( randomNumbers < 0){
                negNum++;
            }
            
           } 
           ave = total / lineCounter;
           
           System.out.println( " average: " + ave +
                "  max:" +  max + "  min: " + min );
            System.out.println(" Total lines are = " +
                lineCounter + " <negNum> = " + negNum +
                " <btw0and100> = " + btw0and100 + " <geq100> = " +
                geq100 );
                
        }
         catch (IOException e) {
              System.out.println("File not found.");
              System.exit(0);
         } finally {
             if(inputFile != null)
             inputFile.close();
             }
           
       display(ave, max, min, lineCounter, negNum, btw0and100, geq100);
      }

public static void display (double ave, double max, double min, int lineCounter, int negNum, int btw0and100, int geq100){
    
    PrintWriter output = null;
    
   try {
       output = new PrintWriter 
        (new FileOutputStream ("fileOut.txt"));

       output.println("average: " + ave);
       output.println("max: " + max);
       output.println("min " + min);
  } catch (IOException e) {
    System.out.println(" Sorry, we cannot locate the file!");
            System.exit(0);
  } finally {
        if (output != null)
            output.close();
    } 
    
}
}
