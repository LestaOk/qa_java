import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {
    private Feline feline;
    private final String sex;
    private final boolean hasMane;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    public ParametrizedLionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {Constants.FEMALE, false},
                {Constants.MALE, true}
        };
    }

    @Test
    public void testGetFoodReturnsMeat() throws Exception {
        Lion lion = new Lion(sex, feline);
        List<String> expectedFood = Constants.MEAT_FOOD;
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void testDoesHaveManeReturnsCorrectAnswer() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void testGetKittensReturnOneKitten() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
}