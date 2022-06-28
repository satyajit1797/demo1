package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class myfirstprog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("3322114455");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys("dfajdlfjalsd");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='bp9cbjyn j83agx80 byvelhso l9j0dhe7'])[2]")).click();
		Thread.sleep(2000);
		WebElement demo=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.moveToElement(demo).build().perform();
		WebElement next=driver.findElement(By.xpath(""));
		Select s=new Select(next);
		s.selectByVisibleText("pune");
		
				
		driver.close();
	}

}
