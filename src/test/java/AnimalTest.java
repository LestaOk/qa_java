import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.StringConstants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Spy
    private Animal animal = new Animal();

    @Test
    public void testGetFamilyReturnsTheListOfFamilies() {
        assertEquals(KNOWN_FAMILIES, animal.getFamily());
    }

    @Test
    public void testGetFoodReturnsVegeteraian() throws Exception {
        assertEquals(VEGETERIAN_FOOD_LIST, animal.getFood(HERBIVORE));
    }

    @Test
    public void testGetFoodThrowsException() {
        Exception exception = assertThrows(Exception.class,() -> animal.getFood(UNKNOWN));
        assertEquals(UNKNOWN_ANIMAL_TYPE_VALIDATION_MESAGE, exception.getMessage());
    }
}
