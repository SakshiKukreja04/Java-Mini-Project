package view.Rent;

import javax.swing.*;

public class ManageRentFrame extends JFrame {
    InitialPanelRent ipr;
    public ManageRentFrame(){
        super("Rent Dashboard");
        ipr=new InitialPanelRent();
        add(ipr);
        pack();
        setSize(1000,600);



    }

    public void setIpr(InitialPanelRent ipr) {
        this.ipr = ipr;
    }

    public InitialPanelRent getIpr() {
        return ipr;
    }
}
