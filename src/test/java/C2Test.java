import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C2Test {

    @Test
    void payment_amount() {

        assertEquals(-1, Main.payment_amount(-2, true, false));
        assertEquals(0, Main.payment_amount(5, true, false));
        assertEquals(50000, Main.payment_amount(6, false, true));
        assertEquals(400000, Main.payment_amount(18, false, false));
        assertEquals(100000, Main.payment_amount(17, true, false));
    }
}