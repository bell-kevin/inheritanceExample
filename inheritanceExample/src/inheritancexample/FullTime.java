/** ****************************************************************************
 * FullTime.java
 * Kevin Bell
 *
 * This class describes a full-time employee.
 **************************************************************************** */
package inheritancexample;

public class FullTime extends Employee {

    private double salary = 0.0;
//******************************************************************************

    public FullTime() {
    }

    public FullTime(String name, int id, double salary) {
        super(name, id); // This calls the two-parameter Employee constructor.
        this.salary = salary;
    }
//******************************************************************************

    @Override
    public void display() {
        super.display();
        System.out.printf("salay: $%,.0f\n", salary);
    }
} // end FullTime class
