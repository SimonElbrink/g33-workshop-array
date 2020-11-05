package se.lexicon;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void add_should_success_when_fullName_notExist(){

        // Arrange

        App.names = new String[0];

        boolean expected = true;
        boolean actual = false;
        String fullName = "Simon Elbrink";


        // Act
        actual = App.add(fullName);

        // Assert
        assertEquals(expected, actual);
        assertTrue(actual);
        assertTrue(App.names.length == 1);
        assertEquals(App.names[0], fullName);
    }

    @Test
    public void add_should_return_false_when_fullName_exists(){

        //Arrange
        String fullName = "Simon Elbrink";

        App.names = new String[] {fullName};

        //Act
       boolean actual = App.add(fullName);

        //Assert
        assertFalse(actual);

    }

}
