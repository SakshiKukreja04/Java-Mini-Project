package view.Car;

import javax.swing.*;

public class DeleteCarPanel extends JPanel{
    JTextField txt_del_car_id;
    JButton delCarbtn;

    public DeleteCarPanel(){
        txt_del_car_id=new JTextField();
        delCarbtn=new JButton("Delete");

        txt_del_car_id.setText("txt_car_id");
        add(txt_del_car_id);
        add(delCarbtn);
    }

    public void setDelCarbtn(JButton delCarbtn) {
        this.delCarbtn = delCarbtn;
    }

    public void setTxt_del_car_id(JTextField txt_del_car_id) {
        this.txt_del_car_id = txt_del_car_id;
    }

    public JButton getDelCarbtn() {
        return delCarbtn;
    }

    public JTextField getTxt_del_car_id() {
        return txt_del_car_id;
    }
}
