package HadleWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleScenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
		
		List<WebElement> sellist= driver.findElements(By.xpath("//div[@class='erkvQe']"));
		Thread.sleep(3000);
		for(WebElement Sellist : sellist)
		{
			System.out.println(Sellist.getText());
		}
		System.out.println("Arch 1");
		
		System.out.println("Arch 2");
		System.out.println("Arch 2");
		System.out.println("Arch 2");
		
		

	}

}
