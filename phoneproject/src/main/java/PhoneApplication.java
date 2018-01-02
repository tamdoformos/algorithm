package main.java;

import importdata.CSVHandler;

public class PhoneApplication {

    public static void main(String[] args) throws Exception{
        System.out.println("Phone system start...");
        String filePath = "phoneproject\\src\\main\\resources\\data.csv";
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.readCSVFile(filePath);
    }
}
