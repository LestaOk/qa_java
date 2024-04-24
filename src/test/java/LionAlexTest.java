import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static com.example.constants.StringConstants.NY_ZOO;
import static org.junit.Assert.assertEquals;

public class LionAlexTest {
    private final List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");

    @Mock
    private Feline feline;

    @Test
    public void testGetFriendsReturnsCorrectNames() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(expectedFriends, lionAlex.getFriends());
    }

    @Test
    public void testGetPlaceOfLivingReturnsNYZoo() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(NY_ZOO, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittensReturnsZero() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());
    }
}
