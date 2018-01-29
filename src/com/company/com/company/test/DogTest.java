package com.company.com.company.test;
import com.company.Dog;
import org.junit.Test;
/**
 * @author Adam Wojtkowksi
 * @version 1.0
 * 
 */
public class DogTest extends junit.framework.TestCase {
    @Test
    public void testSomething() {

/**
 * @param
 * Created Dog objects to test if friendly is false
 */
        Dog[] dogs = {new Dog( true, "John"),
                new Dog( true,"Adam")};

    /**
     * @param
     * An int variable to iterate over the dogs array
     */
    int i=0;
    /**
     * For loop to run and check if Dog object
     * isFriendly() method returns a number below zero
     */
        for ( Dog item : dogs) {

       // assertFalse("This Dog is not friendly! " + item.isFriendly(), item.isFriendly() == false);
        /**
         * @exception
         * Output is friendly or assertTrue boolean message
         */
        assertTrue("This Dog is friendly! " + item.isFriendly(), item.isFriendly() != true);
        System.out.println("This is the dog: " + dogs[i] + " " + item.talk());
        i++;
    }
}
    /**
     * @return
     * Returns a message when the anaimal talks.
     */
    public String talk() {
        return "Woof!";
    }

}
