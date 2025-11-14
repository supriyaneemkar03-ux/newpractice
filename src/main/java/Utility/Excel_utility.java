package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utility {
public XSSFWorkbook wb;
public XSSFSheet sheet;
public XSSFCell cell;
public XSSFRow row;
public File f;
public FileInputStream fis;
String path;
public Excel_utility(String path)
{
	this.path= path;
	
}
public int getRows(String sheetname) throws IOException {
	f=new File(path);
	fis=new FileInputStream(f);
	wb=new XSSFWorkbook(fis);
	sheet =wb.getSheet(sheetname);
	int rows=sheet.getLastRowNum();
	return rows;
	
}
public int getCols(String sheetname,int rowNum) throws IOException
{
	f=new File(path);
	fis=new FileInputStream(f);
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(sheetname);
	 row = sheet.getRow(rowNum);
	int cols = row.getLastCellNum();
	return cols;
	
	
}
public String getData (String sheetname, int rownum, int colnum) throws IOException {
	f= new File(path);
	fis = new FileInputStream(f);
	wb = new XSSFWorkbook(fis);
	sheet =wb.getSheet(sheetname);
	String data=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	return data;
	
}
}

