import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodingTest {
    Decoding testDecoding = new Decoding( 2, "MGNXKP MQUIGK");
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("MGNXKP MQUIGK", testDecoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecoding.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("KELVIN KOSGEI" , testDecoding.decode());
    }
}