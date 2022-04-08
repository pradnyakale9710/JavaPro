package PracticeExcelMock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("C:\\\\Users\\\\kale patil\\\\OneDrive\\\\Desktop\\\\Automation setup download\\\\Book2.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");//get the sheet in file
        //read value in sheet row and col wise by using excel
        String value = mysheet.getRow(0).getCell(0).getStringCellValue();
        String value1 = mysheet.getRow(0).getCell(1).getStringCellValue();
        String value2 = mysheet.getRow(1).getCell(0).getStringCellValue();
        String value3 = mysheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value3);
       
	}

}
