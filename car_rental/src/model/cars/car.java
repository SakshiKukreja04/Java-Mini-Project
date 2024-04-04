package model.cars;
public class car {
    String company;
    int year;
    String color;
    public car() {
        System.out.println("Creating a car");
    }
    public car(String company,int year, String color) {
        this.setCompany(company);
        this.setYear(year);
        this.setColor(color);
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCompany() {
        return company;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }

    public void display() {
        System.out.println("Car company: " + getCompany());
        System.out.println("Car manufacturing year: " + getYear());
        System.out.println("Car color: " + getColor());
    }
}
