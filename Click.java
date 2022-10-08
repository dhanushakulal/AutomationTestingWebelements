package assessment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Click {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Dhanusha\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   Actions mouse=new Actions(driver);
		   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		   mouse.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).build().perform();
		   //Thread.sleep(1000);
		   driver.findElement(By.xpath("//li[.='Edit']")).click();
		   Alert alert =driver.switchTo().alert();
		   String P=alert.getText();
		   System.out.println(P);
		   alert.accept();
	}
}
