/** ****************************************************************************
 * FullTimeDriver.java
 * Kevin Bell
 *
 * This is a base class for an inheritance hierarchy.
 **************************************************************************** */
package inheritancexample;

public class Person {

    private String name = "";
//******************************************************************************

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
//******************************************************************************
    public String getName(){
        return this.name;
    }
} // end Person class
