package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Write {
public static void dd_Write() throws IOException {
	File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\DataDriven.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet createSheet = w.createSheet("Data");
	Row row = createSheet.createRow(0);
	Cell createcell = row.createCell(0);
	createcell.setCellValue("name");
	w.getSheet("data").getRow(0).createCell(1).setCellValue("marks");
	w.getSheet("Data").createRow(1).createCell(0).setCellValue("swathi");
	w.getSheet("Data").getRow(1).createCell(1).setCellValue("90");
	w.getSheet("Data").createRow(2).createCell(0).setCellValue("archana");
	w.getSheet("Data").getRow(2).createCell(1).setCellValue("100");
	w.getSheet("Data").createRow(3).createCell(0).setCellValue("sowmiya");
	w.getSheet("Data").getRow(3).createCell(1).setCellValue("89");
	w.getSheet("Data").createRow(4).createCell(0).setCellValue("sudha");
	w.getSheet("Data").getRow(4).createCell(1).setCellValue("98");
	FileOutputStream fos=new FileOutputStream(f);
	w.write(fos);
	w.close();
}
public static void main(String[] args) throws IOException {
	dd_Write();
}
}
