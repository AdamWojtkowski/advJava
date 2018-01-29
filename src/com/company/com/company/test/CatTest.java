package com.company.com.company.test;


import com.company.Cat;
import org.junit.Test;

public class CatTest extends junit.framework.TestCase  {

//This is a test
    @Test
    public void testSomething() {

       Cat[] cats = {new Cat( 6, "John"),
                     new Cat( -1,"Adam")};
        int i=0;
        for ( Cat item : cats) {
            assertFalse("A cat can't kill negative mice! " + item.getMousesKilled(), item.getMousesKilled() < 0);

            System.out.println("This is mice killed: " + cats[i] + " " + item.talk());
            i++;
        }
    }
   // @Override
    public String talk() {
        return "Meow!";
    }
}
