import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundaryTest {

    @Test
    void testCase1to4() {

        assertEquals(-1, Main.payment_amount(-1, false, false));
        assertEquals(-1, Main.payment_amount(-1, true, false));
        assertEquals(-1, Main.payment_amount(-1, false, true));
        assertEquals(-1, Main.payment_amount(-1, true, true));
    }

    @Test
    void testCase5to8() {

        assertEquals(0, Main.payment_amount(0, false, false));
        assertEquals(0, Main.payment_amount(0, true, false));
        assertEquals(0, Main.payment_amount(0, false, true));
        assertEquals(0, Main.payment_amount(0, true, true));
    }

    @Test
    void testCase9to12() {

        assertEquals(0, Main.payment_amount(1, false, false));
        assertEquals(0, Main.payment_amount(1, true, false));
        assertEquals(0, Main.payment_amount(1, false, true));
        assertEquals(0, Main.payment_amount(1, true, true));
    }

    @Test
    void testCase13to16() {

        assertEquals(0, Main.payment_amount(3, false, false));
        assertEquals(0, Main.payment_amount(3, true, false));
        assertEquals(0, Main.payment_amount(3, false, true));
        assertEquals(0, Main.payment_amount(3, true, true));
    }

    @Test
    void testCase17to20() {

        assertEquals(0, Main.payment_amount(5, false, false));
        assertEquals(0, Main.payment_amount(5, true, false));
        assertEquals(0, Main.payment_amount(5, false, true));
        assertEquals(0, Main.payment_amount(5, true, true));
    }

    @Test
    void testCase21to24() {

        assertEquals(200000, Main.payment_amount(6, false, false));
        assertEquals(100000, Main.payment_amount(6, true, false));
        assertEquals(50000, Main.payment_amount(6, true, true));
        assertEquals(50000, Main.payment_amount(6, false, true));
    }

    @Test
    void testCase25to28() {

        assertEquals(200000, Main.payment_amount(7, false, false));
        assertEquals(100000, Main.payment_amount(7, true, false));
        assertEquals(50000, Main.payment_amount(7, true, true));
        assertEquals(50000, Main.payment_amount(7, false, true));
    }

    @Test
    void testCase29to32() {

        assertEquals(200000, Main.payment_amount(12, false, false));
        assertEquals(100000, Main.payment_amount(12, true, false));
        assertEquals(50000, Main.payment_amount(12, true, true));
        assertEquals(50000, Main.payment_amount(12, false, true));
    }

    @Test
    void testCase33to36() {

        assertEquals(200000, Main.payment_amount(16, false, false));
        assertEquals(100000, Main.payment_amount(16, true, false));
        assertEquals(50000, Main.payment_amount(16, true, true));
        assertEquals(50000, Main.payment_amount(16, false, true));
    }

    @Test
    void testCase37to40() {

        assertEquals(200000, Main.payment_amount(17, false, false));
        assertEquals(100000, Main.payment_amount(17, true, false));
        assertEquals(50000, Main.payment_amount(17, true, true));
        assertEquals(50000, Main.payment_amount(17, false, true));
    }

    @Test
    void testCase41to44() {

        assertEquals(400000, Main.payment_amount(18, false, false));
        assertEquals(200000, Main.payment_amount(18, true, false));
        assertEquals(50000, Main.payment_amount(18, true, true));
        assertEquals(50000, Main.payment_amount(18, false, true));
    }

    @Test
    void testCase45to48() {

        assertEquals(400000, Main.payment_amount(19, false, false));
        assertEquals(200000, Main.payment_amount(19, true, false));
        assertEquals(50000, Main.payment_amount(19, true, true));
        assertEquals(50000, Main.payment_amount(19, false, true));
    }

    @Test
    void testCase49to52() {

        assertEquals(400000, Main.payment_amount(30, false, false));
        assertEquals(200000, Main.payment_amount(30, true, false));
        assertEquals(50000, Main.payment_amount(30, true, true));
        assertEquals(50000, Main.payment_amount(30, false, true));
    }
}