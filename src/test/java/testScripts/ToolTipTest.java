package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Actions actions = new Actions(driver);
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
        actions.moveToElement(driver.findElement(By.id("age"))).perform();
        String str = driver.findElement(By.className("ui-tooltip-content")).getText();
        System.out.println("Tooltip text is :" + str);
        WebElement age = driver .findElement(By.id("age"));
        age.sendKeys("20");

	}

}
