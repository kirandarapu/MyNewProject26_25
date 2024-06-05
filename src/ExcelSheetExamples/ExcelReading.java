package ExcelSheetExamples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		
		//reading the data from the excel 
		//convert the excel sheet into reading mode
		FileInputStream fis=new FileInputStream("D:\\SeleniumPracticeWork\\SeleniumExamples\\Testdata\\ExcelReading.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		//identify the rows and columns
		
		int rows=sheet.getLastRowNum();//total no of rows in the excel sheet
		
		int columns=sheet.getRow(1).getLastCellNum();//total no of columns
		
		System.out.println(rows);
		System.out.println(columns);
		
		
		

	}

}
