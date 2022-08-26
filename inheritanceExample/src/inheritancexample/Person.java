/** ****************************************************************************
 * Person.java
 * Kevin Bell
 *
 * This is a base class for an inheritance hierarchy.
 **************************************************************************** */
package inheritancexample;

public class Person {

    private String name = "";
//******************************************************************************

    public Person() {
    } // end zero-parameter constructor

    public Person(String name) {
        this.name = name;
    } // end constructor
//******************************************************************************

    public String getName() {
        return this.name;
    }
} // end Person class
