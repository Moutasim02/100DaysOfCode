package com.moutasim.Day_1;
import java.io.IOException;
import java.io.File; //create files in the machine

public class CreateFile {
	public static void main(String[] args) {
		try {
			//make an instance of the File class with the path
			File myFileName = new File("/home/moutasim/Documents/GitHub/100DaysOfCode/src/com.moutasim.Day_1/TestFile.txt");
			//if you try to use this code, change user from moutasim to yours...
			if (myFileName.createNewFile()) {
				System.out.println("File created:" + myFileName.getName());
			} else {
				System.out.println("File already exists.");
				System.out.println(myFileName.getAbsolutePath());
			}
		} catch (IOException e){
			System.out.print("Error");
			e.printStackTrace();
		}
		// Don't forget that you can get the name of the file from user input with
		// scanner class, and you can specify the path too
	}

}
