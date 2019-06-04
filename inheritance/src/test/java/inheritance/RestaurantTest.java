package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class RestaurantTest {

    @Test
    public void constructorTest() {
        List<Review> wow = new ArrayList<>();
        wow.add(new Review("SpeakToTheManager Haircut", "it needs less spice", 0));
        Restaurant potato = new Restaurant("Shenanigans", 2, "$", wow);
        assertEquals("Shenanigans", potato.getName());

    }

    @Test
    public void toString1() {
        List<Review> wow = new ArrayList<>();
        wow.add(new Review("SpeakToTheManager Haircut", "it needs less spice", 0));
        Restaurant potato = new Restaurant("Shenanigans", 2, "$", wow);
        assertEquals("The restaurant Shenanigans with 2 stars and costs $ out of $$$$", potato.toString());
    }
}