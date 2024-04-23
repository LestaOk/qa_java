import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline = new Feline();

    @Test
    public void testEatMeatReturnsMeat() throws Exception {
        List<String> expectedFood = Constants.MEAT_FOOD;
        assertEquals(expectedFood, feline.eatMeat());
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
