package com.white.cloak.solution;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class EmailMaskerTest {

    @Test
    public void itShouldMaskEmailWithAsteriskChars() {
        EmailMasker emailMasker = new EmailMasker();
            assertEquals("it should mask with the same output",
            "a**.**d@gmail.com", emailMasker.maskEmail("anc.asd@gmail.com"));
    }
}
