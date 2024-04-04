package view;

import javax.swing.*;

public class DeletePanel extends JPanel {
    JTextField txt_del_customer_id;
    JButton deleteCustomerbtn;
    public DeletePanel(){
        txt_del_customer_id=new JTextField();
        deleteCustomerbtn=new JButton("Delete Customer");
        txt_del_customer_id.setText("txt_custmer_id");

        add(txt_del_customer_id);
        add(deleteCustomerbtn);
    }

    public void setDeleteCustomerbtn(JButton deleteCustomerbtn) {
        this.deleteCustomerbtn = deleteCustomerbtn;
    }

    public void setTxt_del_customer_id(JTextField txt_del_customer_id) {
        this.txt_del_customer_id = txt_del_customer_id;
    }

    public JButton getDeleteCustomerbtn() {
        return deleteCustomerbtn;
    }

    public JTextField getTxt_del_customer_id() {
        return txt_del_customer_id;
    }
}
