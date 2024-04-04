package view.Car;

import javax.swing.*;
import java.awt.*;

public class ManageCarFrame extends JFrame {
    InitialPanelCar ipt;
    public ManageCarFrame(){
        super("Car Dashboard");
        ipt=new InitialPanelCar();
        add(ipt);
        pack();
        setSize(1000,600);
        setBackground( Color.black);

    }

    public void setIpt(InitialPanelCar ipt) {
        this.ipt = ipt;
    }

    public InitialPanelCar getIpt() {
        return ipt;
    }

}
