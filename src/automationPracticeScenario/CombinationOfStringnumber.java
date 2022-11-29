package automationPracticeScenario;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CombinationOfStringnumber {
	public static void main(String[] args) throws IOException {
		String path="D:\\webdriver\\Saucdemoprogect.xlsx\\";
		
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		//sheet read
		XSSFSheet sht=wb.getSheet("saucpp");
		long result= (long) wb.getSheet("saucpp").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(result);
		
	
	}
}
