package The_Basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling {
    public void writeFile(String fileName, String bodyContext){
        try (BufferedWriter wb = new BufferedWriter(new FileWriter(fileName))){
            wb.write(bodyContext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
