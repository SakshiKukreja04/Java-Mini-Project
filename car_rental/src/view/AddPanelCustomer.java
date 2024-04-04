package view;

import javax.swing.*;


public class AddPanelCustomer extends JPanel{
    JTextField txt_fname;
    JTextField txt_lname;
    JTextField txt_mobile;
    JTextField txt_email;
    JTextField txt_address;
    JTextField txt_licence;
    JTextField txt_customer_id;
    JButton addCustomerbtn;

    public AddPanelCustomer(){
        txt_fname=new JTextField();
        txt_lname=new JTextField();
        txt_mobile=new JTextField();
        txt_email=new JTextField();
        txt_address=new JTextField();
        txt_licence=new JTextField();
        txt_customer_id=new JTextField();
        addCustomerbtn=new JButton("Add Customer");

        txt_fname.setText("txt_fname");
        txt_lname.setText("txt_lname");
        txt_mobile.setText("txt_mobile");
        txt_email.setText("txt_email");
        txt_address.setText("txt_address");
        txt_licence.setText("txt_licence");
        txt_customer_id.setText("txt_customer_id");

        add(txt_customer_id);
        add(txt_fname);
        add(txt_lname);
        add(txt_mobile);
        add(txt_email);
        add(txt_address);
        add(txt_licence);
        add(addCustomerbtn);
    }

    public void setAddCustomerbtn(JButton addCustomerbtn) {
        this.addCustomerbtn = addCustomerbtn;
    }

    public void setTxt_fname(JTextField txt_fname) {
        this.txt_fname = txt_fname;
    }

    public void setTxt_lname(JTextField txt_lname) {
        this.txt_lname = txt_lname;
    }

    public void setTxt_mobile(JTextField txt_mobile) {
        this.txt_mobile = txt_mobile;
    }

    public void setTxt_address(JTextField txt_address) {
        this.txt_address = txt_address;
    }

    public void setTxt_email(JTextField txt_email) {
        this.txt_email = txt_email;
    }

    public void setTxt_licence(JTextField txt_licence) {
        this.txt_licence = txt_licence;
    }

    public void setTxt_customer_id(JTextField txt_customer_id) {
        this.txt_customer_id = txt_customer_id;
    }

    public JButton getAddCustomerbtn() {
        return addCustomerbtn;
    }

    public JTextField getTxt_fname() {
        return txt_fname;
    }

    public JTextField getTxt_lname() {
        return txt_lname;
    }

    public JTextField getTxt_mobile() {
        return txt_mobile;
    }

    public JTextField getTxt_email() {
        return txt_email;
    }

    public JTextField getTxt_address() {
        return txt_address;
    }

    public JTextField getTxt_licence() {
        return txt_licence;
    }

    public JTextField getTxt_customer_id() {
        return txt_customer_id;
    }
}
