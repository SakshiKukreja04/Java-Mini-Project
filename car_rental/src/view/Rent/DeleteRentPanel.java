package view.Rent;

import javax.swing.*;

public class DeleteRentPanel extends JPanel {
    JTextField txt_del_rent_id;
    JButton delrentbtn;
    public DeleteRentPanel(){
        txt_del_rent_id=new JTextField();
        delrentbtn=new JButton("Delete Rent");
        txt_del_rent_id.setText("txt_rent_id");
        add(txt_del_rent_id);
        add(delrentbtn);
    }

    public void setTxt_del_rent_id(JTextField txt_del_rent_id) {
        this.txt_del_rent_id = txt_del_rent_id;
    }

    public void setDelrentbtn(JButton delrentbtn) {
        this.delrentbtn = delrentbtn;
    }

    public JTextField getTxt_del_rent_id() {
        return txt_del_rent_id;
    }

    public JButton getDelrentbtn() {
        return delrentbtn;
    }
}
