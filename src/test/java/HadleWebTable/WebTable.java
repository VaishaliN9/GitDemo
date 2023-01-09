package HadleWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		List<WebElement> rowList= driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rowList.size());
		for(int i=1;i<rowList.size();i++)
		{
			if(i==1)
			{
				WebElement author= driver.findElement(By.xpath("//tbody/tr[1]/th[1]"));
				WebElement course= driver.findElement(By.xpath("//tbody/tr[1]/th[2]"));
				WebElement price= driver.findElement(By.xpath("//tbody/tr[1]/th[3]"));
				System.out.println(author.getText()+"   "+course.getText()+"    "+price.getText());
			}
			else
			{
				WebElement authorName= driver.findElement(By.xpath("//tbody/tr["+i+"]/th[1]"));
				WebElement courseName= driver.findElement(By.xpath("//tbody/tr["+i+"]/th[2]"));
				WebElement priceName= driver.findElement(By.xpath("//tbody/tr["+i+"]/th[3]"));
				System.out.println(authorName.getText()+"   "+courseName.getText()+"    "+priceName.getText());
			}
		}
		

	}

}
