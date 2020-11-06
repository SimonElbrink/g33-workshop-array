package se.lexicon;

import org.junit.Before;
import org.junit.Test;

import java.util.function.ToDoubleBiFunction;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Before
    public void init() {
        App.names = new String[0]; //Empty the array.
    }

    @Test
    public void adding_should_returnTrue_when_fullNameNotExist() {

        // Arrange
        String fullName = "Simon Elbrink";

        // Act
        boolean actual = App.add(fullName);

        // Assert
        assertTrue(actual);
        assertEquals(App.names[0], fullName);
    }


    @Test
    public void adding_should_returnFalse_when_fullNameExists() {

        // Arrange
        String fullName = "Simon Elbrink";

        //Seeding the array with fullName
        App.names = new String[]{fullName};

        // Act
        boolean actual = App.add(fullName);

        // Assert
        assertFalse(actual);

    }

    @Test
    public void should_containFullName_when_adding() {
        // Arrange
        String fullName = "Simon Elbrink";

        // Act
        boolean actual = App.add(fullName);

        // Assert
        assertEquals(App.names[0], fullName);
    }

    @Test
    public void should_createNewEmptyArray_when_clearing(){
        //TODO
    }

    @Test
    public void clear_should_instantiateArray_when_ArrayIsNull(){
        //TODO
    }



}
