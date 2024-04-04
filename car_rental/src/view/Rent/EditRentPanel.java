package view.Rent;

import javax.swing.*;

public class EditRentPanel extends JPanel {
    JTextField txt_get_rent_idx;
    JButton getRentbtn;
    JTextField txt_c_temp;
    JTextField txt_t_temp;
    JTextField txt_rent_date;
    JTextField txt_rent_fees;
    JButton editRentbtn;

    public EditRentPanel(){
        txt_c_temp=new JTextField();
        txt_t_temp=new JTextField();
        txt_rent_date=new JTextField();
        txt_rent_fees=new JTextField();
        editRentbtn=new JButton("Edit Rent");
        txt_get_rent_idx=new JTextField();
        getRentbtn=new JButton("Get Rent to Edit");

        txt_get_rent_idx.setText("txt_get_rent_idx");
        txt_c_temp.setText("customer_id");
        txt_t_temp.setText("Car_id");
        txt_rent_date.setText("Rent_date");
        txt_rent_fees.setText("Rent fees");
        txt_get_rent_idx.setText("get Rent idx");

        add(txt_get_rent_idx);
        add(getRentbtn);

        add(txt_c_temp);
        add(txt_t_temp);
        add(txt_rent_date);
        add(txt_rent_fees);
        add(editRentbtn);

    }

    public void setTxt_get_rent_idx(JTextField txt_get_rent_idx) {
        this.txt_get_rent_idx = txt_get_rent_idx;
    }

    public void setGetRentbtn(JButton getRentbtn) {
        this.getRentbtn = getRentbtn;
    }

    public void setTxt_c_temp(JTextField txt_c_temp) {
        this.txt_c_temp = txt_c_temp;
    }

    public void setTxt_t_temp(JTextField txt_t_temp) {
        this.txt_t_temp = txt_t_temp;
    }

    public void setTxt_rent_date(JTextField txt_rent_date) {
        this.txt_rent_date = txt_rent_date;
    }

    public void setTxt_rent_fees(JTextField txt_rent_fees) {
        this.txt_rent_fees = txt_rent_fees;
    }

    public void setEditRentbtn(JButton editRentbtn) {
        this.editRentbtn = editRentbtn;
    }

    public JTextField getTxt_get_rent_idx() {
        return txt_get_rent_idx;
    }

    public JButton getGetRentbtn() {
        return getRentbtn;
    }

    public JTextField getTxt_c_temp() {
        return txt_c_temp;
    }

    public JTextField getTxt_t_temp() {
        return txt_t_temp;
    }

    public JTextField getTxt_rent_date() {
        return txt_rent_date;
    }

    public JTextField getTxt_rent_fees() {
        return txt_rent_fees;
    }

    public JButton getEditRentbtn() {
        return editRentbtn;
    }

}
