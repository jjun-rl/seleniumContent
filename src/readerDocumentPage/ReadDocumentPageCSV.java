package readerDocumentPage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDocumentPageCSV {
    public Object rocketLawyerBaseURL() {
//        readerTutorialExamples.CSVReader obj = new readerTutorialExamples.CSVReader();
//        obj.parser();
        String path = "/Users/jjun/Documents/csv_files/US Content Pages - DocumentPage.csv";
        List<List<String>> records = new ArrayList<>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
//                System.out.println("Hyperlink: " + values[0] + ", Content Page: " + values[1] + ", Title: " + values[2] + ", Path: " + values[3]);
//                System.out.println("Title: " + values[2]);
//                ArrayList<Object> arrLines = new ArrayList<Object>();
//                arrLines.add(values);
//                    String baseURL = values[0];
//                return arrLines;
                records.add(Arrays.asList(values));
                return records;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

}