package amazon;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_project_1 {
	
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			
			driver.get("https://www.amazon.in/");
			
			
			driver.findElement(By.linkText("Mobiles")).click();
			
			
			WebElement mobiles = driver.findElement(By.cssSelector("#nav-subnav>a:nth-child(2)>span.nav-a-content"));
							
			Actions actions = new Actions(driver);
			actions.moveToElement(mobiles).build().perform();
					
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apple")));
					
					
			
			driver.findElement(By.linkText("Apple")).click();
					
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/span/a/div/img")).click();
			ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
					

			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.id("buy-now-button")).click();
					
			WebElement signInElement=driver.findElement(By.id("ap_email"));
			if(signInElement.isDisplayed())
					{
						System.out.println("user not signed");
					}
					else
					{
						System.out.println("user is signed");
					}
									
	}
			
	}
