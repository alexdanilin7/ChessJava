import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setColorGaming('w');
        board.init();

        boolean game = true;

        Scanner in = new Scanner(System.in);

        while (game) {
            board.print_board();
            System.out.println();
            System.out.println("Команды: ");
            System.out.println("----- exit: Выход из игры");
            System.out.println("------y1 x1 y2 x2: Ход фигуры из клетки x1, y1 в клекту x2, y2");

            switch (board.getColorGaming()){
                case 'w': System.out.println("Ход Белых:"); break;
                case 'b': System.out.println("Ход Черных:"); break;
            }

            String inputLine = in.nextLine();
            if (inputLine.equals("exit")){
                System.out.println("Игра завршена.");
                in.close();
                break;
            }

            String[] coords = inputLine.split(" ");
            int y1 = Integer.parseInt(coords[0]);
            int x1 = Integer.parseInt(coords[1]);
            int y2 = Integer.parseInt(coords[2]);
            int x2 = Integer.parseInt(coords[3]);
            board.move_figure(y1,x1, y2,x2);
        }

    }
}