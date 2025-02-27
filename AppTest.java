/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio004POO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the App class.
 */
class AppTest {
    
    /**
     * Test to ensure that the App class provides a greeting.
     */
    @Test 
    void appHasAGreeting() {
        // Arrange: Create an instance of the App class
        App classUnderTest = new App();
        
        // Act & Assert: Verify the greeting is not null
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

        // Assert: Verify the greeting has the expected value
        assertEquals("Hello, World!", classUnderTest.getGreeting(), "Greeting should match the expected value");
    }
}
