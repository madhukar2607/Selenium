package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectvaluedropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.mercurytravels.co.in/");
		WebElement holiday=driver.findElement(By.id("themes"));
		List<WebElement>values=holiday.findElements(By.tagName("option"));
		System.out.println(values.size());
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
		}
		driver.close();	

	}

}
