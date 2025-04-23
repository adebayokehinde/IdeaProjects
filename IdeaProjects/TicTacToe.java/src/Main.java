import java.util.Scanner;



public class TicTacToe {
    public CellValue[][] board;
    public static final int SIZE = 3;

    public TicTacToe() {
        board = new CellValue[SIZE][SIZE];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = CellValue.EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (board[i][j]) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                        System.out.print("   ");
                        break;
                }
                if (j < SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("---|---|---");
            }
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == CellValue.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col, CellValue player) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == CellValue.EMPTY) {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean checkWin(CellValue player) {
        // Check rows and columns
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public boolean isDraw() {
        return isBoardFull() && !checkWin(CellValue.X) && !checkWin(CellValue.O);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        CellValue currentPlayer = CellValue.X;
        boolean gameWon = false;

        System.out.println("Tic-Tac-Toe Game");
        game.printBoard();

        while (!game.isBoardFull()) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col, currentPlayer)) {
                game.printBoard();
                if (game.checkWin(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameWon = true;
                    break;
                }
                currentPlayer = (currentPlayer == CellValue.X) ? CellValue.O : CellValue.X;
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }

        if (!gameWon && game.isDraw()) {
            System.out.println("The game is a draw!");
        }

        scanner.close();
    }
}