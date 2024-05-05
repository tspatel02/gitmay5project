/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author itexps
 */
public class GoogleSearchTest {
     private WebDriver driver;
     
    public GoogleSearchTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
     @Test
    public void testGoogleSearch() {
        // Open Google
        driver.get("https://www.google.com");

        // Find the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter a search query
        searchBox.sendKeys("TestNG");

        // Submit the search query
        searchBox.submit();

        // Verify the search results page title contains the search query
        assertTrue(driver.getTitle().contains("TestNG"));
    }
}
