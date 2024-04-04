package model.customer;
public class person {
    String f_name;
    String l_name;
    String mobile;
    String email;
    String address;


    public person()
    {
        System.out.println("Creating a Person");
    }

    public person(String f_name, String l_name,String mobile, String email, String address)
    {
        this.setFname(f_name);
        this.setLname(l_name);
        this.setMobile(mobile);
        this.setEmail(email);
        this.setAddress(address);

    }

    public void setFname(String f_name) {
        this.f_name = f_name;
    }

    public void setLname(String l_name) {
        this.l_name = l_name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getFname() {
        return f_name;
    }

    public String getLname() {
        return l_name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    public void display()
    {
        System.out.println("Customer First Name: "+getFname());
        System.out.println("Customer Last Name: "+getLname());
        System.out.println("Customer Mobile No: "+getMobile());
        System.out.println("Customer Email: "+getEmail());
        System.out.println("Customer Address: "+getAddress());

    }
}


