package model.customer;

public class customers extends person{
    private static int customer_count=0;
    int customer_id;
    String licence_number;

    public static int getCustomer_count(){
        return customer_count;
    }
    public static void setCustomer_count(int count){
        customer_count=count;
    }
    public customers(){
        setCustomer_count(getCustomer_count()+1);
        this.setCustomer_id(customer_count);
    }
    public customers(String licence_number,String f_name,String l_name,String mobile,String email,String address){
        super(f_name,l_name,mobile,email,address);
        setCustomer_count(getCustomer_count()+1);
        this.setCustomer_id(customer_count);
        this.setLicence_number(licence_number);

    }
    public customers(int customer_id,String licence_number,String f_name,String l_name,String mobile,String email,String address){
        super(f_name,l_name,mobile,email,address);
        setCustomer_count(getCustomer_count()+1);
        this.setCustomer_id(customer_id);
        this.setLicence_number(licence_number);


    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setLicence_number(String licence_number) {
        this.licence_number=licence_number;
    }


    public int getCustomer_id(){
        return customer_id;
    }
    public String getLicence_number(){
        return licence_number;
    }

    public void display(){
        System.out.println("Customer_id: "+getCustomer_id());
        System.out.println("Customer licence number: "+getLicence_number());
        super.display();
    }
}



