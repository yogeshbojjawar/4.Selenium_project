import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;    //here i put * in place of xssfworkbook becoz next no nedd to import other classess
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromSheets {

	public static void main(String[] args) throws IOException   {
		
		File excelfile= new File("C:\\\\Users\\\\Yogesh\\\\Downloads\\\\seleniumPractice\\\\XCel sheet selenium.xlsx");
		System.out.println(excelfile.exists());
		
		FileInputStream file = new FileInputStream("C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\XCel sheet selenium.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);    // this workbook under fileinputstream so passed file
        XSSFSheet sheet = workbook.getSheet("Data1");  // provide the sheet name
      //XSSFSheet sheet = workbook.getSheetAt(0)  // or provide the sheet number
        
        //how to count number of rows and column
        int rowcount=sheet.getLastRowNum();
        System.out.println(rowcount);
        
        int colcount= sheet.getRow(0).getLastCellNum(); 
        System.out.println(colcount);
        
        for(int i=0;i<rowcount;i++) {
        XSSFRow	currentrow= sheet.getRow(i);     //focused on current row
        	
            for(int j=0;j<colcount;j++) {
        	      String value = currentrow.getCell(j).toString();  //read the value from a cell 
        	      System.out.print(" "+value);
        }
            System.out.println();
        }
        
 
       
	}

}



