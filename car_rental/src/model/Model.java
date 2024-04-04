package model;

import model.cars.managecars;
import model.customer.managecustomers;
import model.rents.managerents;

public class Model {
    managecustomers mc;
    managecars mt;
    managerents mr;

    public Model(){
        mc=new managecustomers();
        mt=new managecars();
        mr=new managerents();
    }

    public void setMc(managecustomers mc) {
        this.mc = mc;
    }

    public void setMt(managecars mt) {
        this.mt = mt;
    }

    public void setMr(managerents mr) {
        this.mr = mr;
    }

    public managecustomers getMc() {
        return mc;
    }

    public managecars getMt() {
        return mt;
    }

    public managerents getMr() {
        return mr;
    }
}
