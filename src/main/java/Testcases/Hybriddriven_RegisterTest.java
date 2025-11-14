package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.RegisterPage;
import Utility.Excel_utility;

public class Hybriddriven_RegisterTest extends BaseClass {

    @Test(dataProvider = "registerData")
    public void tc_01(String firstName, String lastName, String email, String password, String confirmPassword) {
        driver.get("http://demowebshop.tricentis.com/register");
        
        RegisterPage rp = new RegisterPage(driver);
        rp.register(firstName, lastName, email, password, confirmPassword);
    }

    @DataProvider(name = "registerData")
    public String[][] getData() throws IOException {
        // Load Excel file
        Excel_utility eu = new Excel_utility("C:\\Users\\neemk\\OneDrive\\Desktop\\Testingsheet.xlsx");

        // Get total number of rows and columns
        int totalRows = eu.getRows("Testing");
        int totalCols = eu.getCols("Testing", 1);

        // Assuming the first row is header, skip it while reading
        String[][] data = new String[totalRows][totalCols];

        // Start loop from row 1 (row 0 = header)
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                data[i - 1][j] = eu.getData("Testing", i, j);
            }
        }

        return data;
    }
}