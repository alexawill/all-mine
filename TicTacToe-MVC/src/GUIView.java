import java.awt.Color;
import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

class GUIView extends JFrame{
	
	JFrame TicTacToe;
	Container container;
    JButton[] cells;
    JButton newGame;
    JLabel turn;


    public GUIView(){
        
    		TicTacToe = new JFrame("TicTacToe");
    		TicTacToe.setBounds(600, 200, 301, 500);
    		TicTacToe.getContentPane().setLayout(null);
    		TicTacToe.setVisible(true);
    		TicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		TicTacToe.setResizable(true);
    		
    		container = TicTacToe.getContentPane();
    		container.setBackground(Color.WHITE);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        cells = new JButton[9];
        for (int i = 0;i<this.cells.length;i++) {
            this.cells[i] = new JButton(" ");
            this.cells[i].setSize(100, 100);
        }
        
        turn = new JLabel("X");
        turn.setBounds(TicTacToe.getWidth()/2-75, 50, 150, 50);
        turn.setVisible(true);
        
        newGame = new JButton("New Game");
        newGame.setBounds(TicTacToe.getWidth()/2-50, 0, 100, 50);
        
        cells[0].setLocation(0,100);
        cells[1].setLocation(100,100);
        cells[2].setLocation(200,100);
        cells[3].setLocation(0,200);
        cells[4].setLocation(100,200);
        cells[5].setLocation(200,200);
        cells[6].setLocation(0,300);
        cells[7].setLocation(100,300);
        cells[8].setLocation(200,300);
        
        for (int i = 0;i<this.cells.length;i++) {
            container.add(cells[i]);
        }
        container.add(turn);
        container.add(newGame);
        
    }

    public void changePlayer() {
        String newPlayer = changeValue(getCurrentPlayerString());
        this.turn.setText(newPlayer);
    }

    public void winGame() {
        this.turn.setText(getCurrentPlayerString() + " WIN THE GAME!");
        for(JButton cell : this.cells) {
            cell.setEnabled(false);
        }
        endGame();
    }

    public String changeValue(String value) {
        if("X".equals(value)) {
            return "O";
        } else if("O".equals(value)) {
            return "X";
        }
        return null;
    }

    public Value changeValue(Value value) {
        if(value == Value.X) {
            return Value.O;
        } else if (value == Value.O) {
            return Value.X;
        }
        return null;
    }

    public Value getCurrentPlayerValue() {
         if("X".equals(this.turn.getText())) {
            return Value.X;
        } else if("O".equals(this.turn.getText())) {
            return Value.O;
        }
         return null;
    }

    public String getCurrentPlayerString() {
         if("X".equals(this.turn.getText())) {
            return "X";
        } else if("O".equals(this.turn.getText())) {
            return "O";
        }
         return null;
    }

    void resetGame() {
        this.turn.setEnabled(true);
    }
    void setNoWinner() {
    		this.turn.setText("DRAW!");
    }
    void endGame() {
        this.newGame.setEnabled(true);
    }

}