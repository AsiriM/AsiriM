package GitPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.lk");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium HQ");
		driver.findElement(By.id("lst-ib")).submit();
		
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click(); 
				

	}

}
