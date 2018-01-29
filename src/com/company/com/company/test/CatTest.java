package com.company.com.company.test;

import com.company.Cat;
import org.junit.Test;

/**
 * @author Adam Wojtkowksi
 * @version 1.0
 */

public class CatTest extends junit.framework.TestCase  {


    @Test
    public void testSomething() {

/**
 * @param
 * Created Cat objects to test mice killed,
 * was not below zero.
 */
        Cat[] cats = {new Cat( 6, "John"),
                new Cat( -1,"Adam")};

/**
 * @param
 * An int variable to iterate over the cats array
 */
        int i=0;
        /**
         * For loop to run and check if Cat object
         * getMousesKilled() method returns a number below zero
         */
        for ( Cat item : cats) {

            assertFalse("A cat can't kill negative mice! " + item.getMousesKilled(), item.getMousesKilled() < 0);
            /**
             * @exception
             * Output mice killed or assertFalse boolean message
             */
            System.out.println("This is mice killed: " + cats[i] + " " + item.talk());
            i++;
        }
    }

    /**
     * @return
     * Returns a message when the anaimal talks.
     */
    public String talk() {
        return "Meow!";
    }
}
