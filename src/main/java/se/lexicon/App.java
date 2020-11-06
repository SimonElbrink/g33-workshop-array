package se.lexicon;

import java.util.Arrays;

import static se.lexicon.NameDAO.*;

public class App {

    public static void main(String[] args) {
        add("Simon Elbrink");
        add("simon Elbrink2");
        add("Ulf Bengtsson");
        add("Erik Svensson");
        add("Erik Svensson12");
        add("Erik Svensson13");

        System.out.println(Arrays.toString(NameDAO.arrayOfNames));

        remove("Ulf Bengtsson");
        System.out.println(Arrays.toString(NameDAO.arrayOfNames));

        System.out.println("Find My Name Method:");
        System.out.println(Arrays.toString(findByFirstName("eRiK")));
        System.out.println(Arrays.toString(findByLastName("Elbrink")));


    }

}
