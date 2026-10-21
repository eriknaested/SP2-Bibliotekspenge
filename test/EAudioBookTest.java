import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EAudioBookTest {

    @Test
    void calculatePointsTest() {

        var eAudioBook = new EAudioBook("Hvordan man koder magi", "TE", 97, 60, 250, 600);
        assertEquals(313900, eAudioBook.calculatePoints(), 0.01);

    }
}