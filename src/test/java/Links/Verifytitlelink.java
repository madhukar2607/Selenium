package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitlelink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
       String actual= driver.findElement(By.linkText("Gmail")).getText();
        String expected = "l";
        
        System.out.println(actual);
        if (actual.contains(expected)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        }
       driver.close(); 
	}

}
