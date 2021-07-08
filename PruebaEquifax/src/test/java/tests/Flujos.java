package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flujos {
	//Variables
	private WebDriver driver;
	private static final String TIPO_DRIVER = "webDriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	private String URL = "http://advantageonlineshopping.com/#/";
	
	@BeforeClass
	public static void setUpBeforeClass()
	{
		System.out.println("Inicio de flujos");
		System.setProperty(TIPO_DRIVER, PATH_DRIVER);
	}
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@Test
	public void flujo01()
	{
		driver.findElement(By.linkText("SPECIAL OFFER")).click();
		driver.findElement(By.id("see_offer_btn")).click();
	    driver.findElement(By.xpath("(//span[@id=\'bunny\'])[2]")).click();
	    driver.findElement(By.name("save_to_cart")).click();
	}
	
	@Test
	public void flujo02()
	{
		driver.get("http://advantageonlineshopping.com/#/");
	    driver.findElement(By.linkText("POPULAR ITEMS")).click();
	    driver.findElement(By.id("details_16")).click();
	    driver.findElement(By.name("save_to_cart")).click();
	    driver.findElement(By.id("checkOutPopUp")).click();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterClass
	public static void tearDownAfterClass()
	{
		System.out.println("Finalizan los flujos");
	}
}
