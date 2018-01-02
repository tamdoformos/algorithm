package importdata;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVHandler {

    public void readCSVFile(String filePath) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = "";
        String csvSeparator = ",";
        while ((line = bufferedReader.readLine()) != null){
            String[] list = line.split(csvSeparator);
            for(String s : list){
                System.out.print(s + " | ");
            }
            System.out.println("");
        }
    }

}
