package ir.sharif.ap2020.tetris.models.pieces;

import ir.sharif.ap2020.tetris.logic.visitors.PieceVisitor;
import ir.sharif.ap2020.tetris.models.Cell;
import ir.sharif.ap2020.tetris.models.RotationalState;

public class LeftLeg extends Piece {

    public LeftLeg(Cell cell1, Cell cell2, Cell cell3, Cell cell4) {
        super(cell1, cell2, cell3, cell4);
    }


    public LeftLeg() {

    }

    @Override
    public void generateDefault(int boardWidth, int baseY) {
        cell1 = new Cell(boardWidth / 2 - 1, baseY);
        cell2 = new Cell(boardWidth / 2, baseY);
        cell3 = new Cell(boardWidth / 2 + 1, baseY);
        cell4 = new Cell(boardWidth / 2 - 1, baseY + 1);
        rotationalState = RotationalState.DOWN;

    }

    @Override
    public String getName() {
        return "leftLeg";
    }

    @Override
    public boolean accept(PieceVisitor pieceVisitor) {
        return pieceVisitor.leftLegVisit(this);
    }
}