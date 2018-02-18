

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;

public class GUIController implements ActionListener{
    GUIModel model;
    GUIView view;

    public GUIController(GUIModel model, GUIView view) {
        this.model = model;
        this.view = view;
        addActionListeners();
    }

    private void addActionListeners(){
    for (JButton cell : view.cells) {
            cell.addActionListener(this);
            view.newGame.addActionListener(this);
        }
    }
    private boolean addChoice(Integer field, Value value) {
        model.setChoice(field, value);
        if(model.movesCounter >= 5) {
            if(model.checkBoard()) {
                view.winGame();
                view.endGame();
                return true;
            }
            if(model.movesCounter == 9) {
                view.setNoWinner();
                view.endGame();
                return true;
            }
        } 
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Value currentPlayer = view.getCurrentPlayerValue();

        if (Arrays.asList(view.cells).contains(e.getSource()) && currentPlayer != null) {
            Integer knobIndex = Arrays.asList(view.cells).indexOf((JButton)e.getSource());
            ((JButton) e.getSource()).setText(view.getCurrentPlayerString());
            ((JButton) e.getSource()).setEnabled(false);
            if(!addChoice(knobIndex, currentPlayer)) view.changePlayer();
        } else if(e.getSource().equals(view.newGame)) {
            this.view.dispose();
            this.view = new GUIView();
            addActionListeners();
            this.model = new GUIModel();
        }
        }
    }
