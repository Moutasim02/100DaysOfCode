package com.moutasim.Day_1;

import java.io.IOException;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writeToThisFile = new FileWriter("/home/moutasim/Documents/GitHub/100DaysOfCode/src/com.moutasim.Day_1/TestFile.txt");
            writeToThisFile.write("This is a sample text, expected to be written"
            + " to in the test file");
            writeToThisFile.close();
            System.out.println("Success");

        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
