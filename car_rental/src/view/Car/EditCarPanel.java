package view.Car;

import javax.swing.*;

public class EditCarPanel extends JPanel {
    JTextField txt_get_car_idx;
    JButton getCarbtn;
    JTextField txt_car_id;
    JTextField txt_company;
    JTextField txt_year;
    JTextField txt_color;
    JTextField txt_model;
    JButton editCarbtn;

    public EditCarPanel(){
        txt_car_id=new JTextField();
        txt_company = new JTextField();
        txt_year = new JTextField();
        txt_color = new JTextField();
        txt_model = new JTextField();
        editCarbtn=new JButton("Edit Car");
        txt_get_car_idx=new JTextField();
        getCarbtn=new JButton("Get Car to Edit");

        txt_car_id.setText("txt_car_id");
        txt_company.setText("txt_company");
        txt_year.setText("txt_year");
        txt_color.setText("txt_color");
        txt_model.setText("txt_model");
        txt_get_car_idx.setText("get Car idx");

        add(txt_get_car_idx);
        add(getCarbtn);

        add(txt_car_id);
        add(txt_company);
        add(txt_year);
        add(txt_color);
        add(txt_model);
        add(editCarbtn);
    }

    public void setTxt_get_car_idx(JTextField txt_get_car_idx) {
        this.txt_get_car_idx = txt_get_car_idx;
    }

    public void setGetCarbtn(JButton getCarbtn) {
        this.getCarbtn = getCarbtn;
    }

    public void setTxt_car_id(JTextField txt_car_id) {
        this.txt_car_id = txt_car_id;
    }

    public void setTxt_color(JTextField txt_color) {
        this.txt_color = txt_color;
    }

    public void setEditCarbtn(JButton editCarbtn) {
        this.editCarbtn = editCarbtn;
    }

    public void setTxt_model(JTextField txt_model) {
        this.txt_model = txt_model;
    }

    public void setTxt_year(JTextField txt_year) {
        this.txt_year = txt_year;
    }

    public void setTxt_company(JTextField txt_company) {
        this.txt_company = txt_company;
    }

    public JTextField getTxt_get_car_idx() {
        return txt_get_car_idx;
    }

    public JTextField getTxt_car_id() {
        return txt_car_id;
    }

    public JTextField getTxt_company() {
        return txt_company;
    }

    public JTextField getTxt_year() {
        return txt_year;
    }

    public JTextField getTxt_model() {
        return txt_model;
    }

    public JTextField getTxt_color() {
        return txt_color;
    }

    public JButton getEditCarbtn() {
        return editCarbtn;
    }

    public JButton getGetCarbtn() {
        return getCarbtn;
    }
}
