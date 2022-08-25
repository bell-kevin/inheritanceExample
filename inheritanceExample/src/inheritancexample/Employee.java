/** ****************************************************************************
 * FullTimeDriver.java
 * Kevin Bell
 *
 * This class describes an employee.
 **************************************************************************** */
package inheritancexample;

public class Employee extends Person {

    private int id = 0;
//******************************************************************************

    public Employee() {
    }

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }
//******************************************************************************

    public void display() {
        System.out.println("name: " + getName());
        System.out.println("id: " + id);
    }
} // end Employee class
