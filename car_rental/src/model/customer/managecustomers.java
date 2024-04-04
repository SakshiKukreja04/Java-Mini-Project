package model.customer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Displayable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class managecustomers extends filehandling implements Displayable {
    ArrayList<customers>customer= new ArrayList<customers>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public managecustomers(){readcustomersJsonfile("car_rental/src/model/customer/customerdata.json");
    }
    public ArrayList<customers> readcustomersJsonfile(String file_path)
    {
        try {

            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int customer_id = node.get("customer_id").asInt();
                    String f_name = node.get("f_name").asText();
                    String l_name = node.get("l_name").asText();
                    String mobile=node.get("mobile").asText();
                    String email = node.get("email").asText();
                    String address = node.get("address").asText();
                    String licence_number=node.get("licence_number").asText();

                    customers cus = new customers(customer_id,licence_number,f_name,l_name,mobile,email,address);
                    customer.add(cus);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customer;
    }
    public void writecustomersJsonfile(String file_path, ArrayList<customers> cus_al) throws IOException {
        ArrayList<Map<String,Object>> cus_to_be_written = new ArrayList<>();

        for(int i = 0; i < cus_al.size(); i++)
        {
            HashMap<String,Object> row=new HashMap<>();
            row.put("customer_id",customer.get(i).getCustomer_id());
            row.put("f_name",customer.get(i).getFname());
            row.put("l_name",customer.get(i).getLname());
            row.put("mobile",customer.get(i).getMobile());
            row.put("email",customer.get(i).getAddress());
            row.put("address",customer.get(i).getAddress());
            row.put("licence_number",customer.get(i).getLicence_number());

            cus_to_be_written.add(row);
        }
        objectMapper.writeValue(Paths.get(file_path).toFile(), cus_to_be_written);
        //objectMapper.writeValue(Paths.get("src/Model/Students/students.json").toFile(), students);

    }

    public void setCustomerTable(ArrayList<customers>customer) {
        this.customer= customer;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("CUSTOMER ID");
        headers.add("FIRST NAME");
        headers.add("LAST NAME");
        headers.add("MOBILE NUMBER");
        headers.add("EMAIL");
        headers.add("ADDRESS");
        headers.add("LICENCE");
        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> customer_details = new ArrayList<String>();

        customer_details.add(String.valueOf(customer.get(line).getCustomer_id()));
        customer_details.add(customer.get(line).getFname());
        customer_details.add(customer.get(line).getLname());
        customer_details.add(customer.get(line).getMobile());
        customer_details.add(customer.get(line).getEmail());
        customer_details.add(customer.get(line).getAddress());
        customer_details.add(customer.get(line).getLicence_number());


        return customer_details;
    }

    @Override
    public ArrayList<ArrayList<String>>getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> customer_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            customer_subset.add(getLine(i));
        }
        return customer_subset;
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

    public ArrayList<customers> getTable() {
        return customer;
    }
    
    public void addNewCustomer(int customer_id,String cus_fname,String cus_lname,String mobile,String email,String address,String licence)throws IOException{
        readcustomersJsonfile("car_rental/src/model/customer/customerdata.json");
        customers temp_cus=new customers(customer_id,cus_fname,cus_lname,mobile,email,address,licence);
        customer.add(temp_cus);
        writecustomersJsonfile("car_rental/src/model/customer/customerdata.json",customer);
    }
    public void editNewCustomer(int edit_cus_idx,int customer_id,String cus_fname,String cus_lname,String mobile,String email,String address,String licence)throws IOException{
        readcustomersJsonfile("car_rental/src/model/customer/customerdata.json");
        customer.get(edit_cus_idx).setCustomer_id(customer_id);
        customer.get(edit_cus_idx).setFname(cus_fname);
        customer.get(edit_cus_idx).setLname(cus_lname);
        customer.get(edit_cus_idx).setMobile(mobile);
        customer.get(edit_cus_idx).setEmail(email);
        customer.get(edit_cus_idx).setAddress(address);
        customer.get(edit_cus_idx).setLicence_number(licence);
        writecustomersJsonfile("car_rental/src/model/customer/customerdata.json",customer);
    }
    public void deletecustomer(int edit_cus_idx)throws IOException{
        readcustomersJsonfile("car_rental/src/model/customer/customerdata.json");
        customer.remove(edit_cus_idx);
        writecustomersJsonfile("car_rental/src/model/customer/customerdata.json",customer);
    }
    
}


