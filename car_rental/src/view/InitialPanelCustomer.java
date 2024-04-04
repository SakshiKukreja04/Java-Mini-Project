package view;

import javax.swing.*;
import java.awt.*;

public class InitialPanelCustomer extends JPanel {
    private CentralPanel cp;
    private AddPanelCustomer apc;
    private EditPanel ep;
    private DeletePanel dp;


    public InitialPanelCustomer(){
        super();
        cp=new CentralPanel();
        add(cp);
        apc=new AddPanelCustomer();
        add(apc);
        ep=new EditPanel();
        add(ep);
        dp=new DeletePanel();
        add(dp);
        setBackground( Color.black);
    }

    public void setCp(CentralPanel cp) {
        this.cp = cp;
    }

    public CentralPanel getCp() {
        return cp;
    }

    public void setApc(AddPanelCustomer ap) {
        this.apc = apc;
    }

    public AddPanelCustomer getApc() {
        return apc;
    }

    public void setDp(DeletePanel dp) {
        this.dp = dp;
    }

    public void setEp(EditPanel ep) {
        this.ep = ep;
    }

    public EditPanel getEp() {
        return ep;
    }

    public DeletePanel getDp() {
        return dp;
    }
}
