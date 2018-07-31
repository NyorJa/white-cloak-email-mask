package com.white.cloak.solution;

import static junit.framework.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EmailMaskerTest {

    private EmailMasker emailMasker;

    @Before
    public void setUp() {
        emailMasker = new EmailMasker();
    }

    @After
    public void after() {
        emailMasker = null;
    }


    @Test
    public void itShouldMaskEmailWithAsteriskChars() {
            assertEquals("it should mask with the same output",
            "a**.**d@gmail.com", emailMasker.maskEmail("anc.asd@gmail.com"));
    }
}
