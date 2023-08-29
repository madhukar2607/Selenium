package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statusofradiobuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-3")).click();
        List<WebElement>radios=driver.findElements(By.xpath("//*[@type='radio']"));
        System.out.println(radios.size());
        for(int i=0;i<radios.size();i++) 
        {
        	String name=radios.get(i).getAttribute("value");
        	if(radios.get(i).isSelected())
        	{
        		System.out.println(name+":"+"Active");
        	}
        	else 
        	{
        		System.out.println(name+":"+"unactive");
        	}
        }
           driver.close();
	}

}
