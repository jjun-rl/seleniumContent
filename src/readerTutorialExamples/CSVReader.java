package readerTutorialExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
//    public static void main(String[] args) {
    public void parser() {
        String path = "/Users/jjun/Downloads/FL_insurance_sample.csv";
//        Will store line values from BufferedReader (see line 17 and 19
        String line = "";
//        FileReader will display error, as path may not exist--thus requiring a try/catch wrapper
        try {
//        BufferedReader is more efficient than scanner
//            need to pass in reader object into constructor, since there was no reader object, created "new FileReader(path)"
            BufferedReader br = new BufferedReader(new FileReader(path));
//            infinitely go through file
//            while next line is not null, take the line, parse it with commas, and store line--then proceed to next line
//            (BUT to store line ^^^^ need to first create a variable)
//            (line = br.readLine()) will complain because it can throw an IO exception, SO tack it on to catch to take care of issue
            while ((line = br.readLine()) != null) {
//                array of all values in line
                String[] values = line.split(",");
                System.out.println("Date: " + values[0] + ", Crime description: " + values[5]);
//                System.out.println(values[0]);
//                System.out.println(values[1]);
//                System.out.println(line);
//                break;
            }
        } catch (FileNotFoundException e) {
//            if file doesn't exist, will print stack trace
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
