import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTests {

    @Test
    public void testIsDevisibleByThree(){
        assertTrue(Main.isDevisibleByThree(9));
        assertTrue(Main.isDevisibleByThree(99));
        assertTrue(Main.isDevisibleByThree(63));
    }

    @Test
    public void testIsNOTDevisibleByThree(){
        assertFalse(Main.isDevisibleByThree(10));
        assertFalse(Main.isDevisibleByThree(100));
        assertFalse(Main.isDevisibleByThree(50));
    }

    @Test
    public void testIsDevisibleByFive(){
        assertTrue(Main.isDevisibleByFive(10));
        assertTrue(Main.isDevisibleByFive(100));
        assertTrue(Main.isDevisibleByFive(50));
        assertTrue(Main.isDevisibleByFive(65));
    }

    @Test
    public void testIsNOTDevisibleByFive(){
        assertFalse(Main.isDevisibleByFive(24));
        assertFalse(Main.isDevisibleByFive(6));
        assertFalse(Main.isDevisibleByFive(99));
    }

    @Test
    public void testContainsThree(){
        assertTrue(Main.containsThree(63));
        assertTrue(Main.containsThree(33));
        assertTrue(Main.containsThree(3));
    }

    @Test
    public void TestNOTContainsThree(){
        assertFalse(Main.containsThree(6));
        assertFalse(Main.containsThree(98));
        assertFalse(Main.containsThree(64));
        assertFalse(Main.containsThree(14));
        assertFalse(Main.containsThree(2));
    }

    @Test
    public void testContainsFive(){
        assertTrue(Main.containsFive(95));
        assertTrue(Main.containsFive(55));
        assertTrue(Main.containsFive(5));
    }
    @Test
    public void TestNOTContainsFive(){
        assertFalse(Main.containsFive(6));
        assertFalse(Main.containsFive(98));
        assertFalse(Main.containsFive(64));
    }

    @Test
    void testArrayWasMadeWithPositiveNumbers(){
        var result = Main.returnNumberAsIntArray(-3);
        assertEquals(0, result.length);
    }

}
