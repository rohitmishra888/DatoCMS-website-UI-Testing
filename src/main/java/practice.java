import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.datocms.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele1 = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[5]/div[9]/div[1]/div[1]/div[2]/img[1]"));
		//WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Subscribe!')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele1);
		System.out.println(ele1.isDisplayed());
		//ele.click();
	}

}
