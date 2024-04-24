import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import static com.example.constants.StringConstants.UNKNOWN;
import static com.example.constants.StringConstants.UNKNOWN_SEX_VALIDATION_MESSAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    @Mock
    private Feline feline;

    @Test
    public void testUnknownSexThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(UNKNOWN, feline));
        assertEquals(UNKNOWN_SEX_VALIDATION_MESSAGE, exception.getMessage());
    }
}