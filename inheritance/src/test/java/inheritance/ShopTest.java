package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void constructorTest(){
        Shop carrot = new Shop("$Tree","Cheep things sold here", 2, "$$");
        assertEquals("$Tree", carrot.getName());
    }
    @Test
    public void toString1() {
        Shop carrot = new Shop("$Tree","Cheep things sold here", 2, "$$");
        assertEquals("The shop $Tree described as Cheep things sold here with 2.000000 stars and is in the price range $$ out of $$$$", carrot.toString());
    }

    @Test
    public void addReview() {
        List<Review> wow = new ArrayList<>();
        Review testReview = new Review("Returning Damaged Goods", "Needs better prices", 1);
        Review testReview2 = new Review("Nothing", "Needs more or less stuff", 2);
        Shop carrot = new Shop("$Tree","Cheep things sold here", 2, "$$");
        wow.add(testReview2);
        wow.add(testReview);
        carrot.addReview(testReview2);
        carrot.addReview(testReview);
        assertEquals(wow, carrot.getReviews());
        assertEquals(1.6666666269302368,carrot.getStars(), 0);
    }
}