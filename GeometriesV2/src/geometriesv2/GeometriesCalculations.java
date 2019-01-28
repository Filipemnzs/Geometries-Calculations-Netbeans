/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~
* <pre>
* Class             Geometries
* File              Geometries.java
* Description       This class gets called to do any calculations for any of 
                    the tabs selected.
* @author           <i>Filipe Menezes</i>
* Enviroment        PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
* Date              01/8/2019
* @version          1.0.0
* History Log
* @see              java.awt.Toolkit;
* @see              java.awt.Color;
* @see              java.lang.Float.parseFloat;
* @see              java.text.DecimalFormat;
* @see              java.text.SimpleDateFormat;
* @see              java.util.Date;
* @see              javax.swing.JOptionPane;

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~ */


package geometriesv2;

public class GeometriesCalculations {
    

    static double getDiscriminat(double a, double b, double c){
    /*Gets the 3 inputs and returns the discriminant of the Quadratic equation
    @author     Filipe Menezes
    @param      a - coeficient of squared variable
    @param      b - coeficient of second variable
    @param      c - positive or negative constant being added
    */

        double discriminant = (b * b) - (4 * a * c);
       
       return(discriminant);
    }
    
   
    static double getCramerX (double a1, double b1, double c1, double a2, 
            double b2, double c2){
    /*Gets 6 inputs and returns the Y value of the point using Cramer's Rule
    @author     Filipe Menezes
    @param      a1 - a1 variable in cramers equation
    @param      b1 - b1 variable in cramers equation
    @param      c1 - c1 variable in cramers equation
    @param      a2 - a2 variable in cramers equation
    @param      b2 - b2 variable in cramers equation
    @param      c2 - c2 variable in cramers equation
    @return     x - returns the y value os the point
    */    
       
        double d = (a1 * b2) - (b1 * a2);
        double dx = (c1 * b2) - (b1 * c2);
            
        double x = dx / d;
        
        return(x);
    }
    

    static double getCramerY(double a1, double b1, double c1, double a2, 
            double b2, double c2){
    /*Gets 6 inputs and returns the Y value of the point using Cramer's Rule
    @author     Filipe Menezes
    @param      a1 - a1 variable in cramers equation
    @param      b1 - b1 variable in cramers equation
    @param      c1 - c1 variable in cramers equation
    @param      a2 - a2 variable in cramers equation
    @param      b2 - b2 variable in cramers equation
    @param      c2 - c2 variable in cramers equation
    @return     y - returns the y value os the point
    */
            double d = (a1 * b2) - (b1 * a2);
            double dy = (a1 * c2) - (c1 * a2);
            
            double y = dy / d;
        
        return(y);
    }
    
    

    static double getDenominator(double x1, double x2, double x3, double x4, 
            double y1, double y2, double y3, double y4){
    /*Gets the 8 inputs and returns the denominator value for the intersecting lines    
    @author     Filipe Menezes
    @param      x1 - x-coordinate of first point
    @param      y1 - y-coordinate of first point
    @param      x2 - x-coordinate of second point
    @param      y2 - y-coordinate of second point
    @param      x3 - x-coordinate of third point
    @param      y3 - y-coordinate of third point
    @param      x4 - x-coordinate of fourth point
    @param      y4 - y-coordinate of fourth point
    @return     denominator - returns the denominator of the equation
    */    
        double denominator = ((x1 - x2) * (y3 - y4)) - ((y1 - y2) * (x3 - x4));
        
        return (denominator);
    }
    


    static double getDistanceCirc(double x1, double x2, double y1, double y2){
    /*Gets the 4 inputs and calculates the distance between the 2 center points using the distance equation
    @author     Filipe Menezes
    @param      x1 - x-coordinate of first point
    @param      y1 - y-coordinate of first point
    @param      x2 - x-coordinate of second point
    @param      y2 - y-coordinate of second point
    @return     distance - the distance between the 2 lines
    */
    
    
    //Using the distance equation to find the distance betweent the two points
        double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 -y2) * (y1 - y2), 0.5);
        
        return (distance);
    }



    static double getPythegeoran(double a, double b, double c){
    /*Gets 3 inputs then decides what variable to solve for then returning the answer
    @author Filipe Menezes
    @param  a - coefficient of squared variable
    @param  b - coefficient of second variable
    @param  c - last term in the equation
    @return py - the result of the desired variable
    */        
        double py = 0;
        
        if (a > 0 && b > 0){
            py = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        }
       
        else if (a > 0 && c > 0){
            py = Math.sqrt(Math.pow(a, 2) - Math.pow(c,2));
        }
        
        else{
            py = Math.sqrt(Math.pow(b, 2) - Math.pow(c, 2));
        }
            
        return(py);
    }

 
}