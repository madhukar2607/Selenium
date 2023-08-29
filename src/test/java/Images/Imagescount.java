package Images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagescount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for(int i=0;i<images.size();i++) {
			System.out.println(i+""+images.get(i).getAttribute("src"));
		}
        driver.close();
	}

}
