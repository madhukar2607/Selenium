package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.yatra.com/");
		driver.findElement(By.xpath("//*[@title='Student Fare Offer']")).click();
		List<WebElement>check=driver.findElements(By.className("custom-check"));
		System.out.println("no of checkboxes:"+check.size());
		for(int i=0;i<check.size();i++) {
			String name=check.get(i).getAttribute("title");
			if(check.get(i).isSelected())
	    	 {
	    		 System.out.println(name+" "+ "Active");
	    	 }
	    	 else {
	    		 System.out.println(name+" "+ "unActive");
	    	 }
	       }
	       driver.close();
		}
	}

	
