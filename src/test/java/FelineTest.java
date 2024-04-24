import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.StringConstants.MEAT_FOOD_LIST;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline = new Feline();

    @Test
    public void testEatMeatReturnsMeat() throws Exception {
        assertEquals(MEAT_FOOD_LIST, feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensReturnsOneKitten() {
        assertEquals(1, feline.getKittens());
    }
}
