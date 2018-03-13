package it.aimconsulting.utility.utli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import it.aimconsulting.servizi.schema.ADTI.ADTIReport;

import java.util.Collection;

public class WriteData2XLS {
	

	private static final int COLUM_ERR = 0;
	private static final int COLUM_VAL = 0;
	private static final int COLUM_VAL_MAX = 0;
	private static final int COLUM_VAL_MIN = 0;

	/**Scrivo il risultato sul file di output*/
	
	public void manageOutput(Hashtable<Integer, ADTIReport> listaDati,String excelFileName) throws IOException {

		FileInputStream fis = new FileInputStream(new File(excelFileName));
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row1 = sheet.getRow(0);
		XSSFCell cell1 = row1.createCell(COLUM_ERR);
		//imposto intestazione
		cell1.setCellValue("ERRORE");
		cell1 = row1.createCell(COLUM_VAL);
		cell1.setCellValue("RIFERIMENTO");
		cell1 = row1.createCell(COLUM_VAL_MAX);
		cell1.setCellValue("MASSIMO");
		cell1 = row1.createCell(COLUM_VAL_MIN);
		cell1.setCellValue("MINIMO");
		Set<Integer > keys = listaDati.keySet(); 
		for(Integer k:keys){
			//ValutImm v = listaDati.get(k);
		
			row1 = sheet.getRow(k.intValue());
			cell1 = row1.createCell(COLUM_ERR);
			//cell1.setCellValue(v.getErrore());
			cell1 = row1.createCell(COLUM_VAL);
			//cell1.setCellValue(v.getRiferimento());
			cell1 = row1.createCell(COLUM_VAL_MAX);
			//cell1.setCellValue(v.getValMax());
			cell1 = row1.createCell(COLUM_VAL_MIN);
			//cell1.setCellValue(v.getValMin());
		}
		fis.close();
		FileOutputStream fos =new FileOutputStream(new File(excelFileName));
	        workbook.write(fos);
	        fos.close();
		System.out.println("Done");
	
		
	}

}
