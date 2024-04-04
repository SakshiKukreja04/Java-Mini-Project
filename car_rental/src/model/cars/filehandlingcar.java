package model.cars;
import java.io.IOException;
import java.util.ArrayList;

public abstract class filehandlingcar {
    protected abstract ArrayList<type> readcarsJsonfile(String file_path);
    protected abstract void writecarsJsonfile(String file_path, ArrayList<type> cars) throws IOException;
}
