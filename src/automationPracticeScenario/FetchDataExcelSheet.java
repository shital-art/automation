package automationPracticeScenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataExcelSheet {
	public static void main(String[] args) throws IOException {
		String path="D:\\webdriver\\Saucdemoprogect.xlsx\\";
		
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		//sheet read
		XSSFSheet sht=wb.getSheet("saucpp");
		
//		//row read
	//	XSSFRow row=sht.getRow(0);
//		
//		//cell read
//		XSSFCell cell=row.getCell(0);
//		
//		String result=cell.getStringCellValue();
//		
//		System.out.println(result);
//		
//XSSFRow row1=sht.getRow(1);
//		
//		//cell read
//		XSSFCell cell1=row1.getCell(0);
//		
//		String result1=cell1.getStringCellValue();
//		
//		System.out.println(result1);
		//using methodChining-to fetch the data
//		String Result=wb.getSheet("saucpp").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(Result);
		for(int i=0;i<=3;i++)
			{
				for(int j=0;j<=1;j++)
				{
				String result=	wb.getSheet("saucpp").getRow(i).getCell(j).getStringCellValue();
				System.out.println(result);
//					XSSFRow rw=sht.getRow(i);
//					XSSFCell cell=rw.getCell(j);
//					String result=cell.getStringCellValue();
//					System.out.println(result);
				}
			}
		
	}

		
	

}
