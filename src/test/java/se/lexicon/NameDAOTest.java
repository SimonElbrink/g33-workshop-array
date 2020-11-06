package se.lexicon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static se.lexicon.NameDAO.*;

public class NameDAOTest {

    @Before
    public void init() {
        arrayOfNames = new String[0]; //Empty the array.
    }

    @Test
    public void adding_should_returnTrue_when_fullNameNotExist() {

        // Arrange
        String fullName = "Simon Elbrink";

        // Act
        boolean actual = add(fullName);

        // Assert
        Assert.assertTrue(actual);
        Assert.assertEquals(arrayOfNames[0], fullName);
    }


    @Test
    public void add_should_returnFalse_when_fullNameExists() {

        // Arrange
        String fullName = "Simon Elbrink";

        //Seeding the array with fullName
        arrayOfNames = new String[]{fullName};

        // Act
        boolean actual = add(fullName);

        // Assert
        Assert.assertFalse(actual);

    }

    @Test
    public void add_should_containFullName_when_adding() {
        // Arrange
        String fullName = "Simon Elbrink";

        // Act
        boolean actual = add(fullName);

        // Assert
        Assert.assertEquals(arrayOfNames[0], fullName);
    }

    @Test
    public void clear_should_createNewEmptyArray_when_clearing(){
        //TODO
    }

    @Test
    public void clear_should_instantiateArray_when_ArrayIsNull(){
        //TODO
    }

    @Test
    public void findByName_should_successfullyReturnMatchingNames_when_nameFound(){
        //TODO
    }

    @Test
    public void findByName_should_successfullyReturnEmptyArray_when_nameNotFound(){
        //TODO
    }

    @Test
    public void lastNyName_should_successfullyReturnMatchingNames_when_nameFound(){
        //TODO
    }

    @Test
    public void lastNyName_should_successfullyReturnEmptyArray_when_nameNotFound(){
        //TODO
    }


}