package Text;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofNormaltextBoldtext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("http://demo.guru99.com/test/newtours");
		List<WebElement> ntext=driver.findElements(By.tagName("p"));
		System.out.println("no of total normal text "+""+ntext.size());
		List<WebElement> btext=driver.findElements(By.tagName("b"));
		System.out.println("no of total bold text"+""+btext.size());
		driver.close();
	}

}
