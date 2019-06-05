package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheatreTest {
    @Test
    public void constructorTest(){
        Theatre carrot = new Theatre("TaxHaven","Blade, Blade 2, Blade 3", 3, "$");
        assertEquals("$", carrot.getCost());
    }
    @Test
    public void toString1() {
        Theatre carrot = new Theatre("TaxHaven","Blade, Blade 2, Blade 3", 3, "$");
        assertEquals("The theatre TaxHaven with Blade, Blade 2, Blade 3 currently showing, 3.000000 stars, and costs $ out of $$$$", carrot.toString());
    }
}