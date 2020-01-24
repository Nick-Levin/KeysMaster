package org;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.util.PasswordGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

    @Test
    @DisplayName("Generator Test")
    public void generatorTest() {
        final int length = 50;
        final String pass = PasswordGenerator.generatePassword(length);
        assertTrue(pass.length() == length);
    }

}
