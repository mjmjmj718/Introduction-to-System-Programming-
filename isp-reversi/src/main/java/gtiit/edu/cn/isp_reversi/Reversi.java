package gtiit.edu.cn.isp_reversi;

class Reversi {

    Reversi(int n) {
        this.size = n;
        /* COMPLETE */
    }

    int getSize() {
        return this.size;
    }

    boolean hasPieceAt(int i, int j) {
        /* COMPLETE */
        return false;
    }

    PlayerColor pieceAt(int i, int j) {
        /* COMPLETE */
        return null;
    }

    PlayerColor currentTurn() {
        /* COMPLETE */
        return PlayerColor.Black;
    }

    void playAt(int i, int j) {
        /* COMPLETE */
    }

    boolean gameEnded() {
        /* COMPLETE */
        return false;
    }

    int numberOfPieces(PlayerColor color) {
        /* COMPLETE */
        return 0;
    }

    /* COMPLETE */
    private int size;

}
