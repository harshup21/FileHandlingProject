package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String [] args){
        String file = "Example.xlsx";
        try (FileInputStream fin = new FileInputStream(file)){
            Workbook workbook = new XSSFWorkbook(fin);
                Sheet sheet = workbook.getSheetAt(0);
                for (Row row : sheet){
                    for (Cell cell : row){
                        switch (cell.getCellType()){
                            case STRING: System.out.println(cell.getStringCellValue() + "\t");
                                         break;
                            case NUMERIC: System.out.println(cell.getNumericCellValue() + "\t");
                                          break;
                            case BOOLEAN: System.out.println(cell.getBooleanCellValue() + "\t");
                                          break;
                            default: System.out.println("Invalid Type");
                        }
                    }
                    System.out.println();
                    workbook.close();
    }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
