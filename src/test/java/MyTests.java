import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTests {
    @Test
    public void testRollDie() {
        boolean[] found = new boolean[20]; //extra room just in case...
        for (int i = 0; i < 10000; i++) {
            int x = MyMain.rollDie();
            found[x] = true;
        }

        for (int i = 1; i <= 6; i++) {
            assertTrue(found[i], "The tester rolled 10000 dice using your rollDie() method, but it never rolled a: " + (i));
        }
    }

    @Test
    public void testProbabilityOneSix() {
        assertEquals(66.51, MyMain.probabilityOneSix(), 1.5, "The probability of rolling at least one 6 after rolling six dice should be around: 66.51%");
    }

    @Test
    public void testProbabilityTwoSixes() {
        assertEquals(61.87, MyMain.probabilityTwoSixes(), 1.5, "The probability of rolling at least two 6's after rolling twelve dice should be around: 61.87%");
    }

    @Test
    public void testProbabilityThreeSixes() {
        assertEquals(59.73, MyMain.probabilityThreeSixes(), 1.5, "The probability of rolling at least three 6;s after rolling eighteen dice should be around: 59.73%");
    }

}
