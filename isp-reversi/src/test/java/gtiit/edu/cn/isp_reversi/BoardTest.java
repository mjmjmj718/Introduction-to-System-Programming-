package gtiit.edu.cn.isp_reversi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    void test_newBoard() {
        Board b = new Board(4);
        assertEquals(4, b.getSize());
    }

    @Test
    void test_inRange() {
        Board b = new Board(3);
        assertTrue(b.inRange(0, 0));
        assertTrue(b.inRange(0, 1));
        assertTrue(b.inRange(0, 2));
        assertTrue(b.inRange(1, 0));
        assertTrue(b.inRange(1, 1));
        assertTrue(b.inRange(1, 2));
        assertTrue(b.inRange(2, 0));
        assertTrue(b.inRange(2, 1));
        assertTrue(b.inRange(2, 2));
        assertFalse(b.inRange(-1, 1));
        assertFalse(b.inRange(3, 1));
        assertFalse(b.inRange(1, -1));
        assertFalse(b.inRange(1, 3));
    }
}