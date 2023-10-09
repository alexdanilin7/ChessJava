package Figures;

// 1(w) - White 2(b) - Black;

public abstract class Figure {
    private String name;
    private char color;

    //private int[] position = new int[2];  // 0- row ; 1 - col


    public Figure(String name, char color) {
        this.name = name;
        this.color = color;
    }

    public boolean canMove(int row, int col, int row1, int col1){
        return (row >=0 && row < 8 )&&(col >=0 && col < 8)&&
                (row1 >=0 && row1 < 8 )&&(col1 >=0 && col1 < 8) &&
                (row!=row1) && (col!=col1);
    }

    public boolean canAttack(int row, int col, int row1, int col1){
        return this.canMove(row, col, row1, col1);
    }

}
