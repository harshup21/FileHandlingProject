package com.tripillar.filehandling.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.io.Writer.*;

public class WriteTextFile {
    public static void main(String[] args){
        String file = "MyFile.txt";
        try{
            BufferedWriter Writer = new BufferedWriter(new FileWriter(file));
            Writer.write("This is MyFile Text ...!!!");
            Writer.write("\nAdded new line to MyFile.");
            Writer.write("\nAnother line is added.");
            System.out.println("Text Successfully Added to File.");
            Writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
