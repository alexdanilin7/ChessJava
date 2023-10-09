package Figures;

public class Pawn extends Figure{

    private boolean isFirstStep = true;

    public Pawn(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1) {
        if (!super.canMove(row, col, row1, col1)){
            return false;
        }

        if (this.isFirstStep) {
            if (((row+2 == row1) || (row+1 == row1)) && (col==col1)){
               this.isFirstStep = false;
                return true;
            }

        }else{
            if ((row+1 == row1) && (col==col1)){
                return true;
            }

        }
        return super.canMove(row, col, row1, col1);
    }

    @Override
    public boolean canAttack(int row, int col, int row1, int col1) {
        return super.canAttack(row, col, row1, col1);
    }
}
