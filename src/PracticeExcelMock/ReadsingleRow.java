package PracticeExcelMock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadsingleRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("C:\\\\\\\\Users\\\\\\\\kale patil\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Automation setup download\\\\\\\\Book4.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
        for(int i=0;i<=4;i++)
        {
        	for(int j=0;j<=2;j++)
        	{
        	String value = mysheet.getRow(i).getCell(j).getStringCellValue();
        	System.out.print(value+" ");
        	}
        	System.out.println( );
        }
	}

}
