package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args){
        String file = "Example.xlsx";
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Login Details");

        Row row1 = sheet.createRow(0);
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("Username");
        Cell cell12 = row1.createCell(1);
        cell12.setCellValue("Password");
        Cell cell13 = row1.createCell(2);
        cell13.setCellValue("Status");

        Row row2 = sheet.createRow(1);
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("HarshuPatil");
        Cell cell22 = row2.createCell(1);
        cell22.setCellValue("1234");
        Cell cell23 = row2.createCell(2);
        cell23.setCellValue("Pass");

        try(FileOutputStream fileOut = new FileOutputStream(file)){
            workbook.write(fileOut);
            System.out.println("Excel file written successfully.");
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
