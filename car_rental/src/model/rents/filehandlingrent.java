package model.rents;

import java.io.IOException;
import java.util.ArrayList;

public abstract class filehandlingrent {
    protected abstract ArrayList<rent> readRentJsonfile(String file_path);
    protected abstract void writeRentJsonfile(String file_path, ArrayList<rent> rents) throws IOException;
}
