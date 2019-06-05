package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class RestaurantTest {

    @Test
    public void constructorTest() {

        Restaurant potato = new Restaurant("Shenanigans", 2, "$");
        assertEquals("Shenanigans", potato.getName());

    }

    @Test
    public void toString1() {
        Restaurant potato = new Restaurant("Shenanigans", 2, "$");
        assertEquals("The restaurant Shenanigans with 2.000000 stars and costs $ out of $$$$", potato.toString());
    }

    @Test
    public void addReview() {
        List<Review> wow = new ArrayList<>();
        Review testReview = new Review("SpeakToTheManager Haircut", "it needs less spice", 3);
        Review testReview2 = new Review("SpeakToTheManager2 Haircut", "it needs less spice", 1);
        Restaurant potato = new Restaurant("Shenanigans", 2, "$");
        wow.add(testReview2);
        wow.add(testReview);
        potato.addReview(testReview2);
        potato.addReview(testReview);
        assertEquals(wow, potato.getReviews());
        assertEquals(2.0,potato.getStars(), 0);

    }
}