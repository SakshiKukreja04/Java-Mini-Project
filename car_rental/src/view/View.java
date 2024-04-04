package view;

import view.Car.ManageCarFrame;
import view.Rent.ManageRentFrame;

import java.awt.*;
import java.util.ArrayList;

public class View {
    FirstFrame ff;
    ManageCustomerFrame mcf;
    ManageCarFrame mtf;
    ManageRentFrame mrf;


    public View(){
        ff=new FirstFrame();
        mcf=new ManageCustomerFrame();
        mtf=new ManageCarFrame();
        mrf=new ManageRentFrame();

    }
    public void centerInitialSetupCustomer(int linesBeingDisplayed,int size){
        mcf.getIp().getCp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mcf.getIp().getCp().createButtons((linesBeingDisplayed+1)*size);
    }
    public void centerInitialSetupCar(int linesBeingDisplayed,int size){
        mtf.getIpt().getCtp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mtf.getIpt().getCtp().createbuttons((linesBeingDisplayed+1)*size);
    }
    public void centerInitialSetupRent(int linesBeingDisplayed,int size){
        mrf.getIpr().getRtp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mrf.getIpr().getRtp().createbuttons((linesBeingDisplayed+1)*size);
    }

    public void ceterupdatecustomer(ArrayList<ArrayList<String>>lines,ArrayList<String>header) {
        for (int i = 0; i < header.size(); i++) {
            mcf.getIp().getCp().getAllButtons().get(i).setText(header.get(i));
        }

        for (int player_no = 0; player_no < lines.size(); player_no++) {
            for (int player_col_no = 0; player_col_no < header.size(); player_col_no++) {
                int button_no = player_no * header.size() + header.size() + player_col_no;
                String button_txt = lines.get(player_no).get(player_col_no);

                mcf.getIp().getCp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }


    public void ceterupdatecar(ArrayList<ArrayList<String>>lines,ArrayList<String>header){
        for (int i = 0; i < header.size(); i++)
        {
            mtf.getIpt().getCtp().getAllButtons().get(i).setText(header.get(i));
        }

        for (int car_no = 0; car_no < lines.size(); car_no++)
        {
            for (int car_col_no = 0; car_col_no < header.size(); car_col_no++)
            {
                int button_no = car_no * header.size() + header.size() + car_col_no;
                String button_txt = lines.get(car_no).get(car_col_no);

                mtf.getIpt().getCtp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }
    public void ceterupdaterent(ArrayList<ArrayList<String>>lines,ArrayList<String>header) {
        for (int i = 0; i < header.size(); i++) {
            mrf.getIpr().getRtp().getAllButtons().get(i).setText(header.get(i));
        }

        for (int rent_no = 0; rent_no < lines.size(); rent_no++) {
            for (int rent_col_no = 0; rent_col_no < header.size(); rent_col_no++) {
                int button_no = rent_no * header.size() + header.size() + rent_col_no;
                String button_txt = lines.get(rent_no).get(rent_col_no);

                mrf.getIpr().getRtp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }
    public void setFf(FirstFrame ff) {
        this.ff = ff;
    }

    public FirstFrame getFf() {
        return ff;
    }

    public void setMcf(ManageCustomerFrame mcf) {
        this.mcf = mcf;
    }

    public ManageCustomerFrame getMcf() {
        return mcf;
    }

    public void setMtf(ManageCarFrame mtf) {
        this.mtf = mtf;
    }

    public ManageCarFrame getMtf() {
        return mtf;
    }

    public void setMrf(ManageRentFrame mrf) {
        this.mrf = mrf;
    }

    public ManageRentFrame getMrf() {
        return mrf;
    }
}
