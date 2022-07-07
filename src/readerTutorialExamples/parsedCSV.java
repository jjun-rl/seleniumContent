package readerTutorialExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class parsedCSV {
    public static void main(String[] args) {
        String path = "/Users/jjun/Documents/csv_files/combined.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
//
            {
                int i = 0;
//
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    i++;
                    System.out.println("Hyperlink: " + values[0] + ", Content Page: " + values[1] + ", Title: " + values[2] + ", Path: " + values[3]);
//                System.out.println("Title: " + values[2]);
//                    System.out.println(values);
                    System.out.println(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}