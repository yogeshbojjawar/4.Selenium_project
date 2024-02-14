import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoSheets {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C://Users//Yogesh//Downloads//seleniumPractice//XCel sheet selenium.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook();    
        XSSFSheet sheet = workbook.createSheet("Data");  
     
        
        for(int i=0;i<5;i++) {
        XSSFRow	row= sheet.createRow(i);      
        	
            for(int j=0;j<3;j++) {
        	      row.createCell(j).setCellValue("xyz"); 
        }
        }
     workbook.write(file);   //data we created in workbook, now we sent to file
     file.close();
     
     System.out.println("written data into excel sheet is completed    ");
     
     //it override the existing data
	}

}
