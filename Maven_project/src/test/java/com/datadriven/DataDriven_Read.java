package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {
	public static void dD_ParticularData() throws IOException, InvalidFormatException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\DataDriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook s=new XSSFWorkbook(fis);
		Sheet sheetAt = s.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(2);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String Value = cell.getStringCellValue();
			System.out.println(Value);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num=(int) numericCellValue;
			System.out.println(num);
		}
		System.out.println();
	}
	public static void dD_allData() throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\DataDriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook s=new XSSFWorkbook(fis);
		Sheet sheetAt = s.getSheetAt(0);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int NumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < NumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int n=(int) value;
					System.out.println(n);
				}
			}
			System.out.println();
		}
		
	
	}
	public static void dD_particularCell() throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\DataDriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook s=new XSSFWorkbook(fis);
		Sheet sheetAt = s.getSheetAt(0);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
		
			Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String Value = cell.getStringCellValue();
			System.out.println(Value);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num=(int) numericCellValue;
			System.out.println(num);
		}
		}
		System.out.println();
	}
	
		public static void dD_particularRow() throws IOException {
			File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\DataDriven.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook s=new XSSFWorkbook(fis);
			Sheet sheetAt = s.getSheetAt(0);
			Row row = sheetAt.getRow(2);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int i = 0; i < numberOfCells; i++) {
				Cell cell = row.getCell(i);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String Value = cell.getStringCellValue();
					System.out.println(Value);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int num=(int) numericCellValue;
					System.out.println(num);
				}
				}
			
				
			}

		
		

	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		dD_ParticularData();
		dD_allData();
		dD_particularRow();
		dD_particularCell();
	}

}
