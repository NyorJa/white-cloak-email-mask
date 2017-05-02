import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailMaskerTest {

    @Test
    public void itShouldMaskEmailWithAsteriskChars() {
        EmailMasker emailMasker = new EmailMasker();
        assertEquals("it should mask with the same outpul",
                "a**.**d@gmail.com", emailMasker.maskEmail("anc.asd@gmail.com"));
    }
}
