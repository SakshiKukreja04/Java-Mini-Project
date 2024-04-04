package model.utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class texthandlingfile {
    public static void main(String[] args) {
        try {
            File Obj = new File("src/Model/Utils/my_file.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "
                        + Obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter Writer
                    = new FileWriter("src/Model/Utils/my_file.txt");
            Writer.write(
                    "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        try {
            File Obj = new File("src/Model/Utils/my_file.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
