package assessment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HRMDashboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dhanusha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	driver.findElement(By.xpath("//div[2]/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("//li[3]/a")).click();
	
	driver.findElement(By.xpath("//li[4]/a")).click();

	driver.findElement(By.xpath("//li[5]/a")).click();
}
}