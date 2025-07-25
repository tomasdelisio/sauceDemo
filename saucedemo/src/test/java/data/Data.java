package data;

import org.testng.annotations.DataProvider;

import utils.ExcelUtils;

public class Data {
	/*** VARIABLES ***/
	private static final String base_path = "C:\\Users\\tomas\\Desktop\\Automation\\SauceDemo\\saucedemo\\src\\test\\resources\\data";

	/*** METHODS ***/
	// Read Excel
	public Object[][] data(String path, String sheet) {
		new ExcelUtils(path, sheet);

		int rowCount = ExcelUtils.getRowCount();
		int colCount = ExcelUtils.getColCount();

		Object dt[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = ExcelUtils.getCellData(i, j);

				dt[i - 1][j] = cellData;
			}
		}

		return dt;
		
	}

	// Test Cases
	@DataProvider(name = "Purchase")
	public Object[][] getDataPurchase() {
		String path = "\\purchase\\purchase.xlsx";
		Object dt[][] = data(base_path + path, "Data");

		return dt;
		
	}
}
