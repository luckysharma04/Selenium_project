import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.findElement(new By.ByCssSelector("input[name=q]")).sendKeys("To The New");
        driver.findElement(new By.ByCssSelector("input[name=q]")).sendKeys(Keys.ENTER);

    }
}