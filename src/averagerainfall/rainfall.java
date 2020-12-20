
package averagerainfall;
import javax.swing.JOptionPane;

/**
 *
 * @author Shanell Spann
 */
public class rainfall {
    String userInput;
    int yearsOfRain = 0;
    int totalMonthsOfRain = 0;
    double inchesOfRain = -1; //initialized for validation check
    double totalInchesOfRain = 0;
    double averageRainfall;
    final int MONTHSINYEAR = 12;
    
    public void userInputInfo(){
        
        while(yearsOfRain < 1) // while loop. Validating user input to NOT accept a number of years less than 1. 
        {
            userInput = JOptionPane.showInputDialog("Greater than zero, How many years of rainfall would you like to analyze?");
            yearsOfRain = Integer.parseInt(userInput);
        }
        
        for( int year = 1; year <= yearsOfRain; year++) 
        // outer loop. year++ will loop as many times up to the # of user entry above.
        {
           for( int month = 1; month <= MONTHSINYEAR; month++) 
            // inner loop. month++ will loop up to 12 times as we 
            //declared the final variable MONTHSINYEAR = 12. 
           {
               while(inchesOfRain < 0)// while loop. Validating user input to NOT accept a NEGATIVE number for avg rain. 
               {
                   userInput = JOptionPane.showInputDialog("How many inches of rain did month # " 
                               + month + " receive in year " + year + "?");
                   inchesOfRain = Double.parseDouble(userInput);
               }
               totalMonthsOfRain = totalMonthsOfRain +1; // this line allows us to keep track of
                                                         // the total number of months so we may display to the user. 
               totalInchesOfRain = totalInchesOfRain + inchesOfRain; //similar as above comment.
               inchesOfRain = -1; //re-initializes this variable so validation check can still run successful.  
           } 
        }     
    }
    
    public void calculate()
    {
        averageRainfall = totalInchesOfRain / totalMonthsOfRain; // calculates the average
    }
    
    public void displayRainAverage()
    {
        JOptionPane.showMessageDialog(null, "Total Number of Months = " + totalMonthsOfRain 
                                            + "\nTotal Inches Of Rainfall = " + totalInchesOfRain
                                            + "\nAnnual Average Rainfall (per month) = " + averageRainfall);
        System.exit(0); //ends program
    }
    
}
