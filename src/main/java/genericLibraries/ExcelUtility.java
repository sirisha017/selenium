package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook wb;
	
	public void excelInitialization(String excelPath) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
       try {
    	   wb = WorkbookFactory.create(fis);
      } catch (EncryptedDocumentException | IOException e) {
    	  e.printStackTrace();
      }
       
  }
	
       public String fetchDatafromExcel(String sheetName, int rowNum, int cellNum) {
    	   return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
      }
       
       public List<String> fetchDataFromExcel(String sheetName) {
    	   List<String> dataList = new ArrayList<>();
    	   Sheet sheet = wb.getSheet(sheetName);
    	   for(int i = 0;i < 4; i++) {
    		   String data = sheet.getRow(i).getCell(1).getStringCellValue();
    		   dataList.add(data);
    	     }
    	   return dataList;
      }
     
       public void closeExcel() {
    	   try {
    		   wb.close();
       } catch (IOException e) {
    	   e.printStackTrace();
       }
    	   
       }
       
	}
	
