package Controller;

import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.IOException;

public class Controller {
    Model model;
    View view;
    public Controller(Model m,View v)
    {
        model=m;
        view =v;

        view.getFf().getManagecusbtn().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("Customer button clicked");
                 view.getFf().setVisible(false);
                 view.getMcf().setVisible(true);
             }
         });
        view.getMcf().addWindowListener(new java.awt.event.WindowAdapter(){
             public void windowClosing(java.awt.event.WindowEvent windowEvent){
                 view.getFf().setVisible(true);
             }
        });
        model.getMc().setLinesBeingDisplayed(5);
        view.centerInitialSetupCustomer(model.getMc().getLinesBeingDisplayed(),model.getMc().getHeaders().size());

        model.getMc().setFirstLineToDisplay(0);
        view.ceterupdatecustomer(model.getMc().getLines(model.getMc().getFirstLineToDisplay(),model.getMc().getLastLineToDisplay()),model.getMc().getHeaders());

        view.getMcf().getIp().getApc().getAddCustomerbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add Customer button clicked");
                String txt_customer_id=view.getMcf().getIp().getApc().getTxt_customer_id().getText();
                String txt_fname=view.getMcf().getIp().getApc().getTxt_fname().getText();
                String txt_lname=view.getMcf().getIp().getApc().getTxt_lname().getText();
                String txt_mobile=view.getMcf().getIp().getApc().getTxt_mobile().getText();
                String txt_email=view.getMcf().getIp().getApc().getTxt_email().getText();
                String txt_address=view.getMcf().getIp().getApc().getTxt_address().getText();
                String txt_licence=view.getMcf().getIp().getApc().getTxt_licence().getText();
                try {
                    model.getMc().addNewCustomer(Integer.valueOf(txt_customer_id), txt_fname, txt_lname, txt_mobile, txt_email, txt_address, txt_licence);
                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMcf().getIp().getEp().getGetCustomerbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get Customer details Clixked");
                String txt_cus_idx=view.getMcf().getIp().getEp().getTxt_get_Cus_idx().getText();
                model.getMc().readcustomersJsonfile("car_rental/src/model/customer/customerdata.json");
                int customer_id=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getCustomer_id();
                String f_name=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getFname();
                String l_name=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getLname();
                String mobile=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getMobile();
                String email=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getEmail();
                String address=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getAddress();
                String licence=model.getMc().getTable().get(Integer.valueOf(txt_cus_idx)).getLicence_number();

                view.getMcf().getIp().getEp().getTxt_customer_id().setText(String.valueOf(customer_id));
                view.getMcf().getIp().getEp().getTxt_fname().setText(f_name);
                view.getMcf().getIp().getEp().getTxt_lname().setText(l_name);
                view.getMcf().getIp().getEp().getTxt_mobile().setText(mobile);
                view.getMcf().getIp().getEp().getTxt_email().setText(email);
                view.getMcf().getIp().getEp().getTxt_address().setText(address);
                view.getMcf().getIp().getEp().getTxt_licence().setText(licence);
            }
        });
        view.getMcf().getIp().getEp().getEditCustomerbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Customer Button clicked");
                String  txt_cus_idx=view.getMcf().getIp().getEp().getTxt_get_Cus_idx().getText();
                String txt_customer_id=view.getMcf().getIp().getEp().getTxt_customer_id().getText();
                String txt_fname=view.getMcf().getIp().getEp().getTxt_fname().getText();
                String txt_lname=view.getMcf().getIp().getEp().getTxt_lname().getText();
                String txt_mobile=view.getMcf().getIp().getEp().getTxt_mobile().getText();
                String txt_email=view.getMcf().getIp().getEp().getTxt_email().getText();
                String txt_address=view.getMcf().getIp().getEp().getTxt_address().getText();
                String txt_licence=view.getMcf().getIp().getEp().getTxt_licence().getText();
                try{
                    model.getMc().editNewCustomer(Integer.valueOf(txt_cus_idx),Integer.valueOf(txt_customer_id),txt_fname,txt_lname,txt_mobile,txt_email,txt_address,txt_licence);
                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMcf().getIp().getDp().getDeleteCustomerbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete Customer Button Clicked");
                String txt_cus_idx=view.getMcf().getIp().getDp().getTxt_del_customer_id().getText();
                try{
                    model.getMc().deletecustomer(Integer.valueOf(txt_cus_idx));
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMcf().getIp().getCp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMc().getFirstLineToDisplay();
                int current_last_line = model.getMc().getLastLineToDisplay();
                int no_of_customers = model.getMc().getTable().size();
                int no_of_display_lines = model.getMc().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMc().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMc().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMc().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_customers-1)
                {
                    model.getMc().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_customers-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_customers - no_of_display_lines)
                    {
                        new_first_line = no_of_customers-no_of_display_lines;
                        model.getMc().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMc().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.ceterupdatecustomer(model.getMc().getLines(model.getMc().getFirstLineToDisplay(), model.getMc().getLastLineToDisplay()), model.getMc().getHeaders());
            }
        });


        view.getFf().getManagecarbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Car button clicked");
                view.getFf().setVisible(false);
                view.getMtf().setVisible(true);
            }
        });
        view.getMtf().addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent windowEvent){
                view.getFf().setVisible(true);
            }
        });
        model.getMt().setLinesBeingDisplayed(5);
        view.centerInitialSetupCar(model.getMt().getLinesBeingDisplayed(),model.getMt().getHeaders().size());
        model.getMt().setFirstLineToDisplay(0);
        view.ceterupdatecar(model.getMt().getLines(model.getMt().getFirstLineToDisplay(),model.getMt().getLastLineToDisplay()),model.getMt().getHeaders());

        view.getMtf().getIpt().getApt().getAddCarBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add Car Button clicked");
                String txt_car_id=view.getMtf().getIpt().getApt().getTxt_car_id().getText();
                String txt_company=view.getMtf().getIpt().getApt().getTxt_company().getText();
                String txt_year=view.getMtf().getIpt().getApt().getTxt_year().getText();
                String txt_color=view.getMtf().getIpt().getApt().getTxt_color().getText();
                String txt_model=view.getMtf().getIpt().getApt().getTxt_model().getText();
                try{
                    model.getMt().addNewCars(Integer.valueOf(txt_car_id),txt_model,txt_company,Integer.valueOf(txt_year),txt_color);
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMtf().getIpt().getEcp().getGetCarbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get car details Button clicked");
                String txt_car_idx=view.getMtf().getIpt().getEcp().getTxt_get_car_idx().getText();
                model.getMt().readcarsJsonfile("car_rental/src/model/cars/cardata.json");
                int car_id=model.getMt().getTable().get(Integer.valueOf(txt_car_idx)).getCar_id();
                String company=model.getMt().getTable().get(Integer.valueOf(txt_car_idx)).getCompany();
                int year=model.getMt().getTable().get(Integer.valueOf(txt_car_idx)).getYear();
                String color=model.getMt().getTable().get(Integer.valueOf(txt_car_idx)).getColor();
                String car_model=model.getMt().getTable().get(Integer.valueOf(txt_car_idx)).getCar_model();
                view.getMtf().getIpt().getEcp().getTxt_car_id().setText(String.valueOf(car_id));
                view.getMtf().getIpt().getEcp().getTxt_company().setText(company);
                view.getMtf().getIpt().getEcp().getTxt_year().setText(String.valueOf(year));
                view.getMtf().getIpt().getEcp().getTxt_color().setText(color);
                view.getMtf().getIpt().getEcp().getTxt_model().setText(car_model);
            }
        });
        view.getMtf().getIpt().getEcp().getEditCarbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Car Button clicked");
                String txt_car_idx=view.getMtf().getIpt().getEcp().getTxt_get_car_idx().getText();
                String txt_car_id=view.getMtf().getIpt().getEcp().getTxt_car_id().getText();
                String txt_company=view.getMtf().getIpt().getEcp().getTxt_company().getText();
                String txt_year=view.getMtf().getIpt().getEcp().getTxt_year().getText();
                String txt_color=view.getMtf().getIpt().getEcp().getTxt_color().getText();
                String txt_model=view.getMtf().getIpt().getEcp().getTxt_model().getText();
                try{
                    model.getMt().editNewCars(Integer.valueOf(txt_car_idx),Integer.valueOf(txt_car_id),txt_company,Integer.valueOf(txt_year),txt_color,txt_model);
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMtf().getIpt().getDcp().getDelCarbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete Car Butto clicked");
                String txt_car_idx=view.getMtf().getIpt().getDcp().getTxt_del_car_id().getText();
                try{
                    model.getMt().deleteCars(Integer.valueOf(txt_car_idx));
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMtf().getIpt().getCtp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMt().getFirstLineToDisplay();
                int current_last_line = model.getMt().getLastLineToDisplay();
                int no_of_cars = model.getMt().getTable().size();
                int no_of_display_lines = model.getMt().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMt().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMt().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMt().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_cars-1)
                {
                    model.getMt().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_cars-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_cars - no_of_display_lines)
                    {
                        new_first_line = no_of_cars-no_of_display_lines;
                        model.getMt().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMt().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.ceterupdatecar(model.getMt().getLines(model.getMt().getFirstLineToDisplay(), model.getMt().getLastLineToDisplay()), model.getMt().getHeaders());
            }


        });

        view.getFf().getManagerentbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Rent button clicked");
                view.getFf().setVisible(false);
                view.getMrf().setVisible(true);
            }
        });
        view.getMrf().addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent windowEvent){
                view.getFf().setVisible(true);
            }
        });
        model.getMr().setLinesBeingDisplayed(5);
        view.centerInitialSetupRent(model.getMr().getLinesBeingDisplayed(),model.getMr().getHeaders().size());
        model.getMr().setFirstLineToDisplay(0);
        view.ceterupdaterent(model.getMr().getLines(model.getMr().getFirstLineToDisplay(),model.getMr().getLastLineToDisplay()),model.getMr().getHeaders());

        view.getMrf().getIpr().getApr().getAddRentbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add Rent Button Clicked");
                String txt_c_temp=view.getMrf().getIpr().getApr().getTxt_c_temp().getText();
                String txt_t_temp=view.getMrf().getIpr().getApr().getTxt_t_temp().getText();
                String txt_rentdate=view.getMrf().getIpr().getApr().getTxt_rent_date().getText();
                String txt_rentfees=view.getMrf().getIpr().getApr().getTxt_rent_fees().getText();
                try{
                    model.getMr().addNewRent(Integer.valueOf(txt_c_temp),Integer.valueOf(txt_t_temp),txt_rentdate,Integer.valueOf(txt_rentfees));
                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        view.getMrf().getIpr().getErp().getGetRentbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get Rent Details Button clicked");
                String txt_rent_idx=view.getMrf().getIpr().getErp().getTxt_get_rent_idx().getText();
                model.getMr().readRentJsonfile("car_rental/src/model/rents/rentdata.json");
                int c_temp=model.getMr().getTable().get(Integer.valueOf(txt_rent_idx)).getC_temp().getCustomer_id();
                int t_temp=model.getMr().getTable().get(Integer.valueOf(txt_rent_idx)).getT_temp().getCar_id();
                String rent_date=model.getMr().getTable().get(Integer.valueOf(txt_rent_idx)).getRent_date();
                int rent_fees=model.getMr().getTable().get(Integer.valueOf(txt_rent_idx)).getRent_fees();
                view.getMrf().getIpr().getErp().getTxt_c_temp().setText(String.valueOf(c_temp));
                view.getMrf().getIpr().getErp().getTxt_t_temp().setText(String.valueOf(t_temp));
                view.getMrf().getIpr().getErp().getTxt_rent_date().setText(rent_date);
                view.getMrf().getIpr().getErp().getTxt_rent_fees().setText(String.valueOf(rent_fees));
            }
        });
        view.getMrf().getIpr().getErp().getEditRentbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Rent Button Clicked");
                String txt_rent_idx = view.getMrf().getIpr().getErp().getTxt_get_rent_idx().getText();
                String txt_c_temp = view.getMrf().getIpr().getErp().getTxt_c_temp().getText();
                String txt_t_temp = view.getMrf().getIpr().getErp().getTxt_t_temp().getText();
                String txt_rent_date = view.getMrf().getIpr().getErp().getTxt_rent_date().getText();
                String txt_rent_fees = view.getMrf().getIpr().getErp().getTxt_rent_fees().getText();
                try {
                    model.getMr().editNewRent(Integer.valueOf(txt_rent_idx), Integer.valueOf(txt_c_temp), Integer.valueOf(txt_t_temp), txt_rent_date, Integer.valueOf(txt_rent_fees));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            });
        view.getMrf().getIpr().getRtp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMr().getFirstLineToDisplay();
                int current_last_line = model.getMr().getLastLineToDisplay();
                int no_of_rents = model.getMr().getTable().size();
                int no_of_display_lines = model.getMr().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMr().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMr().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMr().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_rents-1)
                {
                    model.getMr().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_rents-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_rents - no_of_display_lines)
                    {
                        new_first_line = no_of_rents-no_of_display_lines;
                        model.getMr().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMr().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.ceterupdaterent(model.getMr().getLines(model.getMr().getFirstLineToDisplay(), model.getMr().getLastLineToDisplay()), model.getMr().getHeaders());
            }
        });
    }}




