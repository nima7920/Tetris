package logic.visitors;

import models.Board;
import models.pieces.*;

public class PieceRotatableVisitor implements PieceVisitor{

    private Board board;

    public PieceRotatableVisitor(Board board) {
        this.board = board;
    }

    @Override
    public boolean woodVisit(Wood wood) {
        int[] xs=wood.getXs(),ys=wood.getYs();
        switch (wood.getRotationalState()) {
            case up:
                if(board.isCellAvailable(xs[1],ys[1]-1) &&
                board.isCellAvailable(xs[1],ys[1]-2) &&
                board.isCellAvailable(xs[1],ys[1]+1))
                    return true;

                break;
            case down:
                if(board.isCellAvailable(xs[1],ys[1]-1) &&
                        board.isCellAvailable(xs[1],ys[1]+2) &&
                        board.isCellAvailable(xs[1],ys[1]+1))
                    return true;
                break;
            case right:
                if(board.isCellAvailable(xs[1]-1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]) &&
                        board.isCellAvailable(xs[1]+2,ys[1]))
                    return true;
                break;
            case left:
                if(board.isCellAvailable(xs[1]-2,ys[1]) &&
                        board.isCellAvailable(xs[1]-1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]))
                    return true;
                break;
        }
        return false;
    }

    @Override
    public boolean mountainVisit(Mountain mountain) {
        int[] xs=mountain.getXs(),ys=mountain.getYs();
        switch (mountain.getRotationalState()) {
            case up:
                if(board.isCellAvailable(xs[1],ys[1]+1))
                    return true;
                break;
            case down:
                if(board.isCellAvailable(xs[1],ys[1]-1))
                    return true;
                break;
            case right:
                if(board.isCellAvailable(xs[1]-1,ys[1]))
                    return true;
                break;
            case left:
                if(board.isCellAvailable(xs[1]+1,ys[1]))
                    return true;
                break;
        }
        return false;
    }

    @Override
    public boolean windowVisit(Window window) {
        return true;
    }

    @Override
    public boolean leftLegVisit(LeftLeg leftLeg) {
        int[] xs=leftLeg.getXs(),ys=leftLeg.getYs();
        switch (leftLeg.getRotationalState()) {
            case up:
                if(board.isCellAvailable(xs[1],ys[1]-1) &&
                board.isCellAvailable(xs[1],ys[1]+1) &&
                board.isCellAvailable(xs[1]+1,ys[1]+1))
                    return true;
                break;
            case down:
                if(board.isCellAvailable(xs[1],ys[1]-1) &&
                        board.isCellAvailable(xs[1],ys[1]+1) &&
                        board.isCellAvailable(xs[1]-1,ys[1]-1))
                    return true;
                break;
            case right:
                if(board.isCellAvailable(xs[1]-1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]) &&
                        board.isCellAvailable(xs[1]-1,ys[1]+1))
                    return true;
                break;
            case left:
                if(board.isCellAvailable(xs[1]-1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]-1))
                    return true;
                break;
        }
        return false;
    }

    @Override
    public boolean rightLegVisit(RightLeg rightLeg) {
        int[] xs=rightLeg.getXs(),ys=rightLeg.getYs();
        switch (rightLeg.getRotationalState()) {
            case up:
                if(board.isCellAvailable(xs[1],ys[1]-1) &&
                        board.isCellAvailable(xs[1],ys[1]+1) &&
                        board.isCellAvailable(xs[1]+1,ys[1]-1))
                    return true;
                break;
            case down:
                if(board.isCellAvailable(xs[1],ys[1]-1) &&
                        board.isCellAvailable(xs[1],ys[1]+1) &&
                        board.isCellAvailable(xs[1]-1,ys[1]+1))
                    return true;
                break;
            case right:
                if(board.isCellAvailable(xs[1]-1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]+1))
                    return true;
                break;
            case left:
                if(board.isCellAvailable(xs[1]-1,ys[1]) &&
                        board.isCellAvailable(xs[1]+1,ys[1]) &&
                        board.isCellAvailable(xs[1]-1,ys[1]-1))
                    return true;
                break;
        }
        return false;
    }
}
