package model.rents;

import model.cars.type;
import model.customer.customers;
public class rent {
    customers c_temp;
    type t_temp;
    String rent_date;
    int rent_fees;

    public rent(customers c, type t, String r_date, int fees)
    {
        setC_temp(c);
        setT_temp(t);
        setRent_date(r_date);
        setRent_fees(fees);
    }

    public void setC_temp(customers c_temp) {
        this.c_temp = c_temp;
    }

    public void setT_temp(type t_temp) {
        this.t_temp = t_temp;
    }

    public void setRent_date(String rent_date) {
        this.rent_date = rent_date;
    }

    public void setRent_fees(int rent_fees) {
        this.rent_fees = rent_fees;
    }

    public customers getC_temp() {
        return c_temp;
    }

    public type getT_temp() {
        return t_temp;
    }

    public String getRent_date() {
        return rent_date;
    }

    public int getRent_fees() {
        return rent_fees;
    }

}


