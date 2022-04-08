package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//file path is given store file in ref file
		FileInputStream myfile=new FileInputStream("C:\\Users\\kale patil\\OneDrive\\Desktop\\Automation setup download\\TestSheet1.xlsx");
//      String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println("Data form Excel is:"+value);
//		double value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
//		System.out.println("Dataform Excel is:"+value1);
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		Row cell = mysheet.getRow(0);
		Cell mycell = cell.getCell(0);
		String myvalue = mycell.getStringCellValue();
		mysheet.getRow(0).getCell(0).getStringCellValue();
		mysheet.getRow(0).getCell(1).getStringCellValue();
	}

}
