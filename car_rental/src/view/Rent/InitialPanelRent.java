package view.Rent;

import javax.swing.*;
import java.awt.*;

public class InitialPanelRent extends JPanel {
    private RentTablePanel rtp;
    private AddRentPanel apr;
    private EditRentPanel erp;
    private DeleteRentPanel drp;

    public InitialPanelRent(){
        super();
        rtp=new RentTablePanel();
        add(rtp);
        apr=new AddRentPanel();
        add(apr);
        erp=new EditRentPanel();
        add(erp);
        drp=new DeleteRentPanel();
        add(drp);
        setBackground( Color.black);
    }

    public void setRtp(RentTablePanel rtp) {
        this.rtp = rtp;
    }

    public RentTablePanel getRtp() {
        return rtp;
    }

    public void setApr(AddRentPanel apr) {
        this.apr = apr;
    }

    public AddRentPanel getApr() {
        return apr;
    }

    public void setDrp(DeleteRentPanel drp) {
        this.drp = drp;
    }

    public void setErp(EditRentPanel erp) {
        this.erp = erp;
    }

    public EditRentPanel getErp() {
        return erp;
    }

    public DeleteRentPanel getDrp() {
        return drp;
    }
}

