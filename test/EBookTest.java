import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

    @Test
    void calculatePointsTest() {
        var eBook = new EBook("Testerbog", "FAG", 97, 50, 205, 360000, false);
        assertEquals(65875, eBook.calculatePoints());
    }
}