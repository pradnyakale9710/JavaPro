package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("C:\\\\\\\\Users\\\\\\\\kale patil\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Automation setup download\\\\\\\\Book5.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
        
        //count Total no rows in Excel Sheet
        int totalnoOfRow = mysheet.getLastRowNum();
        int rowCount = totalnoOfRow;
        System.out.println("Total no of Rows is:"+rowCount);
        
        //count Total no of columns in Excel sheet
        short totalNoOfCol= mysheet.getRow(0).getLastCellNum();
        int colcount = totalNoOfCol-1;
        System.out.println("Total no of column is:"+colcount );
        
        for(int i=0;i<=rowCount;i++)
        {
        	System.out.println();
        	for(int j=0;j<=colcount ;j++)
        	{
        		Cell mycell = mysheet.getRow(i).getCell(j);
        		CellType type = mycell.getCellType();
        		
        		if(type==CellType.STRING)
        		{
        		  String value = mycell.getStringCellValue();
        		  System.out.print(value+" ");
        		}
        		else if(type==CellType.NUMERIC) 
        		{
        			double value1 = mycell.getNumericCellValue();
        			System.out.print(value1+" ");
        		}
        		else if(type==CellType.BOOLEAN) 
        		{
        			 boolean value2 = mycell.getBooleanCellValue();
        			System.out.print(value2+" ");
        		}
        		//System.out.println( );
        	}
        	//System.out.println();
        }
	}

}
