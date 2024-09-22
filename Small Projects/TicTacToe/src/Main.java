//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
    Board game1=new Board();
    game1.printBoard();
    }
}

class Board{
    public char[][] board;
    int row=3;
    int column=3;

    public Board(){
        board=new char[row][column];
        System.out.println("Board is ready !");
    }

    public void printBoard(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    //winning Logic
    boolean haveWon(){
        //check rows
        for (int i=0;i<row;i++){

        }
    }


}