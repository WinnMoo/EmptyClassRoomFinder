package roomsofrequirement;


import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import roomsofrequirement.Controller.MyJButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winn
 */
public class View {
    
    public roomDialog dlg;
    public JFrame frame;
    public JPanel mainpanel;
    public JPanel buttonPanel;
    public MyJButton search;
    public JTextField roomTextField;
            
    public View(Controller appController){
        frame = new JFrame();
        
        mainpanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel();
        search = appController.new MyJButton("Search");
        roomTextField = new JTextField();
    }
    
    void displayUI(){
        frame.setTitle("Rooms of Requirement");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        mainpanel.add(roomTextField, BorderLayout.NORTH);
        
        buttonPanel.add(search, BorderLayout.CENTER);
        
        
        frame.add(mainpanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    public void constructRoomDialog(){
        dlg = new roomDialog(frame, true);//parent, modal=true
        dlg.setVisible(true);
    }
}
