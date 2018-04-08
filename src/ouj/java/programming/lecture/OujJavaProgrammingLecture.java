/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ouj.java.programming.lecture;

/**
 * lecture of basic Java Programming
 * @author yuki-kikuya
 */
public class OujJavaProgrammingLecture {

    /**
     * main method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    /**
     * calculate average value.
     * @param elements array of elements
     * @return value of average 
     */
    private static double calcAverage(double[] elements) {
        
        // value of average
        double average = 0;
        
        // calculate average value.
        for(int n = 0; n < elements.length; n++) {
            average += elements[n];
        }
        
        average /= elements.length;
        
        return average;
        
    }
    
}
