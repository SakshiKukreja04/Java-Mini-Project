package model.cars;

public class type extends car{
    private static int cars_count=0;
    int car_id;
    String car_model;




    public type(int car_id, String car_model, String company, int car_year, String car_color){
        super(company,car_year,car_color);
        this.setCar_id(car_id);
        this.setCar_type(car_model);

    }
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public void setCar_type(String car_type) {
        this.car_model = car_type;
    }

    public int getCar_id() {
        return car_id;
    }

    public String getCar_model() {
        return car_model;
    }
    public void display(){
        System.out.println("Car_id: "+getCar_id());
        System.out.println("Car model: "+getCar_model());
        super.display();
    }

}