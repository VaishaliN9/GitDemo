package HadleWebTable;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleRadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement bmw= driver.findElement(By.xpath("//input[@id='bmwradio']"));
		bmw.click();
		
		assertTrue(bmw.isSelected());
		
		System.out.println("Completed");
		System.out.println("Completed 1");
		System.out.println("Completed 2");

	}

}
