package roomsofrequirement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author winn
 */
public class Controller {

    public Model appModel;
    public View appView;

    public Controller() {
        appModel = new Model(this);
        appView = new View(this);

    }

    public void startApp() {
        appView.displayUI();
    }

    class MyJButton extends JButton {

        public MyJButton(String textToDisplay) {
            this.setText(textToDisplay);
            ClickListener cl = new ClickListener();
            cl.createComponents();
        }
        
        class ClickListener implements ActionListener{
            @Override
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("Search was pressed");
                String userInput = appView.roomTextField.getText();
                userInput = userInput.toUpperCase();
                System.out.println(userInput);
                for(int i = 0; i < appModel.listOfRooms.size(); i++){
                    String checkAgainst = appModel.listOfRooms.get(i);
                    if(userInput.equals(checkAgainst)){
                        System.out.println("Constructing Dialog");
                        appView.constructRoomDialog();
                    }
                }
          
            }
            
            private void createComponents() {
                ActionListener listener = new ClickListener();
                addActionListener(listener);
            }
        }
    }
}
