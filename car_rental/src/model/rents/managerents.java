package model.rents;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Displayable;
import model.cars.managecars;
import model.cars.type;
import model.customer.customers;
import model.customer.managecustomers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class managerents extends filehandlingrent implements Displayable {
    ArrayList<customers> customer = new ArrayList<customers>();

    ArrayList<type> cars = new ArrayList<type>();

    ArrayList<rent> rents = new ArrayList<rent>();

    ArrayList<Map<String, Object>> handle_data = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public managerents(){
        managecustomers mc1 = new managecustomers();
        customer = mc1.getTable();
        managecars mt1 = new managecars();
        cars = mt1.getTable();
        readRentJsonfile("car_rental/src/model/rents/rentdata.json");
    }
    @Override
    public ArrayList<rent> readRentJsonfile(String file_path) {
        try {
            rents.clear();
            JsonNode rootNode = objectMapper.readTree(new File(file_path));
            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    customers c_temp_obj = null;
                    int c_temp = node.get("c_temp").asInt();
                    for(customers customer1:customer){
                        if(c_temp==customer1.getCustomer_id()){
                            c_temp_obj=customer1;
                        }
                    }
                    int t_temp = node.get("t_temp").asInt();
                    type t_temp_obj = null;
                    for(type cars1:cars){
                        if(t_temp==cars1.getCar_id()){
                            t_temp_obj=cars1;
                        }
                    }
                    String rent_date = node.get("rent_date").asText();
                    int rent_fees = node.get("rent_fees").asInt();
                    rents.add(new rent(c_temp_obj, t_temp_obj, rent_date, rent_fees));
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return rents;
    }

    @Override
    public void writeRentJsonfile(String file_path, ArrayList<rent> rent_al) throws IOException {
        ArrayList<Map<String,Object>> rent_to_be_written = new ArrayList<>();

        for(int i = 0; i < rent_al.size(); i++)
        {
            HashMap<String,Object>row=new HashMap<>();
            row.put("c_temp",rents.get(i).getC_temp().getCustomer_id());
            row.put("t_temp",rents.get(i).getT_temp().getCar_id());
            row.put("rent_date",rents.get(i).getRent_date());
            row.put("rent_fees",rents.get(i).getRent_fees());

            rent_to_be_written.add(row);
        }

        objectMapper.writeValue(Paths.get(file_path).toFile(), rent_to_be_written);
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Id");
        headers.add("Company");
        headers.add("Rent Date");
        headers.add("Rent Fees");


        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> rent_details = new ArrayList<String>();

        rent_details.add(String.valueOf(rents.get(line).getC_temp().getCustomer_id()));
        rent_details.add(String.valueOf(rents.get(line).getT_temp().getCar_id()));
        rent_details.add(rents.get(line).getRent_date());
        rent_details.add(String.valueOf(rents.get(line).getRent_fees()));


        return rent_details;
    }
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> car_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            car_subset.add(getLine(i));
        }
        return car_subset;
    }



    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex=firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine=highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex=lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    @Override
    public int getFirstLineToDisplay() {
        return firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(getFirstLineToDisplay()+getLinesBeingDisplayed()-1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    public ArrayList <rent> getTable() {
        return rents;
    }

    public void addNewRent(int rent_c_id,int rent_t_id,String rent_date,int rent_fees)throws IOException{
        readRentJsonfile("car_rental/src/model/rents/rentdata.json");
        rent temp_r=new rent(customer.get(rent_c_id),cars.get(rent_t_id),rent_date,rent_fees);
        rents.add(temp_r);
        writeRentJsonfile("car_rental/src/model/rents/rentdata.json",rents);
        
    }
    public void editNewRent(int edit_rent_idx, int rent_c_id,int rent_t_id,String rent_date,int rent_fees)throws IOException{
        readRentJsonfile("car_rental/src/model/rents/rentdata.json");
        rents.get(edit_rent_idx).setC_temp(customer.get(rent_c_id));
        rents.get(edit_rent_idx).setT_temp(cars.get(rent_t_id));
        rents.get(edit_rent_idx).setRent_date(rent_date);
        rents.get(edit_rent_idx).setRent_fees(rent_fees);
        writeRentJsonfile("car_rental/src/model/rents/rentdata.json",rents);
    }
    public void deleteRent(int edit_rent_idx)throws IOException{
        readRentJsonfile("car_rental/src/model/rents/rentdata.json");
        rents.remove(edit_rent_idx);
        writeRentJsonfile("car_rental/src/model/rents/rentdata.json",rents);
    }
    

}


