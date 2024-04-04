package view.Rent;

import javax.swing.*;

public class AddRentPanel extends JPanel {
    JTextField txt_c_temp;
    JTextField txt_t_temp;
    JTextField txt_rent_date;
    JTextField txt_rent_fees;
    JButton addRentbtn;

    public AddRentPanel(){
        txt_c_temp=new JTextField();
        txt_t_temp=new JTextField();
        txt_rent_date=new JTextField();
        txt_rent_fees=new JTextField();

        addRentbtn=new JButton("Add Rent");
        txt_c_temp.setText("customer_id");
        txt_t_temp.setText("Car_id");
        txt_rent_date.setText("Rent_date");
        txt_rent_fees.setText("Rent fees");

        add(txt_c_temp);
        add(txt_t_temp);
        add(txt_rent_date);
        add(txt_rent_fees);
        add(addRentbtn);
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

    public void setAddRentbtn(JButton addRentbtn) {
        this.addRentbtn = addRentbtn;
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

    public JButton getAddRentbtn() {
        return addRentbtn;
    }
}
