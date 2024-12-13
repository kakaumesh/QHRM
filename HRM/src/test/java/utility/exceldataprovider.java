package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {
	
	
	  XSSFWorkbook workb; 
	  public void getData() throws IOException 
	  { 
		  
	  String excelpath = System.getProperty("user.dir")+"\\Testdata\\ab.xlsx";
	  //File src = new File(excelpath);
	  FileInputStream file = new FileInputStream(excelpath);
	  workb = new XSSFWorkbook(file);
	  
	  }
	  
	  public String getStringData(String sheetname, int row,int column)
	  {
	  return workb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	  }
	  
	  public String getNumericData(String sheetname, int row,int column) 
	  {   
		  return String.valueOf((long)workb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue());
	  }
	  public String getDateData(String sheetname, int row,int column) 
	  {   
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		  return dateFormat.format(workb.getSheet(sheetname).getRow(row).getCell(column).getDateCellValue());
	  }
	  public String getTimeData(String sheetname, int row,int column) 
	  {   
		  SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		  return dateFormat.format(workb.getSheet(sheetname).getRow(row).getCell(column).getDateCellValue());
	  }
	 
}
