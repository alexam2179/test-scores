/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testaverage;

/**
 *
 * @author class
 */
public class TestAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Declare and initialize test scores as int.
       int testScore1 = 90;
       int testScore2 = 80;
       int testScore3 = 50;
       
       //TODO: Display each test score, one per line.
       System.out.println("The score for test one is: " + testScore1);
       System.out.println("The score for test one is: " + testScore2);
       System.out.println("The score for test one is: " + testScore3);
       
       int sum = testScore1 + testScore2 + testScore3 ;
       //TODO: Calculate the average of the test scores
       double average = sum/ 3;
       
       //TODO: Output the average
       System.out.println("The average test score is " + average);
       
    }
    
}
