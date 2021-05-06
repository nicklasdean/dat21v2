package unit_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @Test
    void isLegalAge() {
        //Arrange
        //Instantiating an AgeValidator
        AgeValidator validator = new AgeValidator();

        //Act
        //Running the methods - collecting actual results as variables
        String legalAge = validator.isLegalAge(18);

        String illegalAge = validator.isLegalAge(17);
        String illegalAge2 = validator.isLegalAge(1);

        String illegalInput = validator.isLegalAge(-5);

        //Assert
        //Asserting expected against actual results

        //Legal age
        assertEquals("Legal age",legalAge);

        //Non legal age
        assertEquals("not legal",illegalAge);
        assertEquals("not legal",illegalAge2);

        //Illegal input
        assertEquals("Illegal",illegalInput);
    }
}
