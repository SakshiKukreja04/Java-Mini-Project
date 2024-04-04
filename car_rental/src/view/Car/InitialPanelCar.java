package view.Car;

import javax.swing.*;
import java.awt.*;

public class InitialPanelCar extends JPanel{
    private CarTablePanel ctp;
    private AddCarPanel apt;
    private EditCarPanel ecp;
    private DeleteCarPanel dcp;

    public InitialPanelCar(){
        super();
        ctp=new CarTablePanel();
        add(ctp);
        apt=new AddCarPanel();
        add(apt);
        ecp=new EditCarPanel();
        add(ecp);
        dcp=new DeleteCarPanel();
        add(dcp);
        setBackground( Color.black);
    }

    public CarTablePanel getCtp() {
        return ctp;
    }

    public void setCtp(CarTablePanel ctp) {
        this.ctp = ctp;
    }

    public AddCarPanel getApt() {
        return apt;
    }

    public void setApt(AddCarPanel apt) {
        this.apt = apt;
    }

    public void setEcp(EditCarPanel ecp) {
        this.ecp = ecp;
    }

    public void setDcp(DeleteCarPanel dcp) {
        this.dcp = dcp;
    }

    public EditCarPanel getEcp() {
        return ecp;
    }

    public DeleteCarPanel getDcp() {
        return dcp;
    }
}
