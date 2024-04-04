package view.Rent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RentTablePanel extends JPanel {
    ArrayList<JButton> rent_buttons=new ArrayList<>();

    public RentTablePanel(){
        super();
    }

    public void createbuttons(int count) {
        for (int i = 1; i <= count; i++) {
            JButton b = new JButton();
            b.setBackground(Color.pink);
            b.setSize(500, 50);
            rent_buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }
    }
    public void setButtonText(int button_no, String button_text) {
        rent_buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return rent_buttons;
    }
}
