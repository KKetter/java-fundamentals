package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void getAuthor() {
        Review saucy = new Review("SpeakToTheManager Haircut", "it needs less spice", 0);
        assertEquals("SpeakToTheManager Haircut", saucy.getAuthor());
    }

    @Test
    public void toString1() {
        Review saucy = new Review("SpeakToTheManager Haircut", "it needs less spice", 0);
        assertEquals("SpeakToTheManager Haircut said it needs less spice gave it 0 stars (out of 3)",saucy.toString());
    }
}