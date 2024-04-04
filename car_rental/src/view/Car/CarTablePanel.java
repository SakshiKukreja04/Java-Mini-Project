package view.Car;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CarTablePanel extends JPanel{
    ArrayList<JButton>car_buttons=new ArrayList<>();

    public CarTablePanel(){
        super();
    }

    public void createbuttons(int count) {
        for (int i = 1; i <= count; i++) {
            JButton b = new JButton();
            b.setBackground(Color.pink);
            b.setSize(500, 50);
            car_buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }
    }
    public void setButtonText(int button_no, String button_text) {
        car_buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return car_buttons;
    }
}
