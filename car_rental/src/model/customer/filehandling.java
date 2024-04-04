package model.customer;

import java.io.IOException;
import java.util.ArrayList;

public abstract class filehandling {
    protected abstract ArrayList<customers> readcustomersJsonfile(String file_path);
    protected abstract void writecustomersJsonfile(String file_path, ArrayList<customers> customer) throws IOException;
}
