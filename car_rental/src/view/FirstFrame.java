package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FirstFrame extends JFrame{
    JButton managecusbtn;
    JButton managecarbtn;
    JButton managerentbtn;

    JPanel firstPanel;
    JTextArea area;
    JLabel label;
    
    
    
    
    FirstFrame()
    {
        super("Car rent");
        setBackground(Color.black);
        managecusbtn=new JButton("MANAGE CUSTOMERS");
        managecarbtn=new JButton("MANAGE CARS");
        managerentbtn=new JButton("MANAGE RENTS");
        managecusbtn.setBackground(Color.orange);
        managecusbtn.setForeground(Color.black);
        managecarbtn.setBackground(Color.orange);
        managecarbtn.setForeground(Color.black);
        managerentbtn.setBackground(Color.orange);
        managerentbtn.setForeground(Color.black);


        firstPanel = new JPanel();
        setContentPane(new JLabel(new ImageIcon("car_rental/src/view/sej.jpg")));
        setLayout(new FlowLayout());
        label=new JLabel();
        add(label);
        setSize(1000,600);
        Border blackline=BorderFactory.createLineBorder(Color.BLACK,13);
        firstPanel.setBorder(blackline);

        firstPanel.add(managecusbtn);
        managecusbtn.setPreferredSize(new Dimension(170,50));
        firstPanel.add(Box.createVerticalStrut(60));

        firstPanel.add(managecarbtn);
        managecarbtn.setPreferredSize(new Dimension(170,50));
        firstPanel.add(Box.createVerticalStrut(60));

        firstPanel.add(managerentbtn);
        managerentbtn.setPreferredSize(new Dimension(170,50));
        firstPanel.add(Box.createVerticalStrut(60));

        add(firstPanel);
        pack();
        setVisible(true);
    }

    public void setFirstPanel(JPanel firstPanel) {
        this.firstPanel = firstPanel;
    }

    public JPanel getFirstPanel() {
        return firstPanel;
    }

    public void setManagecusbtn(JButton managecusbtn) {
        this.managecusbtn = managecusbtn;
    }

    public JButton getManagecusbtn() {
        return managecusbtn;
    }

    public void setManagecarbtn(JButton managecarbtn) {
        this.managecarbtn = managecarbtn;
    }

    public JButton getManagecarbtn() {
        return managecarbtn;
    }

    public void setManagerentbtn(JButton managerentbtn) {
        this.managerentbtn = managerentbtn;
    }

    public JButton getManagerentbtn() {
        return managerentbtn;
    }
}
