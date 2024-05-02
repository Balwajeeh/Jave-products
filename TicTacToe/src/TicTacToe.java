import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame {
    private static final int BOARD_SIZE = 3;
    private JButton[][] board;
    private boolean xTurn;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeBoard();
    }

    private void initializeBoard() {
        xTurn = true;
        board = new JButton[BOARD_SIZE][BOARD_SIZE];

        JPanel panel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                JButton button = new JButton();
                button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
                button.addActionListener(new ButtonClickListener(row, col));
                board[row][col] = button;
                panel.add(button);
            }
        }

        add(panel);
        setVisible(true);
    }

    private void markButton(int row, int col) {
        JButton button = board[row][col];
        if (xTurn) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        button.setEnabled(false);
        xTurn = !xTurn;
    }

    private void checkWin() {
        String[] symbols = { "X", "O" };

        for (String symbol : symbols) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                if (board[i][0].getText().equals(symbol) &&
                        board[i][1].getText().equals(symbol) &&
                        board[i][2].getText().equals(symbol)) {
                    highlightWinningCells(i, 0, i, 1, i, 2);
                    showWinner(symbol);
                    return;
                }

                if (board[0][i].getText().equals(symbol) &&
                        board[1][i].getText().equals(symbol) &&
                        board[2][i].getText().equals(symbol)) {
                    highlightWinningCells(0, i, 1, i, 2, i);
                    showWinner(symbol);
                    return;
                }
            }

            if (board[0][0].getText().equals(symbol) &&
                    board[1][1].getText().equals(symbol) &&
                    board[2][2].getText().equals(symbol)) {
                highlightWinningCells(0, 0, 1, 1, 2, 2);
                showWinner(symbol);
                return;
            }

            if (board[0][2].getText().equals(symbol) &&
                    board[1][1].getText().equals(symbol) &&
                    board[2][0].getText().equals(symbol)) {
                highlightWinningCells(0, 2, 1, 1, 2, 0);
                showWinner(symbol);
                return;
            }
        }

        if (isBoardFull()) {
            showDraw();
        }
    }

    private boolean isBoardFull() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col].isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void highlightWinningCells(int row1, int col1, int row2, int col2, int row3, int col3) {
        board[row1][col1].setBackground(Color.GREEN);
        board[row2][col2].setBackground(Color.YELLOW);
        board[row3][col3].setBackground(Color.BLUE);
       
    }

    private void showWinner(String symbol) {
        JOptionPane.showMessageDialog(this, "Player " + symbol + " wins!");
        resetBoard();
    }

    private void showDraw() {
        JOptionPane.showMessageDialog(this, "It's a draw!");
        resetBoard();
    }

    private void resetBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col].setText("");
                board[row][col].setEnabled(true);
                board[row][col].setBackground(null);
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void actionPerformed(ActionEvent e) {
            markButton(row, col);
            checkWin();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe();
            }
        });
    }
}

