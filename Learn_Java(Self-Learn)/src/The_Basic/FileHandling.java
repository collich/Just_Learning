package The_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling {
    public void writeFile(String fileName, String bodyContext){
        try (BufferedWriter wb = new BufferedWriter(new FileWriter(fileName))){
            wb.write(bodyContext);
            String fileNameCreation = String.format("File, %s, have been created with\n%s\nAs it's context", fileName, bodyContext);
            System.out.println(fileNameCreation);
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readFile(String filename){
        try (BufferedReader rb = new BufferedReader(new FileReader(filename))){
            // String readFile = rb.read();
            String readFileLine;
            while ((readFileLine = rb.readLine()) != null) {
                System.out.println(readFileLine);
            }
            // System.out.println(readFile);
            rb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
