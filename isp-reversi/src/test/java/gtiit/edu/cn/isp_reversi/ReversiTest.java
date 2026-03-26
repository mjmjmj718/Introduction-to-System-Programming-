package gtiit.edu.cn.isp_reversi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversiTest {

    @Test
    void test_newReversi() {
        Reversi r = new Reversi(4);
        assertEquals(4, r.getSize());
    }

    @Test
    void test_initialPattern() {
        Reversi r = new Reversi(4);
        assertFalse(r.hasPieceAt(0, 0));
        assertFalse(r.hasPieceAt(0, 1));
        assertFalse(r.hasPieceAt(0, 2));
        assertFalse(r.hasPieceAt(0, 3));
        assertFalse(r.hasPieceAt(1, 0));
        assertTrue(r.hasPieceAt(1, 1));
        assertEquals(PlayerColor.Black, r.pieceAt(1, 1));
        assertEquals(PlayerColor.White, r.pieceAt(1, 2));
        assertTrue(r.hasPieceAt(1, 2));
        assertFalse(r.hasPieceAt(1, 3));
        assertFalse(r.hasPieceAt(2, 0));
        assertTrue(r.hasPieceAt(2, 1));
        assertEquals(PlayerColor.White, r.pieceAt(2, 1));
        assertTrue(r.hasPieceAt(2, 2));
        assertEquals(PlayerColor.Black, r.pieceAt(2, 2));
        assertFalse(r.hasPieceAt(2, 3));
        assertFalse(r.hasPieceAt(3, 0));
        assertFalse(r.hasPieceAt(3, 1));
        assertFalse(r.hasPieceAt(3, 2));
        assertFalse(r.hasPieceAt(3, 3));
    }
}