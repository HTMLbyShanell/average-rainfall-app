
package averagerainfall;

/**
 *
 * @author Shanell Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 3
 * Date:  10/10/2020
 * Description: Create a program that calculates the average rainfall for a number of years.
 * Purpose: Practice decision structures using nested loops to collect data & calculate averages.
 */
public class AverageRainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rainfall r = new rainfall();
        r.userInputInfo();
        r.calculate();
        r.displayRainAverage();
    }
    
}
