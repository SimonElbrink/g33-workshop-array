package se.lexicon;

import java.util.Arrays;

public class NameDAO {

    public static String[] arrayOfNames = new String[]{};

    public static boolean add(String fullName) {

        boolean isAdded = false;

        if (!nameExists(fullName)) {
            arrayOfNames = addToArray(arrayOfNames, fullName);
            isAdded = true;
        }

        return isAdded;
    }

    public static boolean nameExists(String fullName) {
        boolean IsExisting = false;

        for (int i = 0; i < NameDAO.arrayOfNames.length; i++) {
            if (NameDAO.arrayOfNames[i].equals(fullName)) {
                IsExisting = true;
                break;
            }
        }
        return IsExisting;
    }

    /**
     * TODO
     * Goal: Find and return the fullNames that matches the firstName parameter.
     * <p>
     * Steps:
     * 1. Create an array to store result in.
     * 2. Figure out how to isolate the firstName from an array element.
     * 3. If the name match the parameter add it to the array.
     * 4. Make sure to find all the matches.
     * 5. Return the matching results.
     * 6. Test both when the code should work and what could break.
     */
    public static String[] findByFirstName(final String firstName) {


        String[] foundNames = {};


        for (String name : arrayOfNames) { // Loop through stored names, extract/select each element as "name".
            String[] fullNameArray = name.split(" "); //Ex. ["Simon", "Elbrink"]
            String firstElement = fullNameArray[0]; // Ex. ["Simon", "Elbrink"] -> Simon

            if (firstElement.equalsIgnoreCase(firstName)) {
                foundNames = addToArray(foundNames, name);

            }
        }

        return foundNames;
    }

    public static String[] findByLastName(final String lastName) {

        String[] foundNames = {};

        for (String name : arrayOfNames) {

            String[] fullNameArray = name.split(" ");
            String firstElement = fullNameArray[1]; //LastName

            if (firstElement.equalsIgnoreCase(lastName)) {
                foundNames = addToArray(foundNames, name);
            }
        }

        return foundNames;
    }


    public static boolean remove(String fullName) {
        boolean isDeleted = false;

        if (arrayOfNames.length == 0) {
            System.out.println("Array is empty");

        } else if (nameExists(fullName)) {

            String[] newArray = new String[arrayOfNames.length - 1];

            for (int i = 0, j = 0; i < arrayOfNames.length; i++, j++) {
                if (arrayOfNames[i].equals(fullName)) {
                    --j;
                    isDeleted = true;
                } else {
                    newArray[j] = arrayOfNames[i];
                }

            }

            arrayOfNames = newArray;
        } else {
            System.out.println("Could not find name to remove");
        }

        return isDeleted;
    }


    public static void clear() {
        if (NameDAO.arrayOfNames == null) {
            System.out.println("Name list is not initialized, now initialized.");
        } else {
            System.out.println("Name list had been emptied!");
        }

        NameDAO.arrayOfNames = new String[0];
    }


    /**
     * Creates a new array with a added element.
     *
     * @param source array to expand and add to.
     * @param value  element to add.
     * @return array with added element.
     */
    private static String[] addToArray(String[] source, String value) {

        String[] newArray = Arrays.copyOf(source, source.length + 1);

        newArray[newArray.length - 1] = value;

        return newArray;
    }


}
