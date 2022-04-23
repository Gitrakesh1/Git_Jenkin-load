import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GitJenkinLoad {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/selenium/javabykiran-Selenium-Softwares--offline/Offline%20Website/index.html");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button [@type=\"submit\"]")).click();
		String aa=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		AssertJUnit.assertEquals(aa, "Dashboard Courses Offered");
		
}
}