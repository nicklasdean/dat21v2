package exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CprValidatorTest {

    @Test
    void validateCpr() {
        //Arrange
        CprValidator objectToTest = new CprValidator();

        //Act
        boolean expected = true;
        objectToTest.validateCpr("1234567890");

        //Assert
        assertEquals(expected,objectToTest.validateCpr("1234567890"));
        assertThrows(WrongCprException.class,() -> objectToTest.validateCpr("oisefhosuehg"));
    }
}
