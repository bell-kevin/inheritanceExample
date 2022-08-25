/** ****************************************************************************
 * FullTimeDriver.java
 * Kevin Bell
 *
 * This describes a full-time employee.
 **************************************************************************** */
package inheritancexample;

public class fullTimeDriver {

    public static void main(String[] args) {
        FullTime fullTimer = new FullTime("Moses", 5733, 80000);
        
        fullTimer.display();
        System.out.println(fullTimer.getName());
    } // end main method
} // end fullTimeDriver class