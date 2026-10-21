import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

    @Test
    void calculatePointsTest() {
        var eBook = new EBook("Testerbog", "FAG", 97, 50, 205, 360000, true);
        assertEquals(72442, eBook.calculatePoints(), 0.01);        //Tolerance på 0,01 fordi assertEquals ellers kræver et nøjagtigt match
    }
}