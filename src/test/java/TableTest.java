import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    public void testR1() {

        assertEquals(-1, Main.payment_amount(-1, false, true));
        assertEquals(-1, Main.payment_amount(-1, true, false));
        assertEquals(-1, Main.payment_amount(-1, false, false));
        assertEquals(-1, Main.payment_amount(-1, true, true));
    }

    @Test
    public void testR2() {

        assertEquals(0, Main.payment_amount(0, false, false));
        assertEquals(0, Main.payment_amount(5, true, true));
        assertEquals(0, Main.payment_amount(3, true, false));
        assertEquals(0, Main.payment_amount(3, false, true));
    }

    @Test
    public void testR3() {

        assertEquals(50000, Main.payment_amount(6, false, true));
        assertEquals(50000, Main.payment_amount(6, true, true));
        assertEquals(50000, Main.payment_amount(12, true, true));
    }

    @Test
    public void testR4() {

        assertEquals(50000, Main.payment_amount(18, false, true));
        assertEquals(50000, Main.payment_amount(21, false, true));
        assertEquals(50000, Main.payment_amount(21, true, true));
    }

    @Test
    public void testR5() {

        assertEquals(100000, Main.payment_amount(6, true, false)); // kiểm tại biên
        assertEquals(100000, Main.payment_amount(12, true, false));
    }

    @Test
    public void testR6() {

        assertEquals(200000, Main.payment_amount(17, false, false));
        assertEquals(200000, Main.payment_amount(12, false, false));
    }

    @Test
    public void testR7() {

        assertEquals(200000, Main.payment_amount(18, true, false));
        assertEquals(200000, Main.payment_amount(21, true, false));
    }

    @Test
    public void testR8() {

        assertEquals(400000, Main.payment_amount(18, false, false));
        assertEquals(400000, Main.payment_amount(21, false, false));
    }
}