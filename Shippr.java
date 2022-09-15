import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shippr {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='menuBurger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='profileIcon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]\r\n")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/form[1]/div[1]/input[1]")).sendKeys("a@b.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/form[1]/div[2]/input[1]")).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/form[1]/input[1]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
