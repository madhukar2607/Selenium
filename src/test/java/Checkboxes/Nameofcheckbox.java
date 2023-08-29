package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nameofcheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.yatra.com/");
		List<WebElement>check=driver.findElements(By.className("custom-check"));
		System.out.println("no of checkboxes:"+check.size());
		for(int i=0;i<check.size();i++) {
			System.out.println(check.get(i).getAttribute("title"));
		}
		driver.close();

	}

}
