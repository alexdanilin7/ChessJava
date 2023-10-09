public class Board {
//TODO: Список фигур и начальное положение всех фигур

    public void print_board(){
        System.out.println(" +----+----+----+----+----+----+----+----+");
        for(int row = 7; row > -1; row--){
            System.out.print(row);
            for(int col = 0; col< 8; col++){
                System.out.print("|"+"    ");  //TODO: Вывод фигуры
             }
            System.out.println("|");
            System.out.println(" +----+----+----+----+----+----+----+----+");
        }


        for(int col = 0; col < 8; col++){
            System.out.print("    "+col);
        }


    }


}
