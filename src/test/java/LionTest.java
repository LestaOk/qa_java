import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    @Mock
    private Feline feline;

    @Test
    public void testUnknownSexThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(Constants.UNKNOWN_SEX, feline));
        assertEquals(Constants.UNKNOWN_SEX_VALIDATION_MESSAGE, exception.getMessage());
    }
}