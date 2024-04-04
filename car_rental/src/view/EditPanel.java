package view;

import javax.swing.*;

public class EditPanel extends JPanel {
    JTextField txt_get_Cus_idx;
    JButton getCustomerbtn;
    JTextField txt_fname;
    JTextField txt_lname;
    JTextField txt_mobile;
    JTextField txt_email;
    JTextField txt_address;
    JTextField txt_licence;
    JTextField txt_customer_id;
    JButton editCustomerbtn;

    public EditPanel(){
        txt_fname=new JTextField();
        txt_lname=new JTextField();
        txt_mobile=new JTextField();
        txt_email=new JTextField();
        txt_address=new JTextField();
        txt_licence=new JTextField();
        txt_customer_id=new JTextField();
        editCustomerbtn=new JButton("Edit Customer");
        txt_get_Cus_idx=new JTextField();
        getCustomerbtn=new JButton("Get Customer to edit");

        txt_fname.setText("txt_fname");
        txt_lname.setText("txt_lname");
        txt_mobile.setText("txt_mobile");
        txt_email.setText("txt_email");
        txt_address.setText("txt_address");
        txt_licence.setText("txt_licence");
        txt_customer_id.setText("txt_customer_id");
        txt_get_Cus_idx.setText("Get customer id");

        add(txt_get_Cus_idx);
        add(getCustomerbtn);


        add(txt_customer_id);
        add(txt_fname);
        add(txt_lname);
        add(txt_mobile);
        add(txt_email);
        add(txt_address);
        add(txt_licence);
        add(editCustomerbtn);
    }

    public void setTxt_get_Cus_idx(JTextField txt_get_Cus_idx) {
        this.txt_get_Cus_idx = txt_get_Cus_idx;
    }

    public void setGetCustomerbtn(JButton getCustomerbtn) {
        this.getCustomerbtn = getCustomerbtn;
    }

    public void setEditCustomerbtn(JButton editCustomerbtn) {
        this.editCustomerbtn = editCustomerbtn;
    }

    public void setTxt_customer_id(JTextField txt_customer_id) {
        this.txt_customer_id = txt_customer_id;
    }

    public void setTxt_fname(JTextField txt_fname) {
        this.txt_fname = txt_fname;
    }

    public void setTxt_lname(JTextField txt_lname) {
        this.txt_lname = txt_lname;
    }

    public void setTxt_licence(JTextField txt_licence) {
        this.txt_licence = txt_licence;
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

    public JTextField getTxt_get_Cus_idx() {
        return txt_get_Cus_idx;
    }

    public JButton getGetCustomerbtn() {
        return getCustomerbtn;
    }

    public JButton getEditCustomerbtn() {
        return editCustomerbtn;
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
