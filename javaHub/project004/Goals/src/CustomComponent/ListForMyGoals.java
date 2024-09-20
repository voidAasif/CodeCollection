package CustomComponent;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListForMyGoals extends JPanel implements ActionListener{

    JPanel midPanel;

    ListForMyGoals(JPanel midPanel){
        this.midPanel = midPanel;

        
    }




    @Override
    public void actionPerformed(ActionEvent arg0) {}
    
}
