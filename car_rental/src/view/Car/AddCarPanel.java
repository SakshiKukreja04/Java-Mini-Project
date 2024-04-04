package view.Car;

import javax.swing.*;

public class AddCarPanel extends JPanel {
    JTextField txt_car_id;
    JTextField txt_company;
    JTextField txt_year;
    JTextField txt_color;
    JTextField txt_model;
    JButton addCarBtn;

    public AddCarPanel()
    {
        txt_car_id=new JTextField();
        txt_company = new JTextField();
        txt_year = new JTextField();
        txt_color = new JTextField();
        txt_model = new JTextField();
        addCarBtn = new JButton("Add Car");


        txt_car_id.setText("txt_car_id");
        txt_company.setText("txt_company");
        txt_year.setText("txt_year");
        txt_color.setText("txt_color");
        txt_model.setText("txt_model");

        add(txt_car_id);
        add(txt_company);
        add(txt_year);
        add(txt_color);
        add(txt_model);
        add(addCarBtn);
    }

    public void setTxt_car_id(JTextField txt_car_id) {
        this.txt_car_id = txt_car_id;
    }

    public void setTxt_company(JTextField txt_company) {
        this.txt_company = txt_company;
    }

    public void setTxt_year(JTextField txt_year) {
        this.txt_year = txt_year;
    }

    public void setTxt_color(JTextField txt_color) {
        this.txt_color = txt_color;
    }

    public void setTxt_model(JTextField txt_model) {
        this.txt_model = txt_model;
    }

    public void setAddCarBtn(JButton addCarBtn) {
        this.addCarBtn = addCarBtn;
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

    public JTextField getTxt_color() {
        return txt_color;
    }

    public JTextField getTxt_model() {
        return txt_model;
    }

    public JButton getAddCarBtn() {
        return addCarBtn;
    }
}
