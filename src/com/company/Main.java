package com.company;
/**
 *@author Adam Wojtkowski
 *This program takes a student, cat, or dog object and stores the objecst
 *unique properties, and prints out some of these properties.
 */


import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");
    public static void main(String[] args) {

        ArrayList <Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));
        //End Lines to Replace
/**
 * @param thing is a container to iterate throughout the talkable zoo ArrayList
 */
        for (Talkable thing: zoo) {
            printOut(thing);
        }

        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;

        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says = " + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
