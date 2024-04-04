package view;

import javax.swing.*;

public class ManageCustomerFrame extends JFrame{
    InitialPanelCustomer ip;
    public ManageCustomerFrame(){
        super("CustomerDashboard");
        ip=new InitialPanelCustomer();
        add(ip);
        pack();
        setSize(1000,600);


    }
    public void setIp(InitialPanelCustomer ip) {
        this.ip = ip;
    }

    public InitialPanelCustomer getIp() {
        return ip;
    }
}
