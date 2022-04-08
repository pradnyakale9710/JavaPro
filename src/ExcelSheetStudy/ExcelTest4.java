package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read value and type of value in excel sheet
		FileInputStream myfile=new FileInputStream("C:\\\\Users\\\\kale patil\\\\OneDrive\\\\Desktop\\\\Automation setup download\\\\Book1.xlsx");
         Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
         CellType type1 = mysheet.getRow(0).getCell(0).getCellType();
         CellType type2 = mysheet.getRow(0).getCell(1).getCellType();
         CellType type3 = mysheet.getRow(0).getCell(2).getCellType();
         System.out.println(type1);
         System.out.println(type2);
         System.out.println(type3);
         String value1 = mysheet.getRow(0).getCell(0).getStringCellValue();	
         double value2 = mysheet.getRow(0).getCell(1).getNumericCellValue();
         boolean value3 = mysheet.getRow(0).getCell(2).getBooleanCellValue();
         System.out.println("first call value is:"+value1);
         System.out.println("second call value is:"+value2);
         System.out.println("third cell value is:"+value3);
         }

}
