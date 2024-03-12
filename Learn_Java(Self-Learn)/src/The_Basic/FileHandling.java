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
            System.out.println("----------\nFile Created:");
            String fileNameCreation = String.format("File: \"%s\"\nContext: \"%s\"", fileName, bodyContext);
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
            System.out.println("----------\nContext:");
            while ((readFileLine = rb.readLine()) != null) {
                System.out.println(readFileLine);
            }
            System.out.println("\nEnd--Of--File");
            // System.out.println(readFile);
            rb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void appendFile(String filename, String bodyContext){
        try (BufferedWriter af = new BufferedWriter(new FileWriter(filename, true))){
            af.write("\n" + bodyContext);
            af.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void replaceFile(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            // StringBuilder linesString = new StringBuilder();
            String line;

            System.out.println("\nYour file output:");
            while ((line = reader.readLine()) != null) {
                // linesString.append(line)
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
