package model.cars;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Displayable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class managecars extends filehandlingcar implements Displayable {
    ArrayList<type> cars= new ArrayList<type>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public managecars(){
        readcarsJsonfile("car_rental/src/model/cars/cardata.json");
    }
    public ArrayList<type> readcarsJsonfile(String file_path)
    {
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int car_id = node.get("car_id").asInt();
                    String company = node.get("company").asText();
                    int year= node.get("year").asInt();
                    String color=node.get("color").asText();
                    String car_model = node.get("car_model").asText();
                    type c1= new type(car_id,car_model,company,year,color);
                    cars.add(c1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cars;
    }
    public void writecarsJsonfile(String file_path, ArrayList<type> car_al) throws IOException {
        ArrayList<Map<String,Object>> car_to_be_written = new ArrayList<>();

        for(int i = 0; i < car_al.size(); i++)
        {
            HashMap<String,Object> row=new HashMap<>();
            row.put("car_id",cars.get(i).getCar_id());
            row.put("company",cars.get(i).getCompany());
            row.put("year",cars.get(i).getYear());
            row.put("color",cars.get(i).getColor());
            row.put("car_model",cars.get(i).getCar_model());


            car_to_be_written.add(row);
        }
        objectMapper.writeValue(Paths.get(file_path).toFile(), car_to_be_written);
        //objectMapper.writeValue(Paths.get("src/Model/Students/students.json").toFile(), students);



    }

    public void setCarsTable(ArrayList<type>cars) {
        this.cars= cars;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("CAR ID");
        headers.add("COMPANY");
        headers.add("MANUFACTURING YEAR");
        headers.add("COLOR");
        headers.add("MODEL");
        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> car_details = new ArrayList<String>();

        car_details.add(String.valueOf(cars.get(line).getCar_id()));
        car_details.add(cars.get(line).getCompany());
        car_details.add(String.valueOf(cars.get(line).getYear()));
        car_details.add(cars.get(line).getColor());
        car_details.add(cars.get(line).getCar_model());

        return car_details;
    }

    @Override
    public ArrayList<ArrayList<String>>getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> car_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            car_subset.add(getLine(i));
        }
        return car_subset;
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
        setLastLineToDisplay(getFirstLineToDisplay() + getLinesBeingDisplayed() - 1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList<type> getTable() {
        return cars;
    }

    public void addNewCars(int car_id, String car_model, String company, int car_year, String car_color) throws IOException {
        readcarsJsonfile("car_rental/src/model/cars/cardata.json");
        type temp_car=new type(car_id, car_model, company,  car_year, car_color);
        cars.add(temp_car);
        writecarsJsonfile("car_rental/src/model/cars/cardata.json",cars);

    }

    public void editNewCars(int edit_car_idx, int car_id, String company, int year, String color,String model) throws IOException {
        readcarsJsonfile("car_rental/src/model/cars/cardata.json");
        cars.get(edit_car_idx).setCar_id(car_id);
        cars.get(edit_car_idx).setCompany(company);
        cars.get(edit_car_idx).setYear(year);
        cars.get(edit_car_idx).setColor(color);
        cars.get(edit_car_idx).setCar_type(model);
        writecarsJsonfile("car_rental/src/model/cars/cardata.json",cars);
    }

    public void deleteCars(int edit_car_idx) throws IOException {
        readcarsJsonfile("car_rental/src/model/cars/cardata.json");
        cars.remove(edit_car_idx);
        writecarsJsonfile("car_rental/src/model/cars/cardata.json",cars);
    }
}


