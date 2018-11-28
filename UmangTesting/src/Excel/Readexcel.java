package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			File src = new File ("C:\\apche poi\\Test data.xlsx");
			FileInputStream fis  = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook (fis);
			
			
	}

}
