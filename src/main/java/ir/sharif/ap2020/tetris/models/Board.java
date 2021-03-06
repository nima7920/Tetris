package ir.sharif.ap2020.tetris.models;


public class Board {
    private final int m, n;
    private final Cell[][] cells;

    public Board(int m, int n) {
        this.m = m;
        this.n = n;
        cells = new Cell[m][n];
        initCells();
    }

    private void initCells() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public boolean isCellAvailable(int x, int y) {
        if (x >= 0 && y >= 0 && x < m && y < n) {
            return !cells[x][y].isUsed();
        }
        return false;
    }
}
